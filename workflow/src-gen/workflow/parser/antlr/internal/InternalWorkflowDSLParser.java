package workflow.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import workflow.services.WorkflowDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWorkflowDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOL_LITERAL", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'workflow'", "'extends'", "'{'", "'parameters:'", "'['", "','", "']'", "'steps:'", "'}'", "'recurring:'", "'writeTo:'", "'readFrom:'", "'='"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_BOOL_LITERAL=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalWorkflowDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWorkflowDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWorkflowDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWorkflowDSL.g"; }



     	private WorkflowDSLGrammarAccess grammarAccess;

        public InternalWorkflowDSLParser(TokenStream input, WorkflowDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "WFModel";
       	}

       	@Override
       	protected WorkflowDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWFModel"
    // InternalWorkflowDSL.g:64:1: entryRuleWFModel returns [EObject current=null] : iv_ruleWFModel= ruleWFModel EOF ;
    public final EObject entryRuleWFModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWFModel = null;


        try {
            // InternalWorkflowDSL.g:64:48: (iv_ruleWFModel= ruleWFModel EOF )
            // InternalWorkflowDSL.g:65:2: iv_ruleWFModel= ruleWFModel EOF
            {
             newCompositeNode(grammarAccess.getWFModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWFModel=ruleWFModel();

            state._fsp--;

             current =iv_ruleWFModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWFModel"


    // $ANTLR start "ruleWFModel"
    // InternalWorkflowDSL.g:71:1: ruleWFModel returns [EObject current=null] : ( (lv_workflow_0_0= ruleWorkflow ) )* ;
    public final EObject ruleWFModel() throws RecognitionException {
        EObject current = null;

        EObject lv_workflow_0_0 = null;



        	enterRule();

        try {
            // InternalWorkflowDSL.g:77:2: ( ( (lv_workflow_0_0= ruleWorkflow ) )* )
            // InternalWorkflowDSL.g:78:2: ( (lv_workflow_0_0= ruleWorkflow ) )*
            {
            // InternalWorkflowDSL.g:78:2: ( (lv_workflow_0_0= ruleWorkflow ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWorkflowDSL.g:79:3: (lv_workflow_0_0= ruleWorkflow )
            	    {
            	    // InternalWorkflowDSL.g:79:3: (lv_workflow_0_0= ruleWorkflow )
            	    // InternalWorkflowDSL.g:80:4: lv_workflow_0_0= ruleWorkflow
            	    {

            	    				newCompositeNode(grammarAccess.getWFModelAccess().getWorkflowWorkflowParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_workflow_0_0=ruleWorkflow();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getWFModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"workflow",
            	    					lv_workflow_0_0,
            	    					"workflow.WorkflowDSL.Workflow");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWFModel"


    // $ANTLR start "entryRuleWorkflow"
    // InternalWorkflowDSL.g:100:1: entryRuleWorkflow returns [EObject current=null] : iv_ruleWorkflow= ruleWorkflow EOF ;
    public final EObject entryRuleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow = null;


        try {
            // InternalWorkflowDSL.g:100:49: (iv_ruleWorkflow= ruleWorkflow EOF )
            // InternalWorkflowDSL.g:101:2: iv_ruleWorkflow= ruleWorkflow EOF
            {
             newCompositeNode(grammarAccess.getWorkflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflow=ruleWorkflow();

            state._fsp--;

             current =iv_ruleWorkflow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflow"


    // $ANTLR start "ruleWorkflow"
    // InternalWorkflowDSL.g:107:1: ruleWorkflow returns [EObject current=null] : (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'parameters:' otherlv_6= '[' ( ( (lv_params_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )* )? otherlv_10= ']' )? (otherlv_11= 'steps:' otherlv_12= '[' ( (lv_steps_13_0= ruleStep ) ) (otherlv_14= ',' ( (lv_steps_15_0= ruleStep ) ) )* otherlv_16= ']' ) otherlv_17= '}' ) ;
    public final EObject ruleWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_params_7_0 = null;

        EObject lv_params_9_0 = null;

        EObject lv_steps_13_0 = null;

        EObject lv_steps_15_0 = null;



        	enterRule();

        try {
            // InternalWorkflowDSL.g:113:2: ( (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'parameters:' otherlv_6= '[' ( ( (lv_params_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )* )? otherlv_10= ']' )? (otherlv_11= 'steps:' otherlv_12= '[' ( (lv_steps_13_0= ruleStep ) ) (otherlv_14= ',' ( (lv_steps_15_0= ruleStep ) ) )* otherlv_16= ']' ) otherlv_17= '}' ) )
            // InternalWorkflowDSL.g:114:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'parameters:' otherlv_6= '[' ( ( (lv_params_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )* )? otherlv_10= ']' )? (otherlv_11= 'steps:' otherlv_12= '[' ( (lv_steps_13_0= ruleStep ) ) (otherlv_14= ',' ( (lv_steps_15_0= ruleStep ) ) )* otherlv_16= ']' ) otherlv_17= '}' )
            {
            // InternalWorkflowDSL.g:114:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'parameters:' otherlv_6= '[' ( ( (lv_params_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )* )? otherlv_10= ']' )? (otherlv_11= 'steps:' otherlv_12= '[' ( (lv_steps_13_0= ruleStep ) ) (otherlv_14= ',' ( (lv_steps_15_0= ruleStep ) ) )* otherlv_16= ']' ) otherlv_17= '}' )
            // InternalWorkflowDSL.g:115:3: otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'parameters:' otherlv_6= '[' ( ( (lv_params_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )* )? otherlv_10= ']' )? (otherlv_11= 'steps:' otherlv_12= '[' ( (lv_steps_13_0= ruleStep ) ) (otherlv_14= ',' ( (lv_steps_15_0= ruleStep ) ) )* otherlv_16= ']' ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowAccess().getWorkflowKeyword_0());
            		
            // InternalWorkflowDSL.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWorkflowDSL.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWorkflowDSL.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalWorkflowDSL.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkflowAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkflowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalWorkflowDSL.g:137:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalWorkflowDSL.g:138:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorkflowAccess().getExtendsKeyword_2_0());
                    			
                    // InternalWorkflowDSL.g:142:4: ( (otherlv_3= RULE_ID ) )
                    // InternalWorkflowDSL.g:143:5: (otherlv_3= RULE_ID )
                    {
                    // InternalWorkflowDSL.g:143:5: (otherlv_3= RULE_ID )
                    // InternalWorkflowDSL.g:144:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkflowRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getWorkflowAccess().getBaseWorkflowCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalWorkflowDSL.g:160:3: (otherlv_5= 'parameters:' otherlv_6= '[' ( ( (lv_params_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )* )? otherlv_10= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalWorkflowDSL.g:161:4: otherlv_5= 'parameters:' otherlv_6= '[' ( ( (lv_params_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )* )? otherlv_10= ']'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getWorkflowAccess().getParametersKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkflowAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalWorkflowDSL.g:169:4: ( ( (lv_params_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalWorkflowDSL.g:170:5: ( (lv_params_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )*
                            {
                            // InternalWorkflowDSL.g:170:5: ( (lv_params_7_0= ruleParameter ) )
                            // InternalWorkflowDSL.g:171:6: (lv_params_7_0= ruleParameter )
                            {
                            // InternalWorkflowDSL.g:171:6: (lv_params_7_0= ruleParameter )
                            // InternalWorkflowDSL.g:172:7: lv_params_7_0= ruleParameter
                            {

                            							newCompositeNode(grammarAccess.getWorkflowAccess().getParamsParameterParserRuleCall_4_2_0_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_params_7_0=ruleParameter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getWorkflowRule());
                            							}
                            							add(
                            								current,
                            								"params",
                            								lv_params_7_0,
                            								"workflow.WorkflowDSL.Parameter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalWorkflowDSL.g:189:5: (otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==17) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalWorkflowDSL.g:190:6: otherlv_8= ',' ( (lv_params_9_0= ruleParameter ) )
                            	    {
                            	    otherlv_8=(Token)match(input,17,FOLLOW_4); 

                            	    						newLeafNode(otherlv_8, grammarAccess.getWorkflowAccess().getCommaKeyword_4_2_1_0());
                            	    					
                            	    // InternalWorkflowDSL.g:194:6: ( (lv_params_9_0= ruleParameter ) )
                            	    // InternalWorkflowDSL.g:195:7: (lv_params_9_0= ruleParameter )
                            	    {
                            	    // InternalWorkflowDSL.g:195:7: (lv_params_9_0= ruleParameter )
                            	    // InternalWorkflowDSL.g:196:8: lv_params_9_0= ruleParameter
                            	    {

                            	    								newCompositeNode(grammarAccess.getWorkflowAccess().getParamsParameterParserRuleCall_4_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_10);
                            	    lv_params_9_0=ruleParameter();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getWorkflowRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"params",
                            	    									lv_params_9_0,
                            	    									"workflow.WorkflowDSL.Parameter");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getWorkflowAccess().getRightSquareBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalWorkflowDSL.g:220:3: (otherlv_11= 'steps:' otherlv_12= '[' ( (lv_steps_13_0= ruleStep ) ) (otherlv_14= ',' ( (lv_steps_15_0= ruleStep ) ) )* otherlv_16= ']' )
            // InternalWorkflowDSL.g:221:4: otherlv_11= 'steps:' otherlv_12= '[' ( (lv_steps_13_0= ruleStep ) ) (otherlv_14= ',' ( (lv_steps_15_0= ruleStep ) ) )* otherlv_16= ']'
            {
            otherlv_11=(Token)match(input,19,FOLLOW_8); 

            				newLeafNode(otherlv_11, grammarAccess.getWorkflowAccess().getStepsKeyword_5_0());
            			
            otherlv_12=(Token)match(input,16,FOLLOW_12); 

            				newLeafNode(otherlv_12, grammarAccess.getWorkflowAccess().getLeftSquareBracketKeyword_5_1());
            			
            // InternalWorkflowDSL.g:229:4: ( (lv_steps_13_0= ruleStep ) )
            // InternalWorkflowDSL.g:230:5: (lv_steps_13_0= ruleStep )
            {
            // InternalWorkflowDSL.g:230:5: (lv_steps_13_0= ruleStep )
            // InternalWorkflowDSL.g:231:6: lv_steps_13_0= ruleStep
            {

            						newCompositeNode(grammarAccess.getWorkflowAccess().getStepsStepParserRuleCall_5_2_0());
            					
            pushFollow(FOLLOW_10);
            lv_steps_13_0=ruleStep();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getWorkflowRule());
            						}
            						add(
            							current,
            							"steps",
            							lv_steps_13_0,
            							"workflow.WorkflowDSL.Step");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalWorkflowDSL.g:248:4: (otherlv_14= ',' ( (lv_steps_15_0= ruleStep ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWorkflowDSL.g:249:5: otherlv_14= ',' ( (lv_steps_15_0= ruleStep ) )
            	    {
            	    otherlv_14=(Token)match(input,17,FOLLOW_12); 

            	    					newLeafNode(otherlv_14, grammarAccess.getWorkflowAccess().getCommaKeyword_5_3_0());
            	    				
            	    // InternalWorkflowDSL.g:253:5: ( (lv_steps_15_0= ruleStep ) )
            	    // InternalWorkflowDSL.g:254:6: (lv_steps_15_0= ruleStep )
            	    {
            	    // InternalWorkflowDSL.g:254:6: (lv_steps_15_0= ruleStep )
            	    // InternalWorkflowDSL.g:255:7: lv_steps_15_0= ruleStep
            	    {

            	    							newCompositeNode(grammarAccess.getWorkflowAccess().getStepsStepParserRuleCall_5_3_1_0());
            	    						
            	    pushFollow(FOLLOW_10);
            	    lv_steps_15_0=ruleStep();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	    							}
            	    							add(
            	    								current,
            	    								"steps",
            	    								lv_steps_15_0,
            	    								"workflow.WorkflowDSL.Step");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_16=(Token)match(input,18,FOLLOW_13); 

            				newLeafNode(otherlv_16, grammarAccess.getWorkflowAccess().getRightSquareBracketKeyword_5_4());
            			

            }

            otherlv_17=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflow"


    // $ANTLR start "entryRuleStep"
    // InternalWorkflowDSL.g:286:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalWorkflowDSL.g:286:45: (iv_ruleStep= ruleStep EOF )
            // InternalWorkflowDSL.g:287:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalWorkflowDSL.g:293:1: ruleStep returns [EObject current=null] : ( (otherlv_0= '{' this_SourceStep_1= ruleSourceStep ) | this_IntermediateStep_2= ruleIntermediateStep | (this_SinkStep_3= ruleSinkStep otherlv_4= '}' ) ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_SourceStep_1 = null;

        EObject this_IntermediateStep_2 = null;

        EObject this_SinkStep_3 = null;



        	enterRule();

        try {
            // InternalWorkflowDSL.g:299:2: ( ( (otherlv_0= '{' this_SourceStep_1= ruleSourceStep ) | this_IntermediateStep_2= ruleIntermediateStep | (this_SinkStep_3= ruleSinkStep otherlv_4= '}' ) ) )
            // InternalWorkflowDSL.g:300:2: ( (otherlv_0= '{' this_SourceStep_1= ruleSourceStep ) | this_IntermediateStep_2= ruleIntermediateStep | (this_SinkStep_3= ruleSinkStep otherlv_4= '}' ) )
            {
            // InternalWorkflowDSL.g:300:2: ( (otherlv_0= '{' this_SourceStep_1= ruleSourceStep ) | this_IntermediateStep_2= ruleIntermediateStep | (this_SinkStep_3= ruleSinkStep otherlv_4= '}' ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalWorkflowDSL.g:301:3: (otherlv_0= '{' this_SourceStep_1= ruleSourceStep )
                    {
                    // InternalWorkflowDSL.g:301:3: (otherlv_0= '{' this_SourceStep_1= ruleSourceStep )
                    // InternalWorkflowDSL.g:302:4: otherlv_0= '{' this_SourceStep_1= ruleSourceStep
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getStepAccess().getSourceStepParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_SourceStep_1=ruleSourceStep();

                    state._fsp--;


                    				current = this_SourceStep_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWorkflowDSL.g:316:3: this_IntermediateStep_2= ruleIntermediateStep
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getIntermediateStepParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntermediateStep_2=ruleIntermediateStep();

                    state._fsp--;


                    			current = this_IntermediateStep_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalWorkflowDSL.g:325:3: (this_SinkStep_3= ruleSinkStep otherlv_4= '}' )
                    {
                    // InternalWorkflowDSL.g:325:3: (this_SinkStep_3= ruleSinkStep otherlv_4= '}' )
                    // InternalWorkflowDSL.g:326:4: this_SinkStep_3= ruleSinkStep otherlv_4= '}'
                    {

                    				newCompositeNode(grammarAccess.getStepAccess().getSinkStepParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_13);
                    this_SinkStep_3=ruleSinkStep();

                    state._fsp--;


                    				current = this_SinkStep_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getStepAccess().getRightCurlyBracketKeyword_2_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleSourceStep"
    // InternalWorkflowDSL.g:343:1: entryRuleSourceStep returns [EObject current=null] : iv_ruleSourceStep= ruleSourceStep EOF ;
    public final EObject entryRuleSourceStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceStep = null;


        try {
            // InternalWorkflowDSL.g:343:51: (iv_ruleSourceStep= ruleSourceStep EOF )
            // InternalWorkflowDSL.g:344:2: iv_ruleSourceStep= ruleSourceStep EOF
            {
             newCompositeNode(grammarAccess.getSourceStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceStep=ruleSourceStep();

            state._fsp--;

             current =iv_ruleSourceStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceStep"


    // $ANTLR start "ruleSourceStep"
    // InternalWorkflowDSL.g:350:1: ruleSourceStep returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )? (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )? (otherlv_9= 'writeTo:' ( (lv_writeTo_10_0= ruleMessageQueue ) ) ) ) ;
    public final EObject ruleSourceStep() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_recurring_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_writeTo_10_0 = null;



        	enterRule();

        try {
            // InternalWorkflowDSL.g:356:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )? (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )? (otherlv_9= 'writeTo:' ( (lv_writeTo_10_0= ruleMessageQueue ) ) ) ) )
            // InternalWorkflowDSL.g:357:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )? (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )? (otherlv_9= 'writeTo:' ( (lv_writeTo_10_0= ruleMessageQueue ) ) ) )
            {
            // InternalWorkflowDSL.g:357:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )? (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )? (otherlv_9= 'writeTo:' ( (lv_writeTo_10_0= ruleMessageQueue ) ) ) )
            // InternalWorkflowDSL.g:358:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )? (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )? (otherlv_9= 'writeTo:' ( (lv_writeTo_10_0= ruleMessageQueue ) ) )
            {
            // InternalWorkflowDSL.g:358:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalWorkflowDSL.g:359:4: (lv_name_0_0= RULE_ID )
            {
            // InternalWorkflowDSL.g:359:4: (lv_name_0_0= RULE_ID )
            // InternalWorkflowDSL.g:360:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSourceStepAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalWorkflowDSL.g:376:3: (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalWorkflowDSL.g:377:4: otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getSourceStepAccess().getRecurringKeyword_1_0());
                    			
                    // InternalWorkflowDSL.g:381:4: ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) )
                    // InternalWorkflowDSL.g:382:5: (lv_recurring_2_0= RULE_BOOL_LITERAL )
                    {
                    // InternalWorkflowDSL.g:382:5: (lv_recurring_2_0= RULE_BOOL_LITERAL )
                    // InternalWorkflowDSL.g:383:6: lv_recurring_2_0= RULE_BOOL_LITERAL
                    {
                    lv_recurring_2_0=(Token)match(input,RULE_BOOL_LITERAL,FOLLOW_16); 

                    						newLeafNode(lv_recurring_2_0, grammarAccess.getSourceStepAccess().getRecurringBOOL_LITERALTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSourceStepRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"recurring",
                    							lv_recurring_2_0,
                    							"workflow.WorkflowDSL.BOOL_LITERAL");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWorkflowDSL.g:400:3: (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalWorkflowDSL.g:401:4: otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getSourceStepAccess().getParametersKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getSourceStepAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalWorkflowDSL.g:409:4: ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalWorkflowDSL.g:410:5: ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )*
                            {
                            // InternalWorkflowDSL.g:410:5: ( (lv_params_5_0= ruleParameter ) )
                            // InternalWorkflowDSL.g:411:6: (lv_params_5_0= ruleParameter )
                            {
                            // InternalWorkflowDSL.g:411:6: (lv_params_5_0= ruleParameter )
                            // InternalWorkflowDSL.g:412:7: lv_params_5_0= ruleParameter
                            {

                            							newCompositeNode(grammarAccess.getSourceStepAccess().getParamsParameterParserRuleCall_2_2_0_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_params_5_0=ruleParameter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSourceStepRule());
                            							}
                            							add(
                            								current,
                            								"params",
                            								lv_params_5_0,
                            								"workflow.WorkflowDSL.Parameter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalWorkflowDSL.g:429:5: (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==17) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // InternalWorkflowDSL.g:430:6: otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) )
                            	    {
                            	    otherlv_6=(Token)match(input,17,FOLLOW_4); 

                            	    						newLeafNode(otherlv_6, grammarAccess.getSourceStepAccess().getCommaKeyword_2_2_1_0());
                            	    					
                            	    // InternalWorkflowDSL.g:434:6: ( (lv_params_7_0= ruleParameter ) )
                            	    // InternalWorkflowDSL.g:435:7: (lv_params_7_0= ruleParameter )
                            	    {
                            	    // InternalWorkflowDSL.g:435:7: (lv_params_7_0= ruleParameter )
                            	    // InternalWorkflowDSL.g:436:8: lv_params_7_0= ruleParameter
                            	    {

                            	    								newCompositeNode(grammarAccess.getSourceStepAccess().getParamsParameterParserRuleCall_2_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_10);
                            	    lv_params_7_0=ruleParameter();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getSourceStepRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"params",
                            	    									lv_params_7_0,
                            	    									"workflow.WorkflowDSL.Parameter");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop9;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getSourceStepAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalWorkflowDSL.g:460:3: (otherlv_9= 'writeTo:' ( (lv_writeTo_10_0= ruleMessageQueue ) ) )
            // InternalWorkflowDSL.g:461:4: otherlv_9= 'writeTo:' ( (lv_writeTo_10_0= ruleMessageQueue ) )
            {
            otherlv_9=(Token)match(input,22,FOLLOW_4); 

            				newLeafNode(otherlv_9, grammarAccess.getSourceStepAccess().getWriteToKeyword_3_0());
            			
            // InternalWorkflowDSL.g:465:4: ( (lv_writeTo_10_0= ruleMessageQueue ) )
            // InternalWorkflowDSL.g:466:5: (lv_writeTo_10_0= ruleMessageQueue )
            {
            // InternalWorkflowDSL.g:466:5: (lv_writeTo_10_0= ruleMessageQueue )
            // InternalWorkflowDSL.g:467:6: lv_writeTo_10_0= ruleMessageQueue
            {

            						newCompositeNode(grammarAccess.getSourceStepAccess().getWriteToMessageQueueParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_writeTo_10_0=ruleMessageQueue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getSourceStepRule());
            						}
            						set(
            							current,
            							"writeTo",
            							lv_writeTo_10_0,
            							"workflow.WorkflowDSL.MessageQueue");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceStep"


    // $ANTLR start "entryRuleIntermediateStep"
    // InternalWorkflowDSL.g:489:1: entryRuleIntermediateStep returns [EObject current=null] : iv_ruleIntermediateStep= ruleIntermediateStep EOF ;
    public final EObject entryRuleIntermediateStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntermediateStep = null;


        try {
            // InternalWorkflowDSL.g:489:57: (iv_ruleIntermediateStep= ruleIntermediateStep EOF )
            // InternalWorkflowDSL.g:490:2: iv_ruleIntermediateStep= ruleIntermediateStep EOF
            {
             newCompositeNode(grammarAccess.getIntermediateStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntermediateStep=ruleIntermediateStep();

            state._fsp--;

             current =iv_ruleIntermediateStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntermediateStep"


    // $ANTLR start "ruleIntermediateStep"
    // InternalWorkflowDSL.g:496:1: ruleIntermediateStep returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )? (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )? (otherlv_9= 'readFrom:' ( (lv_readFrom_10_0= ruleMessageQueue ) ) ) (otherlv_11= 'writeTo:' ( (lv_writeTo_12_0= ruleMessageQueue ) ) ) ) ;
    public final EObject ruleIntermediateStep() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_recurring_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_readFrom_10_0 = null;

        EObject lv_writeTo_12_0 = null;



        	enterRule();

        try {
            // InternalWorkflowDSL.g:502:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )? (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )? (otherlv_9= 'readFrom:' ( (lv_readFrom_10_0= ruleMessageQueue ) ) ) (otherlv_11= 'writeTo:' ( (lv_writeTo_12_0= ruleMessageQueue ) ) ) ) )
            // InternalWorkflowDSL.g:503:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )? (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )? (otherlv_9= 'readFrom:' ( (lv_readFrom_10_0= ruleMessageQueue ) ) ) (otherlv_11= 'writeTo:' ( (lv_writeTo_12_0= ruleMessageQueue ) ) ) )
            {
            // InternalWorkflowDSL.g:503:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )? (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )? (otherlv_9= 'readFrom:' ( (lv_readFrom_10_0= ruleMessageQueue ) ) ) (otherlv_11= 'writeTo:' ( (lv_writeTo_12_0= ruleMessageQueue ) ) ) )
            // InternalWorkflowDSL.g:504:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )? (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )? (otherlv_9= 'readFrom:' ( (lv_readFrom_10_0= ruleMessageQueue ) ) ) (otherlv_11= 'writeTo:' ( (lv_writeTo_12_0= ruleMessageQueue ) ) )
            {
            // InternalWorkflowDSL.g:504:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalWorkflowDSL.g:505:4: (lv_name_0_0= RULE_ID )
            {
            // InternalWorkflowDSL.g:505:4: (lv_name_0_0= RULE_ID )
            // InternalWorkflowDSL.g:506:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIntermediateStepAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntermediateStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalWorkflowDSL.g:522:3: (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalWorkflowDSL.g:523:4: otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getIntermediateStepAccess().getRecurringKeyword_1_0());
                    			
                    // InternalWorkflowDSL.g:527:4: ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) )
                    // InternalWorkflowDSL.g:528:5: (lv_recurring_2_0= RULE_BOOL_LITERAL )
                    {
                    // InternalWorkflowDSL.g:528:5: (lv_recurring_2_0= RULE_BOOL_LITERAL )
                    // InternalWorkflowDSL.g:529:6: lv_recurring_2_0= RULE_BOOL_LITERAL
                    {
                    lv_recurring_2_0=(Token)match(input,RULE_BOOL_LITERAL,FOLLOW_19); 

                    						newLeafNode(lv_recurring_2_0, grammarAccess.getIntermediateStepAccess().getRecurringBOOL_LITERALTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntermediateStepRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"recurring",
                    							lv_recurring_2_0,
                    							"workflow.WorkflowDSL.BOOL_LITERAL");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWorkflowDSL.g:546:3: (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalWorkflowDSL.g:547:4: otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntermediateStepAccess().getParametersKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getIntermediateStepAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalWorkflowDSL.g:555:4: ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_ID) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalWorkflowDSL.g:556:5: ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )*
                            {
                            // InternalWorkflowDSL.g:556:5: ( (lv_params_5_0= ruleParameter ) )
                            // InternalWorkflowDSL.g:557:6: (lv_params_5_0= ruleParameter )
                            {
                            // InternalWorkflowDSL.g:557:6: (lv_params_5_0= ruleParameter )
                            // InternalWorkflowDSL.g:558:7: lv_params_5_0= ruleParameter
                            {

                            							newCompositeNode(grammarAccess.getIntermediateStepAccess().getParamsParameterParserRuleCall_2_2_0_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_params_5_0=ruleParameter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getIntermediateStepRule());
                            							}
                            							add(
                            								current,
                            								"params",
                            								lv_params_5_0,
                            								"workflow.WorkflowDSL.Parameter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalWorkflowDSL.g:575:5: (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==17) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // InternalWorkflowDSL.g:576:6: otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) )
                            	    {
                            	    otherlv_6=(Token)match(input,17,FOLLOW_4); 

                            	    						newLeafNode(otherlv_6, grammarAccess.getIntermediateStepAccess().getCommaKeyword_2_2_1_0());
                            	    					
                            	    // InternalWorkflowDSL.g:580:6: ( (lv_params_7_0= ruleParameter ) )
                            	    // InternalWorkflowDSL.g:581:7: (lv_params_7_0= ruleParameter )
                            	    {
                            	    // InternalWorkflowDSL.g:581:7: (lv_params_7_0= ruleParameter )
                            	    // InternalWorkflowDSL.g:582:8: lv_params_7_0= ruleParameter
                            	    {

                            	    								newCompositeNode(grammarAccess.getIntermediateStepAccess().getParamsParameterParserRuleCall_2_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_10);
                            	    lv_params_7_0=ruleParameter();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getIntermediateStepRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"params",
                            	    									lv_params_7_0,
                            	    									"workflow.WorkflowDSL.Parameter");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop13;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getIntermediateStepAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalWorkflowDSL.g:606:3: (otherlv_9= 'readFrom:' ( (lv_readFrom_10_0= ruleMessageQueue ) ) )
            // InternalWorkflowDSL.g:607:4: otherlv_9= 'readFrom:' ( (lv_readFrom_10_0= ruleMessageQueue ) )
            {
            otherlv_9=(Token)match(input,23,FOLLOW_4); 

            				newLeafNode(otherlv_9, grammarAccess.getIntermediateStepAccess().getReadFromKeyword_3_0());
            			
            // InternalWorkflowDSL.g:611:4: ( (lv_readFrom_10_0= ruleMessageQueue ) )
            // InternalWorkflowDSL.g:612:5: (lv_readFrom_10_0= ruleMessageQueue )
            {
            // InternalWorkflowDSL.g:612:5: (lv_readFrom_10_0= ruleMessageQueue )
            // InternalWorkflowDSL.g:613:6: lv_readFrom_10_0= ruleMessageQueue
            {

            						newCompositeNode(grammarAccess.getIntermediateStepAccess().getReadFromMessageQueueParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_17);
            lv_readFrom_10_0=ruleMessageQueue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getIntermediateStepRule());
            						}
            						set(
            							current,
            							"readFrom",
            							lv_readFrom_10_0,
            							"workflow.WorkflowDSL.MessageQueue");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalWorkflowDSL.g:631:3: (otherlv_11= 'writeTo:' ( (lv_writeTo_12_0= ruleMessageQueue ) ) )
            // InternalWorkflowDSL.g:632:4: otherlv_11= 'writeTo:' ( (lv_writeTo_12_0= ruleMessageQueue ) )
            {
            otherlv_11=(Token)match(input,22,FOLLOW_4); 

            				newLeafNode(otherlv_11, grammarAccess.getIntermediateStepAccess().getWriteToKeyword_4_0());
            			
            // InternalWorkflowDSL.g:636:4: ( (lv_writeTo_12_0= ruleMessageQueue ) )
            // InternalWorkflowDSL.g:637:5: (lv_writeTo_12_0= ruleMessageQueue )
            {
            // InternalWorkflowDSL.g:637:5: (lv_writeTo_12_0= ruleMessageQueue )
            // InternalWorkflowDSL.g:638:6: lv_writeTo_12_0= ruleMessageQueue
            {

            						newCompositeNode(grammarAccess.getIntermediateStepAccess().getWriteToMessageQueueParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_writeTo_12_0=ruleMessageQueue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getIntermediateStepRule());
            						}
            						set(
            							current,
            							"writeTo",
            							lv_writeTo_12_0,
            							"workflow.WorkflowDSL.MessageQueue");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntermediateStep"


    // $ANTLR start "entryRuleSinkStep"
    // InternalWorkflowDSL.g:660:1: entryRuleSinkStep returns [EObject current=null] : iv_ruleSinkStep= ruleSinkStep EOF ;
    public final EObject entryRuleSinkStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSinkStep = null;


        try {
            // InternalWorkflowDSL.g:660:49: (iv_ruleSinkStep= ruleSinkStep EOF )
            // InternalWorkflowDSL.g:661:2: iv_ruleSinkStep= ruleSinkStep EOF
            {
             newCompositeNode(grammarAccess.getSinkStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSinkStep=ruleSinkStep();

            state._fsp--;

             current =iv_ruleSinkStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSinkStep"


    // $ANTLR start "ruleSinkStep"
    // InternalWorkflowDSL.g:667:1: ruleSinkStep returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )? (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )? (otherlv_9= 'readFrom:' ( (lv_readFrom_10_0= ruleMessageQueue ) ) ) ) ;
    public final EObject ruleSinkStep() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_recurring_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_readFrom_10_0 = null;



        	enterRule();

        try {
            // InternalWorkflowDSL.g:673:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )? (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )? (otherlv_9= 'readFrom:' ( (lv_readFrom_10_0= ruleMessageQueue ) ) ) ) )
            // InternalWorkflowDSL.g:674:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )? (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )? (otherlv_9= 'readFrom:' ( (lv_readFrom_10_0= ruleMessageQueue ) ) ) )
            {
            // InternalWorkflowDSL.g:674:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )? (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )? (otherlv_9= 'readFrom:' ( (lv_readFrom_10_0= ruleMessageQueue ) ) ) )
            // InternalWorkflowDSL.g:675:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )? (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )? (otherlv_9= 'readFrom:' ( (lv_readFrom_10_0= ruleMessageQueue ) ) )
            {
            // InternalWorkflowDSL.g:675:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalWorkflowDSL.g:676:4: (lv_name_0_0= RULE_ID )
            {
            // InternalWorkflowDSL.g:676:4: (lv_name_0_0= RULE_ID )
            // InternalWorkflowDSL.g:677:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSinkStepAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSinkStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalWorkflowDSL.g:693:3: (otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalWorkflowDSL.g:694:4: otherlv_1= 'recurring:' ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getSinkStepAccess().getRecurringKeyword_1_0());
                    			
                    // InternalWorkflowDSL.g:698:4: ( (lv_recurring_2_0= RULE_BOOL_LITERAL ) )
                    // InternalWorkflowDSL.g:699:5: (lv_recurring_2_0= RULE_BOOL_LITERAL )
                    {
                    // InternalWorkflowDSL.g:699:5: (lv_recurring_2_0= RULE_BOOL_LITERAL )
                    // InternalWorkflowDSL.g:700:6: lv_recurring_2_0= RULE_BOOL_LITERAL
                    {
                    lv_recurring_2_0=(Token)match(input,RULE_BOOL_LITERAL,FOLLOW_19); 

                    						newLeafNode(lv_recurring_2_0, grammarAccess.getSinkStepAccess().getRecurringBOOL_LITERALTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSinkStepRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"recurring",
                    							lv_recurring_2_0,
                    							"workflow.WorkflowDSL.BOOL_LITERAL");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWorkflowDSL.g:717:3: (otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalWorkflowDSL.g:718:4: otherlv_3= 'parameters:' otherlv_4= '[' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getSinkStepAccess().getParametersKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getSinkStepAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalWorkflowDSL.g:726:4: ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalWorkflowDSL.g:727:5: ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )*
                            {
                            // InternalWorkflowDSL.g:727:5: ( (lv_params_5_0= ruleParameter ) )
                            // InternalWorkflowDSL.g:728:6: (lv_params_5_0= ruleParameter )
                            {
                            // InternalWorkflowDSL.g:728:6: (lv_params_5_0= ruleParameter )
                            // InternalWorkflowDSL.g:729:7: lv_params_5_0= ruleParameter
                            {

                            							newCompositeNode(grammarAccess.getSinkStepAccess().getParamsParameterParserRuleCall_2_2_0_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_params_5_0=ruleParameter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSinkStepRule());
                            							}
                            							add(
                            								current,
                            								"params",
                            								lv_params_5_0,
                            								"workflow.WorkflowDSL.Parameter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalWorkflowDSL.g:746:5: (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==17) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalWorkflowDSL.g:747:6: otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) )
                            	    {
                            	    otherlv_6=(Token)match(input,17,FOLLOW_4); 

                            	    						newLeafNode(otherlv_6, grammarAccess.getSinkStepAccess().getCommaKeyword_2_2_1_0());
                            	    					
                            	    // InternalWorkflowDSL.g:751:6: ( (lv_params_7_0= ruleParameter ) )
                            	    // InternalWorkflowDSL.g:752:7: (lv_params_7_0= ruleParameter )
                            	    {
                            	    // InternalWorkflowDSL.g:752:7: (lv_params_7_0= ruleParameter )
                            	    // InternalWorkflowDSL.g:753:8: lv_params_7_0= ruleParameter
                            	    {

                            	    								newCompositeNode(grammarAccess.getSinkStepAccess().getParamsParameterParserRuleCall_2_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_10);
                            	    lv_params_7_0=ruleParameter();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getSinkStepRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"params",
                            	    									lv_params_7_0,
                            	    									"workflow.WorkflowDSL.Parameter");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getSinkStepAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalWorkflowDSL.g:777:3: (otherlv_9= 'readFrom:' ( (lv_readFrom_10_0= ruleMessageQueue ) ) )
            // InternalWorkflowDSL.g:778:4: otherlv_9= 'readFrom:' ( (lv_readFrom_10_0= ruleMessageQueue ) )
            {
            otherlv_9=(Token)match(input,23,FOLLOW_4); 

            				newLeafNode(otherlv_9, grammarAccess.getSinkStepAccess().getReadFromKeyword_3_0());
            			
            // InternalWorkflowDSL.g:782:4: ( (lv_readFrom_10_0= ruleMessageQueue ) )
            // InternalWorkflowDSL.g:783:5: (lv_readFrom_10_0= ruleMessageQueue )
            {
            // InternalWorkflowDSL.g:783:5: (lv_readFrom_10_0= ruleMessageQueue )
            // InternalWorkflowDSL.g:784:6: lv_readFrom_10_0= ruleMessageQueue
            {

            						newCompositeNode(grammarAccess.getSinkStepAccess().getReadFromMessageQueueParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_readFrom_10_0=ruleMessageQueue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getSinkStepRule());
            						}
            						set(
            							current,
            							"readFrom",
            							lv_readFrom_10_0,
            							"workflow.WorkflowDSL.MessageQueue");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSinkStep"


    // $ANTLR start "entryRuleMessageQueue"
    // InternalWorkflowDSL.g:806:1: entryRuleMessageQueue returns [EObject current=null] : iv_ruleMessageQueue= ruleMessageQueue EOF ;
    public final EObject entryRuleMessageQueue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageQueue = null;


        try {
            // InternalWorkflowDSL.g:806:53: (iv_ruleMessageQueue= ruleMessageQueue EOF )
            // InternalWorkflowDSL.g:807:2: iv_ruleMessageQueue= ruleMessageQueue EOF
            {
             newCompositeNode(grammarAccess.getMessageQueueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageQueue=ruleMessageQueue();

            state._fsp--;

             current =iv_ruleMessageQueue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageQueue"


    // $ANTLR start "ruleMessageQueue"
    // InternalWorkflowDSL.g:813:1: ruleMessageQueue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMessageQueue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalWorkflowDSL.g:819:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalWorkflowDSL.g:820:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalWorkflowDSL.g:820:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalWorkflowDSL.g:821:3: (lv_name_0_0= RULE_ID )
            {
            // InternalWorkflowDSL.g:821:3: (lv_name_0_0= RULE_ID )
            // InternalWorkflowDSL.g:822:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getMessageQueueAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMessageQueueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageQueue"


    // $ANTLR start "entryRuleParameter"
    // InternalWorkflowDSL.g:841:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalWorkflowDSL.g:841:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalWorkflowDSL.g:842:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalWorkflowDSL.g:848:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleParameterValueTypes ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalWorkflowDSL.g:854:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleParameterValueTypes ) ) )? ) )
            // InternalWorkflowDSL.g:855:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleParameterValueTypes ) ) )? )
            {
            // InternalWorkflowDSL.g:855:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleParameterValueTypes ) ) )? )
            // InternalWorkflowDSL.g:856:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleParameterValueTypes ) ) )?
            {
            // InternalWorkflowDSL.g:856:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalWorkflowDSL.g:857:4: (lv_name_0_0= RULE_ID )
            {
            // InternalWorkflowDSL.g:857:4: (lv_name_0_0= RULE_ID )
            // InternalWorkflowDSL.g:858:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalWorkflowDSL.g:874:3: (otherlv_1= '=' ( (lv_value_2_0= ruleParameterValueTypes ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalWorkflowDSL.g:875:4: otherlv_1= '=' ( (lv_value_2_0= ruleParameterValueTypes ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalWorkflowDSL.g:879:4: ( (lv_value_2_0= ruleParameterValueTypes ) )
                    // InternalWorkflowDSL.g:880:5: (lv_value_2_0= ruleParameterValueTypes )
                    {
                    // InternalWorkflowDSL.g:880:5: (lv_value_2_0= ruleParameterValueTypes )
                    // InternalWorkflowDSL.g:881:6: lv_value_2_0= ruleParameterValueTypes
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getValueParameterValueTypesParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleParameterValueTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"workflow.WorkflowDSL.ParameterValueTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameterValueTypes"
    // InternalWorkflowDSL.g:903:1: entryRuleParameterValueTypes returns [EObject current=null] : iv_ruleParameterValueTypes= ruleParameterValueTypes EOF ;
    public final EObject entryRuleParameterValueTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValueTypes = null;


        try {
            // InternalWorkflowDSL.g:903:60: (iv_ruleParameterValueTypes= ruleParameterValueTypes EOF )
            // InternalWorkflowDSL.g:904:2: iv_ruleParameterValueTypes= ruleParameterValueTypes EOF
            {
             newCompositeNode(grammarAccess.getParameterValueTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterValueTypes=ruleParameterValueTypes();

            state._fsp--;

             current =iv_ruleParameterValueTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterValueTypes"


    // $ANTLR start "ruleParameterValueTypes"
    // InternalWorkflowDSL.g:910:1: ruleParameterValueTypes returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOL_LITERAL ) ) ) | ( () ( (lv_value_7_0= RULE_ID ) ) ) ) ;
    public final EObject ruleParameterValueTypes() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;


        	enterRule();

        try {
            // InternalWorkflowDSL.g:916:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOL_LITERAL ) ) ) | ( () ( (lv_value_7_0= RULE_ID ) ) ) ) )
            // InternalWorkflowDSL.g:917:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOL_LITERAL ) ) ) | ( () ( (lv_value_7_0= RULE_ID ) ) ) )
            {
            // InternalWorkflowDSL.g:917:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_BOOL_LITERAL ) ) ) | ( () ( (lv_value_7_0= RULE_ID ) ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt21=1;
                }
                break;
            case RULE_INT:
                {
                alt21=2;
                }
                break;
            case RULE_BOOL_LITERAL:
                {
                alt21=3;
                }
                break;
            case RULE_ID:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalWorkflowDSL.g:918:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalWorkflowDSL.g:918:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalWorkflowDSL.g:919:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalWorkflowDSL.g:919:4: ()
                    // InternalWorkflowDSL.g:920:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getParameterValueTypesAccess().getStringTypeAction_0_0(),
                    						current);
                    				

                    }

                    // InternalWorkflowDSL.g:926:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalWorkflowDSL.g:927:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalWorkflowDSL.g:927:5: (lv_value_1_0= RULE_STRING )
                    // InternalWorkflowDSL.g:928:6: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getParameterValueTypesAccess().getValueSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterValueTypesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWorkflowDSL.g:946:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalWorkflowDSL.g:946:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalWorkflowDSL.g:947:4: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalWorkflowDSL.g:947:4: ()
                    // InternalWorkflowDSL.g:948:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getParameterValueTypesAccess().getIntTypeAction_1_0(),
                    						current);
                    				

                    }

                    // InternalWorkflowDSL.g:954:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalWorkflowDSL.g:955:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalWorkflowDSL.g:955:5: (lv_value_3_0= RULE_INT )
                    // InternalWorkflowDSL.g:956:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getParameterValueTypesAccess().getValueINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterValueTypesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWorkflowDSL.g:974:3: ( () ( (lv_value_5_0= RULE_BOOL_LITERAL ) ) )
                    {
                    // InternalWorkflowDSL.g:974:3: ( () ( (lv_value_5_0= RULE_BOOL_LITERAL ) ) )
                    // InternalWorkflowDSL.g:975:4: () ( (lv_value_5_0= RULE_BOOL_LITERAL ) )
                    {
                    // InternalWorkflowDSL.g:975:4: ()
                    // InternalWorkflowDSL.g:976:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getParameterValueTypesAccess().getBoolTypeAction_2_0(),
                    						current);
                    				

                    }

                    // InternalWorkflowDSL.g:982:4: ( (lv_value_5_0= RULE_BOOL_LITERAL ) )
                    // InternalWorkflowDSL.g:983:5: (lv_value_5_0= RULE_BOOL_LITERAL )
                    {
                    // InternalWorkflowDSL.g:983:5: (lv_value_5_0= RULE_BOOL_LITERAL )
                    // InternalWorkflowDSL.g:984:6: lv_value_5_0= RULE_BOOL_LITERAL
                    {
                    lv_value_5_0=(Token)match(input,RULE_BOOL_LITERAL,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getParameterValueTypesAccess().getValueBOOL_LITERALTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterValueTypesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"workflow.WorkflowDSL.BOOL_LITERAL");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalWorkflowDSL.g:1002:3: ( () ( (lv_value_7_0= RULE_ID ) ) )
                    {
                    // InternalWorkflowDSL.g:1002:3: ( () ( (lv_value_7_0= RULE_ID ) ) )
                    // InternalWorkflowDSL.g:1003:4: () ( (lv_value_7_0= RULE_ID ) )
                    {
                    // InternalWorkflowDSL.g:1003:4: ()
                    // InternalWorkflowDSL.g:1004:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getParameterValueTypesAccess().getIdentifierAction_3_0(),
                    						current);
                    				

                    }

                    // InternalWorkflowDSL.g:1010:4: ( (lv_value_7_0= RULE_ID ) )
                    // InternalWorkflowDSL.g:1011:5: (lv_value_7_0= RULE_ID )
                    {
                    // InternalWorkflowDSL.g:1011:5: (lv_value_7_0= RULE_ID )
                    // InternalWorkflowDSL.g:1012:6: lv_value_7_0= RULE_ID
                    {
                    lv_value_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getParameterValueTypesAccess().getValueIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterValueTypesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterValueTypes"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\17\1\5\1\20\1\4\1\17\1\4\1\24\1\21\1\27\2\uffff\2\4\5\21\1\4\4\21";
    static final String dfa_3s = "\1\16\1\uffff\1\27\1\5\1\20\1\4\1\27\1\22\1\26\1\30\1\27\2\uffff\1\7\1\4\4\22\1\30\1\7\4\22";
    static final String dfa_4s = "\1\uffff\1\1\11\uffff\1\2\1\3\14\uffff";
    static final String dfa_5s = "\31\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\11\uffff\1\1",
            "",
            "\1\4\5\uffff\1\3\1\uffff\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\4\7\uffff\1\5",
            "\1\11\15\uffff\1\12",
            "\1\14\1\uffff\1\13",
            "\1\16\1\12\5\uffff\1\15",
            "\1\5",
            "",
            "",
            "\1\22\1\21\1\17\1\20",
            "\1\23",
            "\1\16\1\12",
            "\1\16\1\12",
            "\1\16\1\12",
            "\1\16\1\12",
            "\1\16\1\12\5\uffff\1\24",
            "\1\30\1\27\1\25\1\26",
            "\1\16\1\12",
            "\1\16\1\12",
            "\1\16\1\12",
            "\1\16\1\12"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "300:2: ( (otherlv_0= '{' this_SourceStep_1= ruleSourceStep ) | this_IntermediateStep_2= ruleIntermediateStep | (this_SinkStep_3= ruleSinkStep otherlv_4= '}' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000608000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000A08000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000000F0L});

}