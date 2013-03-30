// Generated from ./CoarseFunctionGrammar.g4 by ANTLR 4.0

	package antlr;


  import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoarseFunctionGrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__53=1, T__52=2, T__51=3, T__50=4, T__49=5, T__48=6, T__47=7, T__46=8, 
		T__45=9, T__44=10, T__43=11, T__42=12, T__41=13, T__40=14, T__39=15, T__38=16, 
		T__37=17, T__36=18, T__35=19, T__34=20, T__33=21, T__32=22, T__31=23, 
		T__30=24, T__29=25, T__28=26, T__27=27, T__26=28, T__25=29, T__24=30, 
		T__23=31, T__22=32, T__21=33, T__20=34, T__19=35, T__18=36, T__17=37, 
		T__16=38, T__15=39, T__14=40, T__13=41, T__12=42, T__11=43, T__10=44, 
		T__9=45, T__8=46, T__7=47, T__6=48, T__5=49, T__4=50, T__3=51, T__2=52, 
		T__1=53, T__0=54, IF=55, ELSE=56, FOR=57, WHILE=58, BREAK=59, CASE=60, 
		CONTINUE=61, SWITCH=62, DO=63, GOTO=64, RETURN=65, TYPEDEF=66, VOID=67, 
		UNSIGNED=68, SIGNED=69, LONG=70, CV_QUALIFIER=71, VIRTUAL=72, TRY=73, 
		CATCH=74, THROW=75, USING=76, NAMESPACE=77, AUTO=78, REGISTER=79, OPERATOR=80, 
		TEMPLATE=81, CLASS_KEY=82, ALPHA_NUMERIC=83, OPENING_CURLY=84, CLOSING_CURLY=85, 
		PRE_IF=86, PRE_ELSE=87, PRE_ENDIF=88, HEX_LITERAL=89, DECIMAL_LITERAL=90, 
		OCTAL_LITERAL=91, FLOATING_POINT_LITERAL=92, CHAR=93, STRING=94, COMMENT=95, 
		WHITESPACE=96, CPPCOMMENT=97, OTHER=98;
	public static final String[] tokenNames = {
		"<INVALID>", "'&'", "'*'", "'['", "'--'", "'<'", "'!='", "'<='", "'<<'", 
		"'->'", "'%'", "'*='", "')'", "'inline'", "'explicit'", "'::'", "'='", 
		"'|='", "'new'", "'|'", "'!'", "'<<='", "']'", "'->*'", "'-='", "'public'", 
		"','", "'-'", "'('", "':'", "'&='", "'private'", "'?'", "'>>='", "'+='", 
		"'^='", "'friend'", "'++'", "'static'", "'>>'", "'^'", "'delete'", "'.'", 
		"'+'", "'protected'", "';'", "'&&'", "'||'", "'>'", "'%='", "'/='", "'=='", 
		"'/'", "'~'", "'>='", "'if'", "'else'", "'for'", "'while'", "'break'", 
		"'case'", "'continue'", "'switch'", "'do'", "'goto'", "'return'", "'typedef'", 
		"'void'", "'unsigned'", "'signed'", "'long'", "CV_QUALIFIER", "'virtual'", 
		"'try'", "'catch'", "'throw'", "'using'", "'namespace'", "'auto'", "'register'", 
		"'operator'", "'template'", "CLASS_KEY", "ALPHA_NUMERIC", "'{'", "'}'", 
		"PRE_IF", "PRE_ELSE", "PRE_ENDIF", "HEX_LITERAL", "DECIMAL_LITERAL", "OCTAL_LITERAL", 
		"FLOATING_POINT_LITERAL", "CHAR", "STRING", "COMMENT", "WHITESPACE", "CPPCOMMENT", 
		"OTHER"
	};
	public static final int
		RULE_coarse_content = 0, RULE_unary_operator = 1, RULE_relational_operator = 2, 
		RULE_constant = 3, RULE_function_decl_specifiers = 4, RULE_ptr_operator = 5, 
		RULE_access_specifier = 6, RULE_operator = 7, RULE_assignment_operator = 8, 
		RULE_equality_operator = 9, RULE_template_decl_start = 10, RULE_template_param_list = 11, 
		RULE_no_brackets = 12, RULE_no_brackets_curlies_or_squares = 13, RULE_no_brackets_or_semicolon = 14, 
		RULE_no_angle_brackets_or_brackets = 15, RULE_no_curlies = 16, RULE_no_squares = 17, 
		RULE_no_squares_or_semicolon = 18, RULE_no_comma_or_semicolon = 19, RULE_assign_water = 20, 
		RULE_assign_water_l2 = 21, RULE_water = 22, RULE_expr = 23, RULE_assign_expr = 24, 
		RULE_conditional_expression = 25, RULE_or_expression = 26, RULE_and_expression = 27, 
		RULE_inclusive_or_expression = 28, RULE_exclusive_or_expression = 29, 
		RULE_bit_and_expression = 30, RULE_equality_expression = 31, RULE_relational_expression = 32, 
		RULE_shift_expression = 33, RULE_additive_expression = 34, RULE_multiplicative_expression = 35, 
		RULE_cast_expression = 36, RULE_cast_target = 37, RULE_unary_expression = 38, 
		RULE_inc_dec = 39, RULE_unary_operators = 40, RULE_field = 41, RULE_function_argument_list = 42, 
		RULE_function_argument = 43, RULE_postfix = 44, RULE_primary_expression = 45, 
		RULE_init_declarator = 46, RULE_type_suffix = 47, RULE_simple_decl = 48, 
		RULE_var_decl = 49, RULE_init_declarator_list = 50, RULE_initializer = 51, 
		RULE_initializer_list = 52, RULE_class_def = 53, RULE_class_name = 54, 
		RULE_base_classes = 55, RULE_base_class = 56, RULE_type_name = 57, RULE_base_type = 58, 
		RULE_param_decl_specifiers = 59, RULE_parameter_name = 60, RULE_param_type_list = 61, 
		RULE_param_type = 62, RULE_param_type_id = 63, RULE_identifier = 64, RULE_number = 65, 
		RULE_ptrs = 66;
	public static final String[] ruleNames = {
		"coarse_content", "unary_operator", "relational_operator", "constant", 
		"function_decl_specifiers", "ptr_operator", "access_specifier", "operator", 
		"assignment_operator", "equality_operator", "template_decl_start", "template_param_list", 
		"no_brackets", "no_brackets_curlies_or_squares", "no_brackets_or_semicolon", 
		"no_angle_brackets_or_brackets", "no_curlies", "no_squares", "no_squares_or_semicolon", 
		"no_comma_or_semicolon", "assign_water", "assign_water_l2", "water", "expr", 
		"assign_expr", "conditional_expression", "or_expression", "and_expression", 
		"inclusive_or_expression", "exclusive_or_expression", "bit_and_expression", 
		"equality_expression", "relational_expression", "shift_expression", "additive_expression", 
		"multiplicative_expression", "cast_expression", "cast_target", "unary_expression", 
		"inc_dec", "unary_operators", "field", "function_argument_list", "function_argument", 
		"postfix", "primary_expression", "init_declarator", "type_suffix", "simple_decl", 
		"var_decl", "init_declarator_list", "initializer", "initializer_list", 
		"class_def", "class_name", "base_classes", "base_class", "type_name", 
		"base_type", "param_decl_specifiers", "parameter_name", "param_type_list", 
		"param_type", "param_type_id", "identifier", "number", "ptrs"
	};

	@Override
	public String getGrammarFileName() { return "CoarseFunctionGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	            public boolean skipToEndOfObject()
	            {
	                Stack<Object> CurlyStack = new Stack<Object>();
	                Object o = new Object();
	                int t = _input.LA(1);

	                while(t != EOF && !(CurlyStack.empty() && t == CLOSING_CURLY)){
	                    
	                    if(t == PRE_ELSE){
	                        Stack<Object> ifdefStack = new Stack<Object>();
	                        consume();
	                        t = _input.LA(1);
	                        
	                        while(t != EOF && !(ifdefStack.empty() && (t == PRE_ENDIF))){
	                            if(t == PRE_IF)
	                                ifdefStack.push(o);
	                            else if(t == PRE_ENDIF)
	                                ifdefStack.pop();
	                            consume();
	                            t = _input.LA(1);
	                        }
	                    }
	                    
	                    if(t == OPENING_CURLY)
	                        CurlyStack.push(o);
	                    else if(t == CLOSING_CURLY)
	                        CurlyStack.pop();
	                    
	                    consume();
	                    t = _input.LA(1);
	                }
	                if(t != EOF)
	                    consume();
	                return true;
	            }

	   // this should go into FunctionGrammar but ANTLR fails
	   // to join the parser::members-section on inclusion
	   
	   public boolean preProcSkipToEnd()
	   {
	                Stack<Object> CurlyStack = new Stack<Object>();
	                Object o = new Object();
	                int t = _input.LA(1);

	                while(t != EOF && !(CurlyStack.empty() && t == PRE_ENDIF)){
	                                        
	                    if(t == PRE_IF)
	                        CurlyStack.push(o);
	                    else if(t == PRE_ENDIF)
	                        CurlyStack.pop();
	                    
	                    consume();
	                    t = _input.LA(1);
	                }
	                if(t != EOF)
	                    consume();
	                return true;
	   }


	public CoarseFunctionGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Coarse_contentContext extends ParserRuleContext {
		public List<WaterContext> water() {
			return getRuleContexts(WaterContext.class);
		}
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Simple_declContext simple_decl(int i) {
			return getRuleContext(Simple_declContext.class,i);
		}
		public TerminalNode EOF() { return getToken(CoarseFunctionGrammarParser.EOF, 0); }
		public List<Simple_declContext> simple_decl() {
			return getRuleContexts(Simple_declContext.class);
		}
		public WaterContext water(int i) {
			return getRuleContext(WaterContext.class,i);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public Coarse_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coarse_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterCoarse_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitCoarse_content(this);
		}
	}

	public final Coarse_contentContext coarse_content() throws RecognitionException {
		Coarse_contentContext _localctx = new Coarse_contentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_coarse_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 53) | (1L << 54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH) | (1L << DO))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (OTHER - 64)) | (1L << (20 - 64)) | (1L << (27 - 64)) | (1L << (28 - 64)) | (1L << (37 - 64)) | (1L << (43 - 64)) | (1L << (53 - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
				{
				setState(137);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(134); simple_decl();
					}
					break;

				case 2:
					{
					setState(135); unary_expression();
					}
					break;

				case 3:
					{
					setState(136); water();
					}
					break;
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 20) | (1L << 27) | (1L << 43) | (1L << 53))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_operatorContext extends ParserRuleContext {
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitRelational_operator(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 48) | (1L << 54))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(CoarseFunctionGrammarParser.CHAR, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(CoarseFunctionGrammarParser.OCTAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(CoarseFunctionGrammarParser.HEX_LITERAL, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(CoarseFunctionGrammarParser.FLOATING_POINT_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(CoarseFunctionGrammarParser.DECIMAL_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(CoarseFunctionGrammarParser.STRING, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (HEX_LITERAL - 89)) | (1L << (DECIMAL_LITERAL - 89)) | (1L << (OCTAL_LITERAL - 89)) | (1L << (FLOATING_POINT_LITERAL - 89)) | (1L << (CHAR - 89)) | (1L << (STRING - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_decl_specifiersContext extends ParserRuleContext {
		public Function_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterFunction_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitFunction_decl_specifiers(this);
		}
	}

	public final Function_decl_specifiersContext function_decl_specifiers() throws RecognitionException {
		Function_decl_specifiersContext _localctx = new Function_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !(((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (13 - 13)) | (1L << (14 - 13)) | (1L << (36 - 13)) | (1L << (38 - 13)) | (1L << (VIRTUAL - 13)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ptr_operatorContext extends ParserRuleContext {
		public Ptr_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptr_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterPtr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitPtr_operator(this);
		}
	}

	public final Ptr_operatorContext ptr_operator() throws RecognitionException {
		Ptr_operatorContext _localctx = new Ptr_operatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !(_la==1 || _la==2) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_specifierContext extends ParserRuleContext {
		public Access_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterAccess_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitAccess_specifier(this);
		}
	}

	public final Access_specifierContext access_specifier() throws RecognitionException {
		Access_specifierContext _localctx = new Access_specifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 25) | (1L << 31) | (1L << 44))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operator);
		int _la;
		try {
			setState(201);
			switch (_input.LA(1)) {
			case 18:
			case 41:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(156);
				_la = _input.LA(1);
				if ( !(_la==18 || _la==41) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(159);
				_la = _input.LA(1);
				if (_la==3) {
					{
					setState(157); match(3);
					setState(158); match(22);
					}
				}

				}
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 2);
				{
				setState(161); match(43);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 3);
				{
				setState(162); match(27);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 4);
				{
				setState(163); match(2);
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 5);
				{
				setState(164); match(52);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 6);
				{
				setState(165); match(10);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 7);
				{
				setState(166); match(40);
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 8);
				{
				setState(167); match(1);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 9);
				{
				setState(168); match(19);
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 10);
				{
				setState(169); match(53);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 11);
				{
				setState(170); match(20);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 12);
				{
				setState(171); match(16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 13);
				{
				setState(172); match(5);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 14);
				{
				setState(173); match(48);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 15);
				{
				setState(174); match(34);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 16);
				{
				setState(175); match(24);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 17);
				{
				setState(176); match(11);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 18);
				{
				setState(177); match(50);
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 19);
				{
				setState(178); match(49);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 20);
				{
				setState(179); match(35);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 21);
				{
				setState(180); match(30);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 22);
				{
				setState(181); match(17);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 23);
				{
				setState(182); match(39);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 24);
				{
				setState(183); match(8);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 25);
				{
				setState(184); match(33);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 26);
				{
				setState(185); match(21);
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 27);
				{
				setState(186); match(51);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 28);
				{
				setState(187); match(6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 29);
				{
				setState(188); match(7);
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 30);
				{
				setState(189); match(54);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 31);
				{
				setState(190); match(46);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 32);
				{
				setState(191); match(47);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 33);
				{
				setState(192); match(37);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 34);
				{
				setState(193); match(4);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 35);
				{
				setState(194); match(26);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 36);
				{
				setState(195); match(23);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 37);
				{
				setState(196); match(9);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 38);
				{
				setState(197); match(28);
				setState(198); match(12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 39);
				{
				setState(199); match(3);
				setState(200); match(22);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 11) | (1L << 16) | (1L << 17) | (1L << 21) | (1L << 24) | (1L << 30) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 49) | (1L << 50))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_operatorContext extends ParserRuleContext {
		public Equality_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterEquality_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitEquality_operator(this);
		}
	}

	public final Equality_operatorContext equality_operator() throws RecognitionException {
		Equality_operatorContext _localctx = new Equality_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !(_la==6 || _la==51) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_decl_startContext extends ParserRuleContext {
		public Template_param_listContext template_param_list() {
			return getRuleContext(Template_param_listContext.class,0);
		}
		public TerminalNode TEMPLATE() { return getToken(CoarseFunctionGrammarParser.TEMPLATE, 0); }
		public Template_decl_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterTemplate_decl_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitTemplate_decl_start(this);
		}
	}

	public final Template_decl_startContext template_decl_start() throws RecognitionException {
		Template_decl_startContext _localctx = new Template_decl_startContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(TEMPLATE);
			setState(208); match(5);
			setState(209); template_param_list();
			setState(210); match(48);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_param_listContext extends ParserRuleContext {
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
		}
		public No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets(int i) {
			return getRuleContext(No_angle_brackets_or_bracketsContext.class,i);
		}
		public List<No_angle_brackets_or_bracketsContext> no_angle_brackets_or_brackets() {
			return getRuleContexts(No_angle_brackets_or_bracketsContext.class);
		}
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Template_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterTemplate_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitTemplate_param_list(this);
		}
	}

	public final Template_param_listContext template_param_list() throws RecognitionException {
		Template_param_listContext _localctx = new Template_param_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(221);
				switch (_input.LA(1)) {
				case 5:
					{
					{
					setState(212); match(5);
					setState(213); template_param_list();
					setState(214); match(48);
					}
					}
					break;
				case 28:
					{
					{
					setState(216); match(28);
					setState(217); template_param_list();
					setState(218); match(12);
					}
					}
					break;
				case 1:
				case 2:
				case 3:
				case 4:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 26:
				case 27:
				case 29:
				case 30:
				case 31:
				case 32:
				case 33:
				case 34:
				case 35:
				case 36:
				case 37:
				case 38:
				case 39:
				case 40:
				case 41:
				case 42:
				case 43:
				case 44:
				case 45:
				case 46:
				case 47:
				case 49:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case IF:
				case ELSE:
				case FOR:
				case WHILE:
				case BREAK:
				case CASE:
				case CONTINUE:
				case SWITCH:
				case DO:
				case GOTO:
				case RETURN:
				case TYPEDEF:
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case LONG:
				case CV_QUALIFIER:
				case VIRTUAL:
				case TRY:
				case CATCH:
				case THROW:
				case USING:
				case NAMESPACE:
				case AUTO:
				case REGISTER:
				case OPERATOR:
				case TEMPLATE:
				case CLASS_KEY:
				case ALPHA_NUMERIC:
				case OPENING_CURLY:
				case CLOSING_CURLY:
				case PRE_IF:
				case PRE_ELSE:
				case PRE_ENDIF:
				case HEX_LITERAL:
				case DECIMAL_LITERAL:
				case OCTAL_LITERAL:
				case FLOATING_POINT_LITERAL:
				case CHAR:
				case STRING:
				case COMMENT:
				case WHITESPACE:
				case CPPCOMMENT:
				case OTHER:
					{
					setState(220); no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 53) | (1L << 54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH) | (1L << DO))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (OTHER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_bracketsContext extends ParserRuleContext {
		public No_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterNo_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitNo_brackets(this);
		}
	}

	public final No_bracketsContext no_brackets() throws RecognitionException {
		No_bracketsContext _localctx = new No_bracketsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==12 || _la==28) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_brackets_curlies_or_squaresContext extends ParserRuleContext {
		public No_brackets_curlies_or_squaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets_curlies_or_squares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterNo_brackets_curlies_or_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitNo_brackets_curlies_or_squares(this);
		}
	}

	public final No_brackets_curlies_or_squaresContext no_brackets_curlies_or_squares() throws RecognitionException {
		No_brackets_curlies_or_squaresContext _localctx = new No_brackets_curlies_or_squaresContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 12) | (1L << 22) | (1L << 28))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_brackets_or_semicolonContext extends ParserRuleContext {
		public No_brackets_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterNo_brackets_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitNo_brackets_or_semicolon(this);
		}
	}

	public final No_brackets_or_semicolonContext no_brackets_or_semicolon() throws RecognitionException {
		No_brackets_or_semicolonContext _localctx = new No_brackets_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 28) | (1L << 45))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_angle_brackets_or_bracketsContext extends ParserRuleContext {
		public No_angle_brackets_or_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_angle_brackets_or_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterNo_angle_brackets_or_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitNo_angle_brackets_or_brackets(this);
		}
	}

	public final No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets() throws RecognitionException {
		No_angle_brackets_or_bracketsContext _localctx = new No_angle_brackets_or_bracketsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 12) | (1L << 28) | (1L << 48))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_curliesContext extends ParserRuleContext {
		public No_curliesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_curlies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterNo_curlies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitNo_curlies(this);
		}
	}

	public final No_curliesContext no_curlies() throws RecognitionException {
		No_curliesContext _localctx = new No_curliesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_squaresContext extends ParserRuleContext {
		public No_squaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_squares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterNo_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitNo_squares(this);
		}
	}

	public final No_squaresContext no_squares() throws RecognitionException {
		No_squaresContext _localctx = new No_squaresContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==3 || _la==22) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_squares_or_semicolonContext extends ParserRuleContext {
		public No_squares_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_squares_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterNo_squares_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitNo_squares_or_semicolon(this);
		}
	}

	public final No_squares_or_semicolonContext no_squares_or_semicolon() throws RecognitionException {
		No_squares_or_semicolonContext _localctx = new No_squares_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 22) | (1L << 45))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_comma_or_semicolonContext extends ParserRuleContext {
		public No_comma_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_comma_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterNo_comma_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitNo_comma_or_semicolon(this);
		}
	}

	public final No_comma_or_semicolonContext no_comma_or_semicolon() throws RecognitionException {
		No_comma_or_semicolonContext _localctx = new No_comma_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==26 || _la==45) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_waterContext extends ParserRuleContext {
		public Assign_waterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterAssign_water(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitAssign_water(this);
		}
	}

	public final Assign_waterContext assign_water() throws RecognitionException {
		Assign_waterContext _localctx = new Assign_waterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 12) | (1L << 22) | (1L << 26) | (1L << 28) | (1L << 45))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_water_l2Context extends ParserRuleContext {
		public Assign_water_l2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water_l2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterAssign_water_l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitAssign_water_l2(this);
		}
	}

	public final Assign_water_l2Context assign_water_l2() throws RecognitionException {
		Assign_water_l2Context _localctx = new Assign_water_l2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 12) | (1L << 22) | (1L << 28))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WaterContext extends ParserRuleContext {
		public WaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_water; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterWater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitWater(this);
		}
	}

	public final WaterContext water() throws RecognitionException {
		WaterContext _localctx = new WaterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			matchWildcard();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); assign_expr();
			setState(250);
			_la = _input.LA(1);
			if (_la==26) {
				{
				setState(248); match(26);
				setState(249); expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_exprContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitAssign_expr(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assign_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); conditional_expression();
			setState(256);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 11) | (1L << 16) | (1L << 17) | (1L << 21) | (1L << 24) | (1L << 30) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 49) | (1L << 50))) != 0)) {
				{
				setState(253); assignment_operator();
				setState(254); assign_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitConditional_expression(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); or_expression();
			setState(264);
			_la = _input.LA(1);
			if (_la==32) {
				{
				setState(259); match(32);
				setState(260); expr();
				setState(261); match(29);
				setState(262); conditional_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_expressionContext extends ParserRuleContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitOr_expression(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); and_expression();
			setState(269);
			_la = _input.LA(1);
			if (_la==47) {
				{
				setState(267); match(47);
				setState(268); or_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); inclusive_or_expression();
			setState(274);
			_la = _input.LA(1);
			if (_la==46) {
				{
				setState(272); match(46);
				setState(273); and_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitInclusive_or_expression(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); exclusive_or_expression();
			setState(279);
			_la = _input.LA(1);
			if (_la==19) {
				{
				setState(277); match(19);
				setState(278); inclusive_or_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public Bit_and_expressionContext bit_and_expression() {
			return getRuleContext(Bit_and_expressionContext.class,0);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitExclusive_or_expression(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); bit_and_expression();
			setState(284);
			_la = _input.LA(1);
			if (_la==40) {
				{
				setState(282); match(40);
				setState(283); exclusive_or_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_and_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Bit_and_expressionContext bit_and_expression() {
			return getRuleContext(Bit_and_expressionContext.class,0);
		}
		public Bit_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterBit_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitBit_and_expression(this);
		}
	}

	public final Bit_and_expressionContext bit_and_expression() throws RecognitionException {
		Bit_and_expressionContext _localctx = new Bit_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bit_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); equality_expression();
			setState(289);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(287); match(1);
				setState(288); bit_and_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Equality_operatorContext equality_operator() {
			return getRuleContext(Equality_operatorContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); relational_expression();
			setState(295);
			_la = _input.LA(1);
			if (_la==6 || _la==51) {
				{
				setState(292); equality_operator();
				setState(293); equality_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); shift_expression();
			setState(301);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 48) | (1L << 54))) != 0)) {
				{
				setState(298); relational_operator();
				setState(299); relational_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitShift_expression(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); additive_expression();
			setState(306);
			_la = _input.LA(1);
			if (_la==8 || _la==39) {
				{
				setState(304);
				_la = _input.LA(1);
				if ( !(_la==8 || _la==39) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(305); shift_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308); multiplicative_expression();
			setState(311);
			_la = _input.LA(1);
			if (_la==27 || _la==43) {
				{
				setState(309);
				_la = _input.LA(1);
				if ( !(_la==27 || _la==43) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(310); additive_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); cast_expression();
			setState(316);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 10) | (1L << 52))) != 0)) {
				{
				setState(314);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 10) | (1L << 52))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(315); multiplicative_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Cast_targetContext cast_target() {
			return getRuleContext(Cast_targetContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitCast_expression(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cast_expression);
		try {
			setState(324);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(318); match(28);
				setState(319); cast_target();
				setState(320); match(12);
				setState(321); cast_expression();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323); unary_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_targetContext extends ParserRuleContext {
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Cast_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterCast_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitCast_target(this);
		}
	}

	public final Cast_targetContext cast_target() throws RecognitionException {
		Cast_targetContext _localctx = new Cast_targetContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); type_name();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==1 || _la==2) {
				{
				{
				setState(327); ptr_operator();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	 
		public Unary_expressionContext() { }
		public void copyFrom(Unary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldOnlyContext extends Unary_expressionContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public Unary_operatorsContext unary_operators() {
			return getRuleContext(Unary_operatorsContext.class,0);
		}
		public FieldOnlyContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterFieldOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitFieldOnly(this);
		}
	}
	public static class FuncCallContext extends Unary_expressionContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public Template_param_listContext template_param_list() {
			return getRuleContext(Template_param_listContext.class,0);
		}
		public Unary_operatorsContext unary_operators() {
			return getRuleContext(Unary_operatorsContext.class,0);
		}
		public Function_argument_listContext function_argument_list() {
			return getRuleContext(Function_argument_listContext.class,0);
		}
		public FuncCallContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitFuncCall(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_unary_expression);
		int _la;
		try {
			setState(348);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new FuncCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(333); inc_dec();
				setState(334); unary_operators();
				setState(335); field();
				{
				setState(340);
				_la = _input.LA(1);
				if (_la==5) {
					{
					setState(336); match(5);
					setState(337); template_param_list();
					setState(338); match(48);
					}
				}

				setState(342); function_argument_list();
				}
				}
				break;

			case 2:
				_localctx = new FieldOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(344); inc_dec();
				setState(345); unary_operators();
				setState(346); field();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inc_decContext extends ParserRuleContext {
		public Inc_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterInc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitInc_dec(this);
		}
	}

	public final Inc_decContext inc_dec() throws RecognitionException {
		Inc_decContext _localctx = new Inc_decContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4 || _la==37) {
				{
				{
				setState(350);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==37) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorsContext extends ParserRuleContext {
		public List<Unary_operatorContext> unary_operator() {
			return getRuleContexts(Unary_operatorContext.class);
		}
		public Unary_operatorContext unary_operator(int i) {
			return getRuleContext(Unary_operatorContext.class,i);
		}
		public Unary_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterUnary_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitUnary_operators(this);
		}
	}

	public final Unary_operatorsContext unary_operators() throws RecognitionException {
		Unary_operatorsContext _localctx = new Unary_operatorsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unary_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 20) | (1L << 27) | (1L << 43) | (1L << 53))) != 0)) {
				{
				{
				setState(356); unary_operator();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_field);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362); primary_expression();
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(363); postfix();
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_argument_listContext extends ParserRuleContext {
		public Function_argumentContext function_argument(int i) {
			return getRuleContext(Function_argumentContext.class,i);
		}
		public List<Function_argumentContext> function_argument() {
			return getRuleContexts(Function_argumentContext.class);
		}
		public Function_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterFunction_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitFunction_argument_list(this);
		}
	}

	public final Function_argument_listContext function_argument_list() throws RecognitionException {
		Function_argument_listContext _localctx = new Function_argument_listContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369); match(28);
			setState(378);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 4) | (1L << 20) | (1L << 27) | (1L << 28) | (1L << 37) | (1L << 43) | (1L << 53))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ALPHA_NUMERIC - 83)) | (1L << (HEX_LITERAL - 83)) | (1L << (DECIMAL_LITERAL - 83)) | (1L << (OCTAL_LITERAL - 83)) | (1L << (FLOATING_POINT_LITERAL - 83)) | (1L << (CHAR - 83)) | (1L << (STRING - 83)))) != 0)) {
				{
				setState(370); function_argument();
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==26) {
					{
					{
					setState(371); match(26);
					setState(372); function_argument();
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(380); match(12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_argumentContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterFunction_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitFunction_argument(this);
		}
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_function_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382); assign_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitPostfix(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_postfix);
		try {
			setState(396);
			switch (_input.LA(1)) {
			case 3:
			case 9:
			case 42:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				switch (_input.LA(1)) {
				case 42:
					{
					setState(384); match(42);
					setState(385); identifier();
					}
					break;
				case 9:
					{
					setState(386); match(9);
					setState(387); identifier();
					}
					break;
				case 3:
					{
					setState(388); match(3);
					setState(389); expr();
					setState(390); match(22);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 2);
				{
				setState(394); match(37);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 3);
				{
				setState(395); match(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_primary_expression);
		try {
			setState(404);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(398); identifier();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(399); constant();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 3);
				{
				setState(400); match(28);
				setState(401); expr();
				setState(402); match(12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declaratorContext extends ParserRuleContext {
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterInit_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitInit_declarator(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(407);
			_la = _input.LA(1);
			if (_la==1 || _la==2) {
				{
				setState(406); ptrs();
				}
			}

			setState(409); identifier();
			setState(411);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(410); type_suffix();
				}
				break;
			}
			}
			setState(420);
			switch (_input.LA(1)) {
			case 28:
				{
				{
				setState(413); match(28);
				setState(415);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 4) | (1L << 20) | (1L << 27) | (1L << 28) | (1L << 37) | (1L << 43) | (1L << 53))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ALPHA_NUMERIC - 83)) | (1L << (HEX_LITERAL - 83)) | (1L << (DECIMAL_LITERAL - 83)) | (1L << (OCTAL_LITERAL - 83)) | (1L << (FLOATING_POINT_LITERAL - 83)) | (1L << (CHAR - 83)) | (1L << (STRING - 83)))) != 0)) {
					{
					setState(414); expr();
					}
				}

				setState(417); match(12);
				}
				}
				break;
			case 16:
				{
				{
				setState(418); match(16);
				setState(419); initializer();
				}
				}
				break;
			case 26:
			case 45:
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_suffixContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Param_type_listContext param_type_list() {
			return getRuleContext(Param_type_listContext.class,0);
		}
		public Type_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterType_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitType_suffix(this);
		}
	}

	public final Type_suffixContext type_suffix() throws RecognitionException {
		Type_suffixContext _localctx = new Type_suffixContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_type_suffix);
		int _la;
		try {
			setState(428);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(422); match(3);
				setState(424);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 4) | (1L << 20) | (1L << 27) | (1L << 28) | (1L << 37) | (1L << 43) | (1L << 53))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ALPHA_NUMERIC - 83)) | (1L << (HEX_LITERAL - 83)) | (1L << (DECIMAL_LITERAL - 83)) | (1L << (OCTAL_LITERAL - 83)) | (1L << (FLOATING_POINT_LITERAL - 83)) | (1L << (CHAR - 83)) | (1L << (STRING - 83)))) != 0)) {
					{
					setState(423); conditional_expression();
					}
				}

				setState(426); match(22);
				}
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 2);
				{
				setState(427); param_type_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_declContext extends ParserRuleContext {
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(CoarseFunctionGrammarParser.TYPEDEF, 0); }
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Simple_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterSimple_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitSimple_decl(this);
		}
	}

	public final Simple_declContext simple_decl() throws RecognitionException {
		Simple_declContext _localctx = new Simple_declContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_simple_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(431);
			_la = _input.LA(1);
			if (_la==TYPEDEF) {
				{
				setState(430); match(TYPEDEF);
				}
			}

			setState(434);
			_la = _input.LA(1);
			if (_la==TEMPLATE) {
				{
				setState(433); template_decl_start();
				}
			}

			}
			setState(436); var_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclByClassContext extends Var_declContext {
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public DeclByClassContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterDeclByClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitDeclByClass(this);
		}
	}
	public static class DeclByTypeContext extends Var_declContext {
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public DeclByTypeContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterDeclByType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitDeclByType(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_var_decl);
		try {
			setState(445);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(438); class_def();
				setState(440);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(439); init_declarator_list();
					}
					break;
				}
				}
				break;

			case 2:
				_localctx = new DeclByTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(442); type_name();
				setState(443); init_declarator_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declarator_listContext extends ParserRuleContext {
		public List<Init_declaratorContext> init_declarator() {
			return getRuleContexts(Init_declaratorContext.class);
		}
		public Init_declaratorContext init_declarator(int i) {
			return getRuleContext(Init_declaratorContext.class,i);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitInit_declarator_list(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447); init_declarator();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==26) {
				{
				{
				setState(448); match(26);
				setState(449); init_declarator();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455); match(45);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_initializer);
		try {
			setState(462);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 4:
			case 20:
			case 27:
			case 28:
			case 37:
			case 43:
			case 53:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(457); assign_expr();
				}
				break;
			case OPENING_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(458); match(OPENING_CURLY);
				setState(459); initializer_list();
				setState(460); match(CLOSING_CURLY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_listContext extends ParserRuleContext {
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitInitializer_list(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); initializer();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==26) {
				{
				{
				setState(465); match(26);
				setState(466); initializer();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_defContext extends ParserRuleContext {
		public Base_classesContext base_classes() {
			return getRuleContext(Base_classesContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public TerminalNode CLASS_KEY() { return getToken(CoarseFunctionGrammarParser.CLASS_KEY, 0); }
		public TerminalNode OPENING_CURLY() { return getToken(CoarseFunctionGrammarParser.OPENING_CURLY, 0); }
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitClass_def(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472); match(CLASS_KEY);
			setState(474);
			_la = _input.LA(1);
			if (_la==ALPHA_NUMERIC) {
				{
				setState(473); class_name();
				}
			}

			setState(477);
			_la = _input.LA(1);
			if (_la==29) {
				{
				setState(476); base_classes();
				}
			}

			setState(479); match(OPENING_CURLY);
			skipToEndOfObject(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitClass_name(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_classesContext extends ParserRuleContext {
		public Base_classContext base_class(int i) {
			return getRuleContext(Base_classContext.class,i);
		}
		public List<Base_classContext> base_class() {
			return getRuleContexts(Base_classContext.class);
		}
		public Base_classesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterBase_classes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitBase_classes(this);
		}
	}

	public final Base_classesContext base_classes() throws RecognitionException {
		Base_classesContext _localctx = new Base_classesContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484); match(29);
			setState(485); base_class();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==26) {
				{
				{
				setState(486); match(26);
				setState(487); base_class();
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_classContext extends ParserRuleContext {
		public TerminalNode VIRTUAL() { return getToken(CoarseFunctionGrammarParser.VIRTUAL, 0); }
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Base_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterBase_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitBase_class(this);
		}
	}

	public final Base_classContext base_class() throws RecognitionException {
		Base_classContext _localctx = new Base_classContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(493); match(VIRTUAL);
				}
			}

			setState(497);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 25) | (1L << 31) | (1L << 44))) != 0)) {
				{
				setState(496); access_specifier();
				}
			}

			setState(499); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(CoarseFunctionGrammarParser.CV_QUALIFIER); }
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
		}
		public TerminalNode SIGNED() { return getToken(CoarseFunctionGrammarParser.SIGNED, 0); }
		public TerminalNode UNSIGNED() { return getToken(CoarseFunctionGrammarParser.UNSIGNED, 0); }
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Base_typeContext base_type(int i) {
			return getRuleContext(Base_typeContext.class,i);
		}
		public List<Base_typeContext> base_type() {
			return getRuleContexts(Base_typeContext.class);
		}
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(CoarseFunctionGrammarParser.CV_QUALIFIER, i);
		}
		public TerminalNode CLASS_KEY() { return getToken(CoarseFunctionGrammarParser.CLASS_KEY, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_type_name);
		int _la;
		try {
			setState(532);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(501); match(CV_QUALIFIER);
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(508);
				_la = _input.LA(1);
				if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (UNSIGNED - 68)) | (1L << (SIGNED - 68)) | (1L << (CLASS_KEY - 68)))) != 0)) {
					{
					setState(507);
					_la = _input.LA(1);
					if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (UNSIGNED - 68)) | (1L << (SIGNED - 68)) | (1L << (CLASS_KEY - 68)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(510); base_type();
				setState(515);
				_la = _input.LA(1);
				if (_la==5) {
					{
					setState(511); match(5);
					setState(512); template_param_list();
					setState(513); match(48);
					}
				}

				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==15) {
					{
					{
					setState(517); match(15);
					setState(518); base_type();
					setState(523);
					_la = _input.LA(1);
					if (_la==5) {
						{
						setState(519); match(5);
						setState(520); template_param_list();
						setState(521); match(48);
						}
					}

					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530); match(UNSIGNED);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(531); match(SIGNED);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_typeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(CoarseFunctionGrammarParser.VOID, 0); }
		public TerminalNode ALPHA_NUMERIC() { return getToken(CoarseFunctionGrammarParser.ALPHA_NUMERIC, 0); }
		public TerminalNode LONG(int i) {
			return getToken(CoarseFunctionGrammarParser.LONG, i);
		}
		public List<TerminalNode> LONG() { return getTokens(CoarseFunctionGrammarParser.LONG); }
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitBase_type(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_base_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(534); match(ALPHA_NUMERIC);
				}
				break;

			case 2:
				{
				setState(535); match(VOID);
				}
				break;

			case 3:
				{
				setState(536); match(LONG);
				}
				break;

			case 4:
				{
				setState(537); match(LONG);
				setState(538); match(LONG);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_decl_specifiersContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode REGISTER() { return getToken(CoarseFunctionGrammarParser.REGISTER, 0); }
		public TerminalNode AUTO() { return getToken(CoarseFunctionGrammarParser.AUTO, 0); }
		public Param_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterParam_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitParam_decl_specifiers(this);
		}
	}

	public final Param_decl_specifiersContext param_decl_specifiers() throws RecognitionException {
		Param_decl_specifiersContext _localctx = new Param_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_la = _input.LA(1);
			if (_la==AUTO || _la==REGISTER) {
				{
				setState(541);
				_la = _input.LA(1);
				if ( !(_la==AUTO || _la==REGISTER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(544); type_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_nameContext extends ParserRuleContext {
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitParameter_name(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_parameter_name);
		try {
			setState(548);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(546); identifier();
				}
				break;
			case 25:
			case 31:
			case 44:
				enterOuterAlt(_localctx, 2);
				{
				setState(547); access_specifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_type_listContext extends ParserRuleContext {
		public Param_typeContext param_type(int i) {
			return getRuleContext(Param_typeContext.class,i);
		}
		public List<Param_typeContext> param_type() {
			return getRuleContexts(Param_typeContext.class);
		}
		public TerminalNode VOID() { return getToken(CoarseFunctionGrammarParser.VOID, 0); }
		public Param_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterParam_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitParam_type_list(this);
		}
	}

	public final Param_type_listContext param_type_list() throws RecognitionException {
		Param_type_listContext _localctx = new Param_type_listContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_param_type_list);
		int _la;
		try {
			setState(565);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550); match(28);
				setState(551); match(VOID);
				setState(552); match(12);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553); match(28);
				setState(562);
				_la = _input.LA(1);
				if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (VOID - 67)) | (1L << (UNSIGNED - 67)) | (1L << (SIGNED - 67)) | (1L << (LONG - 67)) | (1L << (CV_QUALIFIER - 67)) | (1L << (AUTO - 67)) | (1L << (REGISTER - 67)) | (1L << (CLASS_KEY - 67)) | (1L << (ALPHA_NUMERIC - 67)))) != 0)) {
					{
					setState(554); param_type();
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==26) {
						{
						{
						setState(555); match(26);
						setState(556); param_type();
						}
						}
						setState(561);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(564); match(12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_typeContext extends ParserRuleContext {
		public Param_type_idContext param_type_id() {
			return getRuleContext(Param_type_idContext.class,0);
		}
		public Param_decl_specifiersContext param_decl_specifiers() {
			return getRuleContext(Param_decl_specifiersContext.class,0);
		}
		public Param_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterParam_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitParam_type(this);
		}
	}

	public final Param_typeContext param_type() throws RecognitionException {
		Param_typeContext _localctx = new Param_typeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_param_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); param_decl_specifiers();
			setState(568); param_type_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_type_idContext extends ParserRuleContext {
		public Param_type_idContext param_type_id() {
			return getRuleContext(Param_type_idContext.class,0);
		}
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Param_type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterParam_type_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitParam_type_id(this);
		}
	}

	public final Param_type_idContext param_type_id() throws RecognitionException {
		Param_type_idContext _localctx = new Param_type_idContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_la = _input.LA(1);
			if (_la==1 || _la==2) {
				{
				setState(570); ptrs();
				}
			}

			setState(580);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(573); match(28);
				setState(574); param_type_id();
				setState(575); match(12);
				}
				break;

			case 2:
				{
				setState(578);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (25 - 25)) | (1L << (31 - 25)) | (1L << (44 - 25)) | (1L << (ALPHA_NUMERIC - 25)))) != 0)) {
					{
					setState(577); parameter_name();
					}
				}

				}
				break;
			}
			setState(583);
			_la = _input.LA(1);
			if (_la==3 || _la==28) {
				{
				setState(582); type_suffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(CoarseFunctionGrammarParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(CoarseFunctionGrammarParser.ALPHA_NUMERIC); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(585); match(ALPHA_NUMERIC);
			setState(590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(586); match(15);
					setState(587); match(ALPHA_NUMERIC);
					}
					} 
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode OCTAL_LITERAL() { return getToken(CoarseFunctionGrammarParser.OCTAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(CoarseFunctionGrammarParser.HEX_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(CoarseFunctionGrammarParser.DECIMAL_LITERAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (HEX_LITERAL - 89)) | (1L << (DECIMAL_LITERAL - 89)) | (1L << (OCTAL_LITERAL - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrsContext extends ParserRuleContext {
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public PtrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).enterPtrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoarseFunctionGrammarListener ) ((CoarseFunctionGrammarListener)listener).exitPtrs(this);
		}
	}

	public final PtrsContext ptrs() throws RecognitionException {
		PtrsContext _localctx = new PtrsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(595); ptr_operator();
				}
				}
				setState(598); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==1 || _la==2 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3d\u025b\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2"+
		"\7\2\u008c\n\2\f\2\16\2\u008f\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\t\u00a2\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00cc\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\6\r\u00e0\n\r\r\r\16\r\u00e1\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\31\5\31\u00fd\n\31\3\32\3\32\3\32\3\32\5\32"+
		"\u0103\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u010b\n\33\3\34\3\34\3"+
		"\34\5\34\u0110\n\34\3\35\3\35\3\35\5\35\u0115\n\35\3\36\3\36\3\36\5\36"+
		"\u011a\n\36\3\37\3\37\3\37\5\37\u011f\n\37\3 \3 \3 \5 \u0124\n \3!\3!"+
		"\3!\3!\5!\u012a\n!\3\"\3\"\3\"\3\"\5\"\u0130\n\"\3#\3#\3#\5#\u0135\n#"+
		"\3$\3$\3$\5$\u013a\n$\3%\3%\3%\5%\u013f\n%\3&\3&\3&\3&\3&\3&\5&\u0147"+
		"\n&\3\'\3\'\7\'\u014b\n\'\f\'\16\'\u014e\13\'\3(\3(\3(\3(\3(\3(\3(\5("+
		"\u0157\n(\3(\3(\3(\3(\3(\3(\5(\u015f\n(\3)\7)\u0162\n)\f)\16)\u0165\13"+
		")\3*\7*\u0168\n*\f*\16*\u016b\13*\3+\3+\7+\u016f\n+\f+\16+\u0172\13+\3"+
		",\3,\3,\3,\7,\u0178\n,\f,\16,\u017b\13,\5,\u017d\n,\3,\3,\3-\3-\3.\3."+
		"\3.\3.\3.\3.\3.\3.\5.\u018b\n.\3.\3.\5.\u018f\n.\3/\3/\3/\3/\3/\3/\5/"+
		"\u0197\n/\3\60\5\60\u019a\n\60\3\60\3\60\5\60\u019e\n\60\3\60\3\60\5\60"+
		"\u01a2\n\60\3\60\3\60\3\60\5\60\u01a7\n\60\3\61\3\61\5\61\u01ab\n\61\3"+
		"\61\3\61\5\61\u01af\n\61\3\62\5\62\u01b2\n\62\3\62\5\62\u01b5\n\62\3\62"+
		"\3\62\3\63\3\63\5\63\u01bb\n\63\3\63\3\63\3\63\5\63\u01c0\n\63\3\64\3"+
		"\64\3\64\7\64\u01c5\n\64\f\64\16\64\u01c8\13\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\5\65\u01d1\n\65\3\66\3\66\3\66\7\66\u01d6\n\66\f\66\16\66"+
		"\u01d9\13\66\3\67\3\67\5\67\u01dd\n\67\3\67\5\67\u01e0\n\67\3\67\3\67"+
		"\3\67\38\38\39\39\39\39\79\u01eb\n9\f9\169\u01ee\139\3:\5:\u01f1\n:\3"+
		":\5:\u01f4\n:\3:\3:\3;\7;\u01f9\n;\f;\16;\u01fc\13;\3;\5;\u01ff\n;\3;"+
		"\3;\3;\3;\3;\5;\u0206\n;\3;\3;\3;\3;\3;\3;\5;\u020e\n;\7;\u0210\n;\f;"+
		"\16;\u0213\13;\3;\3;\5;\u0217\n;\3<\3<\3<\3<\3<\5<\u021e\n<\3=\5=\u0221"+
		"\n=\3=\3=\3>\3>\5>\u0227\n>\3?\3?\3?\3?\3?\3?\3?\7?\u0230\n?\f?\16?\u0233"+
		"\13?\5?\u0235\n?\3?\5?\u0238\n?\3@\3@\3@\3A\5A\u023e\nA\3A\3A\3A\3A\3"+
		"A\5A\u0245\nA\5A\u0247\nA\3A\5A\u024a\nA\3B\3B\3B\7B\u024f\nB\fB\16B\u0252"+
		"\13B\3C\3C\3D\6D\u0257\nD\rD\16D\u0258\3D\2E\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\2\34\7\3\4\26\26\35\35--\67\67\6\7\7\t\t\62"+
		"\6288\3[`\6\17\20&&((JJ\3\3\4\5\33\33!!..\4\24\24++\t\r\r\22\23\27\27"+
		"\32\32  #%\63\64\4\b\b\65\65\4\16\16\36\36\7\5\5\16\16\30\30\36\36VW\5"+
		"\16\16\36\36//\6\7\7\16\16\36\36\62\62\3VW\4\5\5\30\30\5\5\5\30\30//\4"+
		"\34\34//\t\5\5\16\16\30\30\34\34\36\36//VW\7\5\5\16\16\30\30\36\36VW\4"+
		"\n\n))\4\35\35--\5\4\4\f\f\66\66\4\6\6\'\'\4FGTT\3PQ\3[]\u0288\2\u008d"+
		"\3\2\2\2\4\u0092\3\2\2\2\6\u0094\3\2\2\2\b\u0096\3\2\2\2\n\u0098\3\2\2"+
		"\2\f\u009a\3\2\2\2\16\u009c\3\2\2\2\20\u00cb\3\2\2\2\22\u00cd\3\2\2\2"+
		"\24\u00cf\3\2\2\2\26\u00d1\3\2\2\2\30\u00df\3\2\2\2\32\u00e3\3\2\2\2\34"+
		"\u00e5\3\2\2\2\36\u00e7\3\2\2\2 \u00e9\3\2\2\2\"\u00eb\3\2\2\2$\u00ed"+
		"\3\2\2\2&\u00ef\3\2\2\2(\u00f1\3\2\2\2*\u00f3\3\2\2\2,\u00f5\3\2\2\2."+
		"\u00f7\3\2\2\2\60\u00f9\3\2\2\2\62\u00fe\3\2\2\2\64\u0104\3\2\2\2\66\u010c"+
		"\3\2\2\28\u0111\3\2\2\2:\u0116\3\2\2\2<\u011b\3\2\2\2>\u0120\3\2\2\2@"+
		"\u0125\3\2\2\2B\u012b\3\2\2\2D\u0131\3\2\2\2F\u0136\3\2\2\2H\u013b\3\2"+
		"\2\2J\u0146\3\2\2\2L\u0148\3\2\2\2N\u015e\3\2\2\2P\u0163\3\2\2\2R\u0169"+
		"\3\2\2\2T\u016c\3\2\2\2V\u0173\3\2\2\2X\u0180\3\2\2\2Z\u018e\3\2\2\2\\"+
		"\u0196\3\2\2\2^\u0199\3\2\2\2`\u01ae\3\2\2\2b\u01b1\3\2\2\2d\u01bf\3\2"+
		"\2\2f\u01c1\3\2\2\2h\u01d0\3\2\2\2j\u01d2\3\2\2\2l\u01da\3\2\2\2n\u01e4"+
		"\3\2\2\2p\u01e6\3\2\2\2r\u01f0\3\2\2\2t\u0216\3\2\2\2v\u021d\3\2\2\2x"+
		"\u0220\3\2\2\2z\u0226\3\2\2\2|\u0237\3\2\2\2~\u0239\3\2\2\2\u0080\u023d"+
		"\3\2\2\2\u0082\u024b\3\2\2\2\u0084\u0253\3\2\2\2\u0086\u0256\3\2\2\2\u0088"+
		"\u008c\5b\62\2\u0089\u008c\5N(\2\u008a\u008c\5.\30\2\u008b\u0088\3\2\2"+
		"\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7\1\2\2\u0091\3\3\2\2\2\u0092\u0093\t\2\2\2\u0093\5\3\2\2\2\u0094"+
		"\u0095\t\3\2\2\u0095\7\3\2\2\2\u0096\u0097\t\4\2\2\u0097\t\3\2\2\2\u0098"+
		"\u0099\t\5\2\2\u0099\13\3\2\2\2\u009a\u009b\t\6\2\2\u009b\r\3\2\2\2\u009c"+
		"\u009d\t\7\2\2\u009d\17\3\2\2\2\u009e\u00a1\t\b\2\2\u009f\u00a0\7\5\2"+
		"\2\u00a0\u00a2\7\30\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00cc\3\2\2\2\u00a3\u00cc\7-\2\2\u00a4\u00cc\7\35\2\2\u00a5\u00cc\7\4"+
		"\2\2\u00a6\u00cc\7\66\2\2\u00a7\u00cc\7\f\2\2\u00a8\u00cc\7*\2\2\u00a9"+
		"\u00cc\7\3\2\2\u00aa\u00cc\7\25\2\2\u00ab\u00cc\7\67\2\2\u00ac\u00cc\7"+
		"\26\2\2\u00ad\u00cc\7\22\2\2\u00ae\u00cc\7\7\2\2\u00af\u00cc\7\62\2\2"+
		"\u00b0\u00cc\7$\2\2\u00b1\u00cc\7\32\2\2\u00b2\u00cc\7\r\2\2\u00b3\u00cc"+
		"\7\64\2\2\u00b4\u00cc\7\63\2\2\u00b5\u00cc\7%\2\2\u00b6\u00cc\7 \2\2\u00b7"+
		"\u00cc\7\23\2\2\u00b8\u00cc\7)\2\2\u00b9\u00cc\7\n\2\2\u00ba\u00cc\7#"+
		"\2\2\u00bb\u00cc\7\27\2\2\u00bc\u00cc\7\65\2\2\u00bd\u00cc\7\b\2\2\u00be"+
		"\u00cc\7\t\2\2\u00bf\u00cc\78\2\2\u00c0\u00cc\7\60\2\2\u00c1\u00cc\7\61"+
		"\2\2\u00c2\u00cc\7\'\2\2\u00c3\u00cc\7\6\2\2\u00c4\u00cc\7\34\2\2\u00c5"+
		"\u00cc\7\31\2\2\u00c6\u00cc\7\13\2\2\u00c7\u00c8\7\36\2\2\u00c8\u00cc"+
		"\7\16\2\2\u00c9\u00ca\7\5\2\2\u00ca\u00cc\7\30\2\2\u00cb\u009e\3\2\2\2"+
		"\u00cb\u00a3\3\2\2\2\u00cb\u00a4\3\2\2\2\u00cb\u00a5\3\2\2\2\u00cb\u00a6"+
		"\3\2\2\2\u00cb\u00a7\3\2\2\2\u00cb\u00a8\3\2\2\2\u00cb\u00a9\3\2\2\2\u00cb"+
		"\u00aa\3\2\2\2\u00cb\u00ab\3\2\2\2\u00cb\u00ac\3\2\2\2\u00cb\u00ad\3\2"+
		"\2\2\u00cb\u00ae\3\2\2\2\u00cb\u00af\3\2\2\2\u00cb\u00b0\3\2\2\2\u00cb"+
		"\u00b1\3\2\2\2\u00cb\u00b2\3\2\2\2\u00cb\u00b3\3\2\2\2\u00cb\u00b4\3\2"+
		"\2\2\u00cb\u00b5\3\2\2\2\u00cb\u00b6\3\2\2\2\u00cb\u00b7\3\2\2\2\u00cb"+
		"\u00b8\3\2\2\2\u00cb\u00b9\3\2\2\2\u00cb\u00ba\3\2\2\2\u00cb\u00bb\3\2"+
		"\2\2\u00cb\u00bc\3\2\2\2\u00cb\u00bd\3\2\2\2\u00cb\u00be\3\2\2\2\u00cb"+
		"\u00bf\3\2\2\2\u00cb\u00c0\3\2\2\2\u00cb\u00c1\3\2\2\2\u00cb\u00c2\3\2"+
		"\2\2\u00cb\u00c3\3\2\2\2\u00cb\u00c4\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cb"+
		"\u00c6\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\21\3\2\2"+
		"\2\u00cd\u00ce\t\t\2\2\u00ce\23\3\2\2\2\u00cf\u00d0\t\n\2\2\u00d0\25\3"+
		"\2\2\2\u00d1\u00d2\7S\2\2\u00d2\u00d3\7\7\2\2\u00d3\u00d4\5\30\r\2\u00d4"+
		"\u00d5\7\62\2\2\u00d5\27\3\2\2\2\u00d6\u00d7\7\7\2\2\u00d7\u00d8\5\30"+
		"\r\2\u00d8\u00d9\7\62\2\2\u00d9\u00e0\3\2\2\2\u00da\u00db\7\36\2\2\u00db"+
		"\u00dc\5\30\r\2\u00dc\u00dd\7\16\2\2\u00dd\u00e0\3\2\2\2\u00de\u00e0\5"+
		" \21\2\u00df\u00d6\3\2\2\2\u00df\u00da\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\31\3\2\2"+
		"\2\u00e3\u00e4\n\13\2\2\u00e4\33\3\2\2\2\u00e5\u00e6\n\f\2\2\u00e6\35"+
		"\3\2\2\2\u00e7\u00e8\n\r\2\2\u00e8\37\3\2\2\2\u00e9\u00ea\n\16\2\2\u00ea"+
		"!\3\2\2\2\u00eb\u00ec\n\17\2\2\u00ec#\3\2\2\2\u00ed\u00ee\n\20\2\2\u00ee"+
		"%\3\2\2\2\u00ef\u00f0\n\21\2\2\u00f0\'\3\2\2\2\u00f1\u00f2\n\22\2\2\u00f2"+
		")\3\2\2\2\u00f3\u00f4\n\23\2\2\u00f4+\3\2\2\2\u00f5\u00f6\n\24\2\2\u00f6"+
		"-\3\2\2\2\u00f7\u00f8\13\2\2\2\u00f8/\3\2\2\2\u00f9\u00fc\5\62\32\2\u00fa"+
		"\u00fb\7\34\2\2\u00fb\u00fd\5\60\31\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\61\3\2\2\2\u00fe\u0102\5\64\33\2\u00ff\u0100\5\22\n\2\u0100"+
		"\u0101\5\62\32\2\u0101\u0103\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\63\3\2\2\2\u0104\u010a\5\66\34\2\u0105\u0106\7\"\2\2\u0106"+
		"\u0107\5\60\31\2\u0107\u0108\7\37\2\2\u0108\u0109\5\64\33\2\u0109\u010b"+
		"\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u010b\3\2\2\2\u010b\65\3\2\2\2\u010c"+
		"\u010f\58\35\2\u010d\u010e\7\61\2\2\u010e\u0110\5\66\34\2\u010f\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\67\3\2\2\2\u0111\u0114\5:\36\2\u0112"+
		"\u0113\7\60\2\2\u0113\u0115\58\35\2\u0114\u0112\3\2\2\2\u0114\u0115\3"+
		"\2\2\2\u01159\3\2\2\2\u0116\u0119\5<\37\2\u0117\u0118\7\25\2\2\u0118\u011a"+
		"\5:\36\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a;\3\2\2\2\u011b"+
		"\u011e\5> \2\u011c\u011d\7*\2\2\u011d\u011f\5<\37\2\u011e\u011c\3\2\2"+
		"\2\u011e\u011f\3\2\2\2\u011f=\3\2\2\2\u0120\u0123\5@!\2\u0121\u0122\7"+
		"\3\2\2\u0122\u0124\5> \2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"?\3\2\2\2\u0125\u0129\5B\"\2\u0126\u0127\5\24\13\2\u0127\u0128\5@!\2\u0128"+
		"\u012a\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u012a\3\2\2\2\u012aA\3\2\2\2"+
		"\u012b\u012f\5D#\2\u012c\u012d\5\6\4\2\u012d\u012e\5B\"\2\u012e\u0130"+
		"\3\2\2\2\u012f\u012c\3\2\2\2\u012f\u0130\3\2\2\2\u0130C\3\2\2\2\u0131"+
		"\u0134\5F$\2\u0132\u0133\t\25\2\2\u0133\u0135\5D#\2\u0134\u0132\3\2\2"+
		"\2\u0134\u0135\3\2\2\2\u0135E\3\2\2\2\u0136\u0139\5H%\2\u0137\u0138\t"+
		"\26\2\2\u0138\u013a\5F$\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"G\3\2\2\2\u013b\u013e\5J&\2\u013c\u013d\t\27\2\2\u013d\u013f\5H%\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013fI\3\2\2\2\u0140\u0141\7\36\2\2"+
		"\u0141\u0142\5L\'\2\u0142\u0143\7\16\2\2\u0143\u0144\5J&\2\u0144\u0147"+
		"\3\2\2\2\u0145\u0147\5N(\2\u0146\u0140\3\2\2\2\u0146\u0145\3\2\2\2\u0147"+
		"K\3\2\2\2\u0148\u014c\5t;\2\u0149\u014b\5\f\7\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014dM\3\2\2\2"+
		"\u014e\u014c\3\2\2\2\u014f\u0150\5P)\2\u0150\u0151\5R*\2\u0151\u0156\5"+
		"T+\2\u0152\u0153\7\7\2\2\u0153\u0154\5\30\r\2\u0154\u0155\7\62\2\2\u0155"+
		"\u0157\3\2\2\2\u0156\u0152\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0159\5V,\2\u0159\u015f\3\2\2\2\u015a\u015b\5P)\2\u015b\u015c"+
		"\5R*\2\u015c\u015d\5T+\2\u015d\u015f\3\2\2\2\u015e\u014f\3\2\2\2\u015e"+
		"\u015a\3\2\2\2\u015fO\3\2\2\2\u0160\u0162\t\30\2\2\u0161\u0160\3\2\2\2"+
		"\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164Q\3"+
		"\2\2\2\u0165\u0163\3\2\2\2\u0166\u0168\5\4\3\2\u0167\u0166\3\2\2\2\u0168"+
		"\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016aS\3\2\2\2"+
		"\u016b\u0169\3\2\2\2\u016c\u0170\5\\/\2\u016d\u016f\5Z.\2\u016e\u016d"+
		"\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"U\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u017c\7\36\2\2\u0174\u0179\5X-\2\u0175"+
		"\u0176\7\34\2\2\u0176\u0178\5X-\2\u0177\u0175\3\2\2\2\u0178\u017b\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017d\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017c\u0174\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u017f\7\16\2\2\u017fW\3\2\2\2\u0180\u0181\5\62\32\2\u0181Y"+
		"\3\2\2\2\u0182\u0183\7,\2\2\u0183\u018b\5\u0082B\2\u0184\u0185\7\13\2"+
		"\2\u0185\u018b\5\u0082B\2\u0186\u0187\7\5\2\2\u0187\u0188\5\60\31\2\u0188"+
		"\u0189\7\30\2\2\u0189\u018b\3\2\2\2\u018a\u0182\3\2\2\2\u018a\u0184\3"+
		"\2\2\2\u018a\u0186\3\2\2\2\u018b\u018f\3\2\2\2\u018c\u018f\7\'\2\2\u018d"+
		"\u018f\7\6\2\2\u018e\u018a\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2"+
		"\2\2\u018f[\3\2\2\2\u0190\u0197\5\u0082B\2\u0191\u0197\5\b\5\2\u0192\u0193"+
		"\7\36\2\2\u0193\u0194\5\60\31\2\u0194\u0195\7\16\2\2\u0195\u0197\3\2\2"+
		"\2\u0196\u0190\3\2\2\2\u0196\u0191\3\2\2\2\u0196\u0192\3\2\2\2\u0197]"+
		"\3\2\2\2\u0198\u019a\5\u0086D\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2"+
		"\2\u019a\u019b\3\2\2\2\u019b\u019d\5\u0082B\2\u019c\u019e\5`\61\2\u019d"+
		"\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a6\3\2\2\2\u019f\u01a1\7\36"+
		"\2\2\u01a0\u01a2\5\60\31\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a7\7\16\2\2\u01a4\u01a5\7\22\2\2\u01a5\u01a7\5"+
		"h\65\2\u01a6\u019f\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"_\3\2\2\2\u01a8\u01aa\7\5\2\2\u01a9\u01ab\5\64\33\2\u01aa\u01a9\3\2\2"+
		"\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af\7\30\2\2\u01ad"+
		"\u01af\5|?\2\u01ae\u01a8\3\2\2\2\u01ae\u01ad\3\2\2\2\u01afa\3\2\2\2\u01b0"+
		"\u01b2\7D\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2"+
		"\2\2\u01b3\u01b5\5\26\f\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b7\5d\63\2\u01b7c\3\2\2\2\u01b8\u01ba\5l\67\2"+
		"\u01b9\u01bb\5f\64\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01c0"+
		"\3\2\2\2\u01bc\u01bd\5t;\2\u01bd\u01be\5f\64\2\u01be\u01c0\3\2\2\2\u01bf"+
		"\u01b8\3\2\2\2\u01bf\u01bc\3\2\2\2\u01c0e\3\2\2\2\u01c1\u01c6\5^\60\2"+
		"\u01c2\u01c3\7\34\2\2\u01c3\u01c5\5^\60\2\u01c4\u01c2\3\2\2\2\u01c5\u01c8"+
		"\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c9\u01ca\7/\2\2\u01cag\3\2\2\2\u01cb\u01d1\5\62\32\2"+
		"\u01cc\u01cd\7V\2\2\u01cd\u01ce\5j\66\2\u01ce\u01cf\7W\2\2\u01cf\u01d1"+
		"\3\2\2\2\u01d0\u01cb\3\2\2\2\u01d0\u01cc\3\2\2\2\u01d1i\3\2\2\2\u01d2"+
		"\u01d7\5h\65\2\u01d3\u01d4\7\34\2\2\u01d4\u01d6\5h\65\2\u01d5\u01d3\3"+
		"\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"k\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dc\7T\2\2\u01db\u01dd\5n8\2\u01dc"+
		"\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01e0\5p"+
		"9\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e2\7V\2\2\u01e2\u01e3\b\67\1\2\u01e3m\3\2\2\2\u01e4\u01e5\5\u0082"+
		"B\2\u01e5o\3\2\2\2\u01e6\u01e7\7\37\2\2\u01e7\u01ec\5r:\2\u01e8\u01e9"+
		"\7\34\2\2\u01e9\u01eb\5r:\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01edq\3\2\2\2\u01ee\u01ec\3\2\2\2"+
		"\u01ef\u01f1\7J\2\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3"+
		"\3\2\2\2\u01f2\u01f4\5\16\b\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2"+
		"\u01f4\u01f5\3\2\2\2\u01f5\u01f6\5\u0082B\2\u01f6s\3\2\2\2\u01f7\u01f9"+
		"\7I\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01ff\t\31"+
		"\2\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0205\5v<\2\u0201\u0202\7\7\2\2\u0202\u0203\5\30\r\2\u0203\u0204\7\62"+
		"\2\2\u0204\u0206\3\2\2\2\u0205\u0201\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0211\3\2\2\2\u0207\u0208\7\21\2\2\u0208\u020d\5v<\2\u0209\u020a\7\7"+
		"\2\2\u020a\u020b\5\30\r\2\u020b\u020c\7\62\2\2\u020c\u020e\3\2\2\2\u020d"+
		"\u0209\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u0207\3\2"+
		"\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0217\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0217\7F\2\2\u0215\u0217\7G\2"+
		"\2\u0216\u01fa\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0215\3\2\2\2\u0217u"+
		"\3\2\2\2\u0218\u021e\7U\2\2\u0219\u021e\7E\2\2\u021a\u021e\7H\2\2\u021b"+
		"\u021c\7H\2\2\u021c\u021e\7H\2\2\u021d\u0218\3\2\2\2\u021d\u0219\3\2\2"+
		"\2\u021d\u021a\3\2\2\2\u021d\u021b\3\2\2\2\u021ew\3\2\2\2\u021f\u0221"+
		"\t\32\2\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\3\2\2\2"+
		"\u0222\u0223\5t;\2\u0223y\3\2\2\2\u0224\u0227\5\u0082B\2\u0225\u0227\5"+
		"\16\b\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227{\3\2\2\2\u0228\u0229"+
		"\7\36\2\2\u0229\u022a\7E\2\2\u022a\u0238\7\16\2\2\u022b\u0234\7\36\2\2"+
		"\u022c\u0231\5~@\2\u022d\u022e\7\34\2\2\u022e\u0230\5~@\2\u022f\u022d"+
		"\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232"+
		"\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u022c\3\2\2\2\u0234\u0235\3\2"+
		"\2\2\u0235\u0236\3\2\2\2\u0236\u0238\7\16\2\2\u0237\u0228\3\2\2\2\u0237"+
		"\u022b\3\2\2\2\u0238}\3\2\2\2\u0239\u023a\5x=\2\u023a\u023b\5\u0080A\2"+
		"\u023b\177\3\2\2\2\u023c\u023e\5\u0086D\2\u023d\u023c\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023e\u0246\3\2\2\2\u023f\u0240\7\36\2\2\u0240\u0241\5\u0080"+
		"A\2\u0241\u0242\7\16\2\2\u0242\u0247\3\2\2\2\u0243\u0245\5z>\2\u0244\u0243"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u023f\3\2\2\2\u0246"+
		"\u0244\3\2\2\2\u0247\u0249\3\2\2\2\u0248\u024a\5`\61\2\u0249\u0248\3\2"+
		"\2\2\u0249\u024a\3\2\2\2\u024a\u0081\3\2\2\2\u024b\u0250\7U\2\2\u024c"+
		"\u024d\7\21\2\2\u024d\u024f\7U\2\2\u024e\u024c\3\2\2\2\u024f\u0252\3\2"+
		"\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0083\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0253\u0254\t\33\2\2\u0254\u0085\3\2\2\2\u0255\u0257\5"+
		"\f\7\2\u0256\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0256\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259\u0087\3\2\2\2E\u008b\u008d\u00a1\u00cb\u00df\u00e1"+
		"\u00fc\u0102\u010a\u010f\u0114\u0119\u011e\u0123\u0129\u012f\u0134\u0139"+
		"\u013e\u0146\u014c\u0156\u015e\u0163\u0169\u0170\u0179\u017c\u018a\u018e"+
		"\u0196\u0199\u019d\u01a1\u01a6\u01aa\u01ae\u01b1\u01b4\u01ba\u01bf\u01c6"+
		"\u01d0\u01d7\u01dc\u01df\u01ec\u01f0\u01f3\u01fa\u01fe\u0205\u020d\u0211"+
		"\u0216\u021d\u0220\u0226\u0231\u0234\u0237\u023d\u0244\u0246\u0249\u0250"+
		"\u0258";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}