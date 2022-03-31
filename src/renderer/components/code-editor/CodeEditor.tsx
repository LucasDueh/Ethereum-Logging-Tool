import * as React from 'react';
import PropTypes from 'prop-types';

import AceEditor from 'react-ace';
import BcqlMode from './BcqlMode';
import 'ace-builds/src-noconflict/theme-eclipse';
import 'ace-builds/src-min-noconflict/ext-language_tools';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function CodeEditor(props: any) {
  const { isManifestEditor, value, onChange, readOnly, maxLines } = props;

  const aceEditor = React.useRef<AceEditor>(null);

  React.useEffect(() => {
    const { editor } = aceEditor.current as AceEditor;
    if (editor != null) {
      const customMode = new BcqlMode();
      editor.getSession().setMode(customMode);

      if (isManifestEditor) {
        editor.commands.on('exec', (event: React.KeyboardEvent) => {
          const rowCol = editor.selection.getCursor();
          if ([0, 1, 2, 3, 4].includes(rowCol.row)) {
            event.preventDefault();
            event.stopPropagation();
          }
        });
      }
    }
  });

  return (
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
        borderRadius: '4px',
      }}
      enableBasicAutocompletion
      enableLiveAutocompletion
      maxLines={maxLines}
    />
  );
}

CodeEditor.defaultProps = {
  isManifestEditor: false,
  maxLines: undefined,
  onChange: () => {},
  readOnly: false,
};

CodeEditor.propTypes = {
  isManifestEditor: PropTypes.bool,
  value: PropTypes.string.isRequired,
  onChange: PropTypes.func,
  readOnly: PropTypes.bool,
  maxLines: PropTypes.number,
};

export default CodeEditor;
