import * as React from 'react';
import PropTypes from 'prop-types';

import AceEditor from 'react-ace';
import BcqlMode from './BcqlMode';
import 'ace-builds/src-noconflict/theme-eclipse';
import 'ace-builds/src-min-noconflict/ext-language_tools';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function CodeEditor(props: any) {
  const { value, onChange, readOnly } = props;

  const aceEditor = React.useRef<AceEditor>(null);

  React.useEffect(() => {
    if (aceEditor.current != null) {
      const customMode = new BcqlMode();
      aceEditor.current.editor.getSession().setMode(customMode);
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
    />
  );
}

CodeEditor.propTypes = {
  value: PropTypes.string.isRequired,
  onChange: PropTypes.func.isRequired,
  readOnly: PropTypes.bool.isRequired,
};

export default CodeEditor;
