// eslint-disable-next-line max-classes-per-file
import 'ace-builds/src-noconflict/mode-java';

export class BcqlHighlightRules extends window.ace.acequire(
  'ace/mode/text_highlight_rules'
).TextHighlightRules {
  constructor() {
    super();
    this.$rules = {
      start: [
        {
          token: 'comment',
          regex: '#.*$',
        },
        {
          token: 'string',
          regex: '".*?"',
        },
      ],
    };
  }
}

export default class BcqlMode extends window.ace.acequire('ace/mode/java')
  .Mode {
  constructor() {
    super();
    this.HighlightRules = BcqlHighlightRules;
  }
}
