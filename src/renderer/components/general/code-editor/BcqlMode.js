// eslint-disable-next-line max-classes-per-file
import 'ace-builds/src-noconflict/mode-java';

const { MatchingBraceOutdent } = window.ace.acequire(
  'ace/mode/matching_brace_outdent'
);
const BcqlFoldMode = window.ace.acequire('ace/mode/folding/cstyle').FoldMode;
const BcqlBehaviour = window.ace.acequire(
  'ace/mode/behaviour/cstyle'
).CstyleBehaviour;

/**
 * The syntax highlighting rules are based on
 * Blockchain-Logging-Framework/src/main/antlr4/blf/grammar/*,
 * Blockchain-Logging-Framework/src/main/java/blf/library/Library.java
 * and https://docs.soliditylang.org/en/develop/abi-spec.html*
 */
export class BcqlHighlightRules extends window.ace.acequire(
  'ace/mode/text_highlight_rules'
).TextHighlightRules {
  constructor() {
    super();

    const byteN = () => {
      let res = '';
      for (let i = 1; i <= 32; i += 1) {
        res += `byte${i}|`;
      }
      return res;
    };

    const bytesN = () => {
      let res = '';
      for (let i = 1; i <= 32; i += 1) {
        res += `bytes${i}|`;
      }
      return res;
    };

    const uintN = () => {
      let res = '';
      for (let i = 8; i <= 256; i += 8) {
        res += `uint${i}|`;
      }
      return res;
    };

    const intN = () => {
      let res = '';
      for (let i = 8; i <= 256; i += 8) {
        res += `int${i}|`;
      }
      return res;
    };

    const types =
      `byte|${byteN()}bytes|${bytesN()}` +
      `uint|${uintN()}int|${intN()}` +
      'address|bool|string|function|indexed|' +
      'BLOCKS|TRANSACTIONS|SMART CONTRACT|LOG ENTRIES|' +
      'TRANSACTION INPUT|IF|EMIT|CSV ROW|LOG LINE|XES EVENT|XES TRACE';

    const buildinConstants = 'null|EARLIEST|CURRENT|CONTINUOUS|ANY';

    const methods =
      'add(x, y)|multiply(x, y)|subtract(x, y)|divide(x, y)|' +
      'contains(X, x)|remove(X, x)|mapValue(x, y, X, Y)|mapBits(x, y, z, X)|' +
      'get(X, x)|clear(X)|reduceToSum(X)|reduceToProduct(X)|reduceToString(X)|' +
      'split(X, y)|length(X)|match(X, regx)|replaceFirst(X, y, z)|replaceAll(X, y, z)|readIn(filePath)' +
      'newBoolArray()|newIntArray()|newStringArray()|newAddressArray()|newByteArray()';

    const keywordMapper = this.createKeywordMapper(
      {
        keyword: types,
        'constant.language': buildinConstants,
        'support.function': methods,
        'constant.language.boolean': 'true|false',
      },
      'identifier'
    );

    this.$rules = {
      start: [
        {
          token: 'comment',
          regex: '\\/\\/.*$',
        },
        {
          token: 'comment', // multi line comment
          regex: '\\/\\*',
          next: 'comment',
        },
        {
          token: 'string', // single line
          regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]',
        },
        {
          token: 'keyword',
          regex:
            /(?:SET|BLOCKCHAIN|OUTPUT FOLDER|CONNECTION|IPC|EMISSION MODE|ABORT ON EXCEPTION|BLOCKS|TRANSACTIONS|SMART CONTRACT|LOG ENTRIES|TRANSACTION INPUT|IF|EMIT|CSV ROW|LOG LINE|XES EVENT|XES TRACE)\b/,
          caseInsensitive: false,
        },
        {
          token: 'constant.numeric', // hex
          regex:
            /0(?:[xX][0-9a-fA-F][0-9a-fA-F_]*|[bB][01][01_]*)[LlSsDdFfYy]?\b/,
        },
        {
          token: 'constant.numeric', // float
          regex:
            /[+-]?\d[\d_]*(?:(?:\.[\d_]*)?(?:[eE][+-]?[\d_]+)?)?[LlSsDdFfYy]?\b/,
        },
        {
          token: 'constant.language.boolean',
          regex: '(?:true|false)\\b',
        },
        {
          token: keywordMapper,
          regex: '[a-zA-Z_$][a-zA-Z0-9_$]*\\b',
        },
        {
          token: 'lparen',
          regex: '[[({]',
        },
        {
          token: 'rparen',
          regex: '[\\])}]',
        },
        {
          token: 'text',
          regex: '\\s+',
        },
      ],
      comment: [
        {
          token: 'comment', // closing comment
          regex: '\\*\\/',
          next: 'start',
        },
        {
          defaultToken: 'comment',
        },
      ],
    };
  }
}

export default class BcqlMode extends window.ace.acequire('ace/mode/text')
  .Mode {
  constructor() {
    super();
    this.HighlightRules = BcqlHighlightRules;
    this.$behaviour = new BcqlBehaviour();
    this.$outdent = new MatchingBraceOutdent();
    this.foldingRules = new BcqlFoldMode();
  }
}
