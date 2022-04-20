import * as React from 'react';
import PropTypes from 'prop-types';
import { IconButton, Box } from '@mui/material';
import CopyIcon from '@mui/icons-material/ContentCopyRounded';

import AceEditor from 'react-ace';
import BcqlMode from './BcqlMode';
import 'ace-builds/src-noconflict/theme-eclipse';
import 'ace-builds/src-min-noconflict/ext-language_tools';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function CodeEditor(props: any) {
  const {
    isManifestEditor,
    value,
    onChange,
    readOnly,
    maxLines,
    highlightActiveLine,
  } = props;

  const aceEditor = React.useRef<AceEditor>(null);

  const copyCode = () => {
    navigator.clipboard.writeText(value);
  };

  React.useEffect(() => {
    const { editor } = aceEditor.current as AceEditor;
    if (editor != null) {
      const customMode = new BcqlMode();
      editor.getSession().setMode(customMode);

      editor.setOptions({
        showFoldWidgets: false,
        highlightActiveLine,
        highlightGutterLine: highlightActiveLine,
        highlightSelectedWord: highlightActiveLine,
      });

      // Disable the removal of settings code in the manifest editor
      if (isManifestEditor) {
        // eslint-disable-next-line @typescript-eslint/no-explicit-any
        editor.commands.on('exec', (event: any) => {
          const rowCol = editor.selection.getCursor();
          if (
            [0, 1, 2, 3, 4, 5].includes(rowCol.row) ||
            [0, 1, 2, 3, 4, 5].includes(editor.selection.getRange().end.row) ||
            event.command.name === 'selectall'
          ) {
            event.preventDefault();
            event.stopPropagation();
          }
        });
      }
    }
  });

  return (
    <>
      <Box
        sx={{
          position: 'absolute',
          right: '1px',
          top: '1px',
          zIndex: 1000,
        }}
      >
        <IconButton
          sx={{
            backgroundColor: 'rgba(240, 240, 240, .90)',
            borderRadius: 2,
            '&.MuiButtonBase-root:hover': {
              bgcolor: 'rgba(220, 220, 220, .95)',
            },
          }}
          size="small"
          onClick={copyCode}
        >
          <CopyIcon style={{ fontSize: 20 }} />
        </IconButton>
      </Box>
      <AceEditor
        ref={aceEditor}
        value={value}
        onChange={onChange}
        readOnly={readOnly}
        mode="text"
        theme="eclipse"
        name="ace"
        height="100%"
        tabSize={2}
        editorProps={{ $blockScrolling: true }}
        style={{
          width: '100%',
          borderRadius: '1px',
        }}
        enableBasicAutocompletion
        enableLiveAutocompletion
        maxLines={maxLines}
      />
    </>
  );
}

CodeEditor.defaultProps = {
  isManifestEditor: false,
  maxLines: undefined,
  onChange: () => {},
  readOnly: false,
  highlightActiveLine: true,
};

CodeEditor.propTypes = {
  isManifestEditor: PropTypes.bool,
  value: PropTypes.string.isRequired,
  onChange: PropTypes.func,
  readOnly: PropTypes.bool,
  maxLines: PropTypes.number,
  highlightActiveLine: PropTypes.bool,
};

export default CodeEditor;
