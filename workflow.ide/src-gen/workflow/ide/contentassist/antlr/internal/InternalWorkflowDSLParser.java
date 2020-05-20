package workflow.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import workflow.services.WorkflowDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWorkflowDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOL_LITERAL", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'workflow'", "'{'", "'}'", "'extends'", "'parameters:'", "'['", "']'", "','", "'steps:'", "'recurring:'", "'writeTo:'", "'readFrom:'", "'='"
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

    	public void setGrammarAccess(WorkflowDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleWFModel"
    // InternalWorkflowDSL.g:53:1: entryRuleWFModel : ruleWFModel EOF ;
    public final void entryRuleWFModel() throws RecognitionException {
        try {
            // InternalWorkflowDSL.g:54:1: ( ruleWFModel EOF )
            // InternalWorkflowDSL.g:55:1: ruleWFModel EOF
            {
             before(grammarAccess.getWFModelRule()); 
            pushFollow(FOLLOW_1);
            ruleWFModel();

            state._fsp--;

             after(grammarAccess.getWFModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWFModel"


    // $ANTLR start "ruleWFModel"
    // InternalWorkflowDSL.g:62:1: ruleWFModel : ( ( rule__WFModel__WorkflowAssignment )* ) ;
    public final void ruleWFModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:66:2: ( ( ( rule__WFModel__WorkflowAssignment )* ) )
            // InternalWorkflowDSL.g:67:2: ( ( rule__WFModel__WorkflowAssignment )* )
            {
            // InternalWorkflowDSL.g:67:2: ( ( rule__WFModel__WorkflowAssignment )* )
            // InternalWorkflowDSL.g:68:3: ( rule__WFModel__WorkflowAssignment )*
            {
             before(grammarAccess.getWFModelAccess().getWorkflowAssignment()); 
            // InternalWorkflowDSL.g:69:3: ( rule__WFModel__WorkflowAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWorkflowDSL.g:69:4: rule__WFModel__WorkflowAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__WFModel__WorkflowAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getWFModelAccess().getWorkflowAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWFModel"


    // $ANTLR start "entryRuleWorkflow"
    // InternalWorkflowDSL.g:78:1: entryRuleWorkflow : ruleWorkflow EOF ;
    public final void entryRuleWorkflow() throws RecognitionException {
        try {
            // InternalWorkflowDSL.g:79:1: ( ruleWorkflow EOF )
            // InternalWorkflowDSL.g:80:1: ruleWorkflow EOF
            {
             before(grammarAccess.getWorkflowRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkflow();

            state._fsp--;

             after(grammarAccess.getWorkflowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkflow"


    // $ANTLR start "ruleWorkflow"
    // InternalWorkflowDSL.g:87:1: ruleWorkflow : ( ( rule__Workflow__Group__0 ) ) ;
    public final void ruleWorkflow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:91:2: ( ( ( rule__Workflow__Group__0 ) ) )
            // InternalWorkflowDSL.g:92:2: ( ( rule__Workflow__Group__0 ) )
            {
            // InternalWorkflowDSL.g:92:2: ( ( rule__Workflow__Group__0 ) )
            // InternalWorkflowDSL.g:93:3: ( rule__Workflow__Group__0 )
            {
             before(grammarAccess.getWorkflowAccess().getGroup()); 
            // InternalWorkflowDSL.g:94:3: ( rule__Workflow__Group__0 )
            // InternalWorkflowDSL.g:94:4: rule__Workflow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkflow"


    // $ANTLR start "entryRuleStep"
    // InternalWorkflowDSL.g:103:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalWorkflowDSL.g:104:1: ( ruleStep EOF )
            // InternalWorkflowDSL.g:105:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalWorkflowDSL.g:112:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:116:2: ( ( ( rule__Step__Alternatives ) ) )
            // InternalWorkflowDSL.g:117:2: ( ( rule__Step__Alternatives ) )
            {
            // InternalWorkflowDSL.g:117:2: ( ( rule__Step__Alternatives ) )
            // InternalWorkflowDSL.g:118:3: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // InternalWorkflowDSL.g:119:3: ( rule__Step__Alternatives )
            // InternalWorkflowDSL.g:119:4: rule__Step__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Step__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleSourceStep"
    // InternalWorkflowDSL.g:128:1: entryRuleSourceStep : ruleSourceStep EOF ;
    public final void entryRuleSourceStep() throws RecognitionException {
        try {
            // InternalWorkflowDSL.g:129:1: ( ruleSourceStep EOF )
            // InternalWorkflowDSL.g:130:1: ruleSourceStep EOF
            {
             before(grammarAccess.getSourceStepRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceStep();

            state._fsp--;

             after(grammarAccess.getSourceStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourceStep"


    // $ANTLR start "ruleSourceStep"
    // InternalWorkflowDSL.g:137:1: ruleSourceStep : ( ( rule__SourceStep__Group__0 ) ) ;
    public final void ruleSourceStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:141:2: ( ( ( rule__SourceStep__Group__0 ) ) )
            // InternalWorkflowDSL.g:142:2: ( ( rule__SourceStep__Group__0 ) )
            {
            // InternalWorkflowDSL.g:142:2: ( ( rule__SourceStep__Group__0 ) )
            // InternalWorkflowDSL.g:143:3: ( rule__SourceStep__Group__0 )
            {
             before(grammarAccess.getSourceStepAccess().getGroup()); 
            // InternalWorkflowDSL.g:144:3: ( rule__SourceStep__Group__0 )
            // InternalWorkflowDSL.g:144:4: rule__SourceStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SourceStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceStep"


    // $ANTLR start "entryRuleIntermediateStep"
    // InternalWorkflowDSL.g:153:1: entryRuleIntermediateStep : ruleIntermediateStep EOF ;
    public final void entryRuleIntermediateStep() throws RecognitionException {
        try {
            // InternalWorkflowDSL.g:154:1: ( ruleIntermediateStep EOF )
            // InternalWorkflowDSL.g:155:1: ruleIntermediateStep EOF
            {
             before(grammarAccess.getIntermediateStepRule()); 
            pushFollow(FOLLOW_1);
            ruleIntermediateStep();

            state._fsp--;

             after(grammarAccess.getIntermediateStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntermediateStep"


    // $ANTLR start "ruleIntermediateStep"
    // InternalWorkflowDSL.g:162:1: ruleIntermediateStep : ( ( rule__IntermediateStep__Group__0 ) ) ;
    public final void ruleIntermediateStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:166:2: ( ( ( rule__IntermediateStep__Group__0 ) ) )
            // InternalWorkflowDSL.g:167:2: ( ( rule__IntermediateStep__Group__0 ) )
            {
            // InternalWorkflowDSL.g:167:2: ( ( rule__IntermediateStep__Group__0 ) )
            // InternalWorkflowDSL.g:168:3: ( rule__IntermediateStep__Group__0 )
            {
             before(grammarAccess.getIntermediateStepAccess().getGroup()); 
            // InternalWorkflowDSL.g:169:3: ( rule__IntermediateStep__Group__0 )
            // InternalWorkflowDSL.g:169:4: rule__IntermediateStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntermediateStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntermediateStep"


    // $ANTLR start "entryRuleSinkStep"
    // InternalWorkflowDSL.g:178:1: entryRuleSinkStep : ruleSinkStep EOF ;
    public final void entryRuleSinkStep() throws RecognitionException {
        try {
            // InternalWorkflowDSL.g:179:1: ( ruleSinkStep EOF )
            // InternalWorkflowDSL.g:180:1: ruleSinkStep EOF
            {
             before(grammarAccess.getSinkStepRule()); 
            pushFollow(FOLLOW_1);
            ruleSinkStep();

            state._fsp--;

             after(grammarAccess.getSinkStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSinkStep"


    // $ANTLR start "ruleSinkStep"
    // InternalWorkflowDSL.g:187:1: ruleSinkStep : ( ( rule__SinkStep__Group__0 ) ) ;
    public final void ruleSinkStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:191:2: ( ( ( rule__SinkStep__Group__0 ) ) )
            // InternalWorkflowDSL.g:192:2: ( ( rule__SinkStep__Group__0 ) )
            {
            // InternalWorkflowDSL.g:192:2: ( ( rule__SinkStep__Group__0 ) )
            // InternalWorkflowDSL.g:193:3: ( rule__SinkStep__Group__0 )
            {
             before(grammarAccess.getSinkStepAccess().getGroup()); 
            // InternalWorkflowDSL.g:194:3: ( rule__SinkStep__Group__0 )
            // InternalWorkflowDSL.g:194:4: rule__SinkStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SinkStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSinkStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSinkStep"


    // $ANTLR start "entryRuleMessageQueue"
    // InternalWorkflowDSL.g:203:1: entryRuleMessageQueue : ruleMessageQueue EOF ;
    public final void entryRuleMessageQueue() throws RecognitionException {
        try {
            // InternalWorkflowDSL.g:204:1: ( ruleMessageQueue EOF )
            // InternalWorkflowDSL.g:205:1: ruleMessageQueue EOF
            {
             before(grammarAccess.getMessageQueueRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageQueue();

            state._fsp--;

             after(grammarAccess.getMessageQueueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageQueue"


    // $ANTLR start "ruleMessageQueue"
    // InternalWorkflowDSL.g:212:1: ruleMessageQueue : ( ( rule__MessageQueue__NameAssignment ) ) ;
    public final void ruleMessageQueue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:216:2: ( ( ( rule__MessageQueue__NameAssignment ) ) )
            // InternalWorkflowDSL.g:217:2: ( ( rule__MessageQueue__NameAssignment ) )
            {
            // InternalWorkflowDSL.g:217:2: ( ( rule__MessageQueue__NameAssignment ) )
            // InternalWorkflowDSL.g:218:3: ( rule__MessageQueue__NameAssignment )
            {
             before(grammarAccess.getMessageQueueAccess().getNameAssignment()); 
            // InternalWorkflowDSL.g:219:3: ( rule__MessageQueue__NameAssignment )
            // InternalWorkflowDSL.g:219:4: rule__MessageQueue__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MessageQueue__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMessageQueueAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageQueue"


    // $ANTLR start "entryRuleParameter"
    // InternalWorkflowDSL.g:228:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalWorkflowDSL.g:229:1: ( ruleParameter EOF )
            // InternalWorkflowDSL.g:230:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalWorkflowDSL.g:237:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:241:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalWorkflowDSL.g:242:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalWorkflowDSL.g:242:2: ( ( rule__Parameter__Group__0 ) )
            // InternalWorkflowDSL.g:243:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalWorkflowDSL.g:244:3: ( rule__Parameter__Group__0 )
            // InternalWorkflowDSL.g:244:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameterValueTypes"
    // InternalWorkflowDSL.g:253:1: entryRuleParameterValueTypes : ruleParameterValueTypes EOF ;
    public final void entryRuleParameterValueTypes() throws RecognitionException {
        try {
            // InternalWorkflowDSL.g:254:1: ( ruleParameterValueTypes EOF )
            // InternalWorkflowDSL.g:255:1: ruleParameterValueTypes EOF
            {
             before(grammarAccess.getParameterValueTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterValueTypes();

            state._fsp--;

             after(grammarAccess.getParameterValueTypesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterValueTypes"


    // $ANTLR start "ruleParameterValueTypes"
    // InternalWorkflowDSL.g:262:1: ruleParameterValueTypes : ( ( rule__ParameterValueTypes__Alternatives ) ) ;
    public final void ruleParameterValueTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:266:2: ( ( ( rule__ParameterValueTypes__Alternatives ) ) )
            // InternalWorkflowDSL.g:267:2: ( ( rule__ParameterValueTypes__Alternatives ) )
            {
            // InternalWorkflowDSL.g:267:2: ( ( rule__ParameterValueTypes__Alternatives ) )
            // InternalWorkflowDSL.g:268:3: ( rule__ParameterValueTypes__Alternatives )
            {
             before(grammarAccess.getParameterValueTypesAccess().getAlternatives()); 
            // InternalWorkflowDSL.g:269:3: ( rule__ParameterValueTypes__Alternatives )
            // InternalWorkflowDSL.g:269:4: rule__ParameterValueTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValueTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterValueTypes"


    // $ANTLR start "rule__Step__Alternatives"
    // InternalWorkflowDSL.g:277:1: rule__Step__Alternatives : ( ( ( rule__Step__Group_0__0 ) ) | ( ruleIntermediateStep ) | ( ( rule__Step__Group_2__0 ) ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:281:1: ( ( ( rule__Step__Group_0__0 ) ) | ( ruleIntermediateStep ) | ( ( rule__Step__Group_2__0 ) ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalWorkflowDSL.g:282:2: ( ( rule__Step__Group_0__0 ) )
                    {
                    // InternalWorkflowDSL.g:282:2: ( ( rule__Step__Group_0__0 ) )
                    // InternalWorkflowDSL.g:283:3: ( rule__Step__Group_0__0 )
                    {
                     before(grammarAccess.getStepAccess().getGroup_0()); 
                    // InternalWorkflowDSL.g:284:3: ( rule__Step__Group_0__0 )
                    // InternalWorkflowDSL.g:284:4: rule__Step__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWorkflowDSL.g:288:2: ( ruleIntermediateStep )
                    {
                    // InternalWorkflowDSL.g:288:2: ( ruleIntermediateStep )
                    // InternalWorkflowDSL.g:289:3: ruleIntermediateStep
                    {
                     before(grammarAccess.getStepAccess().getIntermediateStepParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntermediateStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getIntermediateStepParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWorkflowDSL.g:294:2: ( ( rule__Step__Group_2__0 ) )
                    {
                    // InternalWorkflowDSL.g:294:2: ( ( rule__Step__Group_2__0 ) )
                    // InternalWorkflowDSL.g:295:3: ( rule__Step__Group_2__0 )
                    {
                     before(grammarAccess.getStepAccess().getGroup_2()); 
                    // InternalWorkflowDSL.g:296:3: ( rule__Step__Group_2__0 )
                    // InternalWorkflowDSL.g:296:4: rule__Step__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Alternatives"


    // $ANTLR start "rule__ParameterValueTypes__Alternatives"
    // InternalWorkflowDSL.g:304:1: rule__ParameterValueTypes__Alternatives : ( ( ( rule__ParameterValueTypes__Group_0__0 ) ) | ( ( rule__ParameterValueTypes__Group_1__0 ) ) | ( ( rule__ParameterValueTypes__Group_2__0 ) ) | ( ( rule__ParameterValueTypes__Group_3__0 ) ) );
    public final void rule__ParameterValueTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:308:1: ( ( ( rule__ParameterValueTypes__Group_0__0 ) ) | ( ( rule__ParameterValueTypes__Group_1__0 ) ) | ( ( rule__ParameterValueTypes__Group_2__0 ) ) | ( ( rule__ParameterValueTypes__Group_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
                {
                alt3=2;
                }
                break;
            case RULE_BOOL_LITERAL:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalWorkflowDSL.g:309:2: ( ( rule__ParameterValueTypes__Group_0__0 ) )
                    {
                    // InternalWorkflowDSL.g:309:2: ( ( rule__ParameterValueTypes__Group_0__0 ) )
                    // InternalWorkflowDSL.g:310:3: ( rule__ParameterValueTypes__Group_0__0 )
                    {
                     before(grammarAccess.getParameterValueTypesAccess().getGroup_0()); 
                    // InternalWorkflowDSL.g:311:3: ( rule__ParameterValueTypes__Group_0__0 )
                    // InternalWorkflowDSL.g:311:4: rule__ParameterValueTypes__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValueTypes__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueTypesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWorkflowDSL.g:315:2: ( ( rule__ParameterValueTypes__Group_1__0 ) )
                    {
                    // InternalWorkflowDSL.g:315:2: ( ( rule__ParameterValueTypes__Group_1__0 ) )
                    // InternalWorkflowDSL.g:316:3: ( rule__ParameterValueTypes__Group_1__0 )
                    {
                     before(grammarAccess.getParameterValueTypesAccess().getGroup_1()); 
                    // InternalWorkflowDSL.g:317:3: ( rule__ParameterValueTypes__Group_1__0 )
                    // InternalWorkflowDSL.g:317:4: rule__ParameterValueTypes__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValueTypes__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueTypesAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWorkflowDSL.g:321:2: ( ( rule__ParameterValueTypes__Group_2__0 ) )
                    {
                    // InternalWorkflowDSL.g:321:2: ( ( rule__ParameterValueTypes__Group_2__0 ) )
                    // InternalWorkflowDSL.g:322:3: ( rule__ParameterValueTypes__Group_2__0 )
                    {
                     before(grammarAccess.getParameterValueTypesAccess().getGroup_2()); 
                    // InternalWorkflowDSL.g:323:3: ( rule__ParameterValueTypes__Group_2__0 )
                    // InternalWorkflowDSL.g:323:4: rule__ParameterValueTypes__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValueTypes__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueTypesAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWorkflowDSL.g:327:2: ( ( rule__ParameterValueTypes__Group_3__0 ) )
                    {
                    // InternalWorkflowDSL.g:327:2: ( ( rule__ParameterValueTypes__Group_3__0 ) )
                    // InternalWorkflowDSL.g:328:3: ( rule__ParameterValueTypes__Group_3__0 )
                    {
                     before(grammarAccess.getParameterValueTypesAccess().getGroup_3()); 
                    // InternalWorkflowDSL.g:329:3: ( rule__ParameterValueTypes__Group_3__0 )
                    // InternalWorkflowDSL.g:329:4: rule__ParameterValueTypes__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValueTypes__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueTypesAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Alternatives"


    // $ANTLR start "rule__Workflow__Group__0"
    // InternalWorkflowDSL.g:337:1: rule__Workflow__Group__0 : rule__Workflow__Group__0__Impl rule__Workflow__Group__1 ;
    public final void rule__Workflow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:341:1: ( rule__Workflow__Group__0__Impl rule__Workflow__Group__1 )
            // InternalWorkflowDSL.g:342:2: rule__Workflow__Group__0__Impl rule__Workflow__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Workflow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__0"


    // $ANTLR start "rule__Workflow__Group__0__Impl"
    // InternalWorkflowDSL.g:349:1: rule__Workflow__Group__0__Impl : ( 'workflow' ) ;
    public final void rule__Workflow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:353:1: ( ( 'workflow' ) )
            // InternalWorkflowDSL.g:354:1: ( 'workflow' )
            {
            // InternalWorkflowDSL.g:354:1: ( 'workflow' )
            // InternalWorkflowDSL.g:355:2: 'workflow'
            {
             before(grammarAccess.getWorkflowAccess().getWorkflowKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getWorkflowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__0__Impl"


    // $ANTLR start "rule__Workflow__Group__1"
    // InternalWorkflowDSL.g:364:1: rule__Workflow__Group__1 : rule__Workflow__Group__1__Impl rule__Workflow__Group__2 ;
    public final void rule__Workflow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:368:1: ( rule__Workflow__Group__1__Impl rule__Workflow__Group__2 )
            // InternalWorkflowDSL.g:369:2: rule__Workflow__Group__1__Impl rule__Workflow__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Workflow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__1"


    // $ANTLR start "rule__Workflow__Group__1__Impl"
    // InternalWorkflowDSL.g:376:1: rule__Workflow__Group__1__Impl : ( ( rule__Workflow__NameAssignment_1 ) ) ;
    public final void rule__Workflow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:380:1: ( ( ( rule__Workflow__NameAssignment_1 ) ) )
            // InternalWorkflowDSL.g:381:1: ( ( rule__Workflow__NameAssignment_1 ) )
            {
            // InternalWorkflowDSL.g:381:1: ( ( rule__Workflow__NameAssignment_1 ) )
            // InternalWorkflowDSL.g:382:2: ( rule__Workflow__NameAssignment_1 )
            {
             before(grammarAccess.getWorkflowAccess().getNameAssignment_1()); 
            // InternalWorkflowDSL.g:383:2: ( rule__Workflow__NameAssignment_1 )
            // InternalWorkflowDSL.g:383:3: rule__Workflow__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__1__Impl"


    // $ANTLR start "rule__Workflow__Group__2"
    // InternalWorkflowDSL.g:391:1: rule__Workflow__Group__2 : rule__Workflow__Group__2__Impl rule__Workflow__Group__3 ;
    public final void rule__Workflow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:395:1: ( rule__Workflow__Group__2__Impl rule__Workflow__Group__3 )
            // InternalWorkflowDSL.g:396:2: rule__Workflow__Group__2__Impl rule__Workflow__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Workflow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__2"


    // $ANTLR start "rule__Workflow__Group__2__Impl"
    // InternalWorkflowDSL.g:403:1: rule__Workflow__Group__2__Impl : ( ( rule__Workflow__Group_2__0 )? ) ;
    public final void rule__Workflow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:407:1: ( ( ( rule__Workflow__Group_2__0 )? ) )
            // InternalWorkflowDSL.g:408:1: ( ( rule__Workflow__Group_2__0 )? )
            {
            // InternalWorkflowDSL.g:408:1: ( ( rule__Workflow__Group_2__0 )? )
            // InternalWorkflowDSL.g:409:2: ( rule__Workflow__Group_2__0 )?
            {
             before(grammarAccess.getWorkflowAccess().getGroup_2()); 
            // InternalWorkflowDSL.g:410:2: ( rule__Workflow__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalWorkflowDSL.g:410:3: rule__Workflow__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Workflow__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkflowAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__2__Impl"


    // $ANTLR start "rule__Workflow__Group__3"
    // InternalWorkflowDSL.g:418:1: rule__Workflow__Group__3 : rule__Workflow__Group__3__Impl rule__Workflow__Group__4 ;
    public final void rule__Workflow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:422:1: ( rule__Workflow__Group__3__Impl rule__Workflow__Group__4 )
            // InternalWorkflowDSL.g:423:2: rule__Workflow__Group__3__Impl rule__Workflow__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Workflow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__3"


    // $ANTLR start "rule__Workflow__Group__3__Impl"
    // InternalWorkflowDSL.g:430:1: rule__Workflow__Group__3__Impl : ( '{' ) ;
    public final void rule__Workflow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:434:1: ( ( '{' ) )
            // InternalWorkflowDSL.g:435:1: ( '{' )
            {
            // InternalWorkflowDSL.g:435:1: ( '{' )
            // InternalWorkflowDSL.g:436:2: '{'
            {
             before(grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__3__Impl"


    // $ANTLR start "rule__Workflow__Group__4"
    // InternalWorkflowDSL.g:445:1: rule__Workflow__Group__4 : rule__Workflow__Group__4__Impl rule__Workflow__Group__5 ;
    public final void rule__Workflow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:449:1: ( rule__Workflow__Group__4__Impl rule__Workflow__Group__5 )
            // InternalWorkflowDSL.g:450:2: rule__Workflow__Group__4__Impl rule__Workflow__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Workflow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__4"


    // $ANTLR start "rule__Workflow__Group__4__Impl"
    // InternalWorkflowDSL.g:457:1: rule__Workflow__Group__4__Impl : ( ( rule__Workflow__Group_4__0 )? ) ;
    public final void rule__Workflow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:461:1: ( ( ( rule__Workflow__Group_4__0 )? ) )
            // InternalWorkflowDSL.g:462:1: ( ( rule__Workflow__Group_4__0 )? )
            {
            // InternalWorkflowDSL.g:462:1: ( ( rule__Workflow__Group_4__0 )? )
            // InternalWorkflowDSL.g:463:2: ( rule__Workflow__Group_4__0 )?
            {
             before(grammarAccess.getWorkflowAccess().getGroup_4()); 
            // InternalWorkflowDSL.g:464:2: ( rule__Workflow__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalWorkflowDSL.g:464:3: rule__Workflow__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Workflow__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkflowAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__4__Impl"


    // $ANTLR start "rule__Workflow__Group__5"
    // InternalWorkflowDSL.g:472:1: rule__Workflow__Group__5 : rule__Workflow__Group__5__Impl rule__Workflow__Group__6 ;
    public final void rule__Workflow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:476:1: ( rule__Workflow__Group__5__Impl rule__Workflow__Group__6 )
            // InternalWorkflowDSL.g:477:2: rule__Workflow__Group__5__Impl rule__Workflow__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Workflow__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__5"


    // $ANTLR start "rule__Workflow__Group__5__Impl"
    // InternalWorkflowDSL.g:484:1: rule__Workflow__Group__5__Impl : ( ( rule__Workflow__Group_5__0 ) ) ;
    public final void rule__Workflow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:488:1: ( ( ( rule__Workflow__Group_5__0 ) ) )
            // InternalWorkflowDSL.g:489:1: ( ( rule__Workflow__Group_5__0 ) )
            {
            // InternalWorkflowDSL.g:489:1: ( ( rule__Workflow__Group_5__0 ) )
            // InternalWorkflowDSL.g:490:2: ( rule__Workflow__Group_5__0 )
            {
             before(grammarAccess.getWorkflowAccess().getGroup_5()); 
            // InternalWorkflowDSL.g:491:2: ( rule__Workflow__Group_5__0 )
            // InternalWorkflowDSL.g:491:3: rule__Workflow__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__5__Impl"


    // $ANTLR start "rule__Workflow__Group__6"
    // InternalWorkflowDSL.g:499:1: rule__Workflow__Group__6 : rule__Workflow__Group__6__Impl ;
    public final void rule__Workflow__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:503:1: ( rule__Workflow__Group__6__Impl )
            // InternalWorkflowDSL.g:504:2: rule__Workflow__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__6"


    // $ANTLR start "rule__Workflow__Group__6__Impl"
    // InternalWorkflowDSL.g:510:1: rule__Workflow__Group__6__Impl : ( '}' ) ;
    public final void rule__Workflow__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:514:1: ( ( '}' ) )
            // InternalWorkflowDSL.g:515:1: ( '}' )
            {
            // InternalWorkflowDSL.g:515:1: ( '}' )
            // InternalWorkflowDSL.g:516:2: '}'
            {
             before(grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__6__Impl"


    // $ANTLR start "rule__Workflow__Group_2__0"
    // InternalWorkflowDSL.g:526:1: rule__Workflow__Group_2__0 : rule__Workflow__Group_2__0__Impl rule__Workflow__Group_2__1 ;
    public final void rule__Workflow__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:530:1: ( rule__Workflow__Group_2__0__Impl rule__Workflow__Group_2__1 )
            // InternalWorkflowDSL.g:531:2: rule__Workflow__Group_2__0__Impl rule__Workflow__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Workflow__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_2__0"


    // $ANTLR start "rule__Workflow__Group_2__0__Impl"
    // InternalWorkflowDSL.g:538:1: rule__Workflow__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Workflow__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:542:1: ( ( 'extends' ) )
            // InternalWorkflowDSL.g:543:1: ( 'extends' )
            {
            // InternalWorkflowDSL.g:543:1: ( 'extends' )
            // InternalWorkflowDSL.g:544:2: 'extends'
            {
             before(grammarAccess.getWorkflowAccess().getExtendsKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_2__0__Impl"


    // $ANTLR start "rule__Workflow__Group_2__1"
    // InternalWorkflowDSL.g:553:1: rule__Workflow__Group_2__1 : rule__Workflow__Group_2__1__Impl ;
    public final void rule__Workflow__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:557:1: ( rule__Workflow__Group_2__1__Impl )
            // InternalWorkflowDSL.g:558:2: rule__Workflow__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_2__1"


    // $ANTLR start "rule__Workflow__Group_2__1__Impl"
    // InternalWorkflowDSL.g:564:1: rule__Workflow__Group_2__1__Impl : ( ( rule__Workflow__BaseAssignment_2_1 ) ) ;
    public final void rule__Workflow__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:568:1: ( ( ( rule__Workflow__BaseAssignment_2_1 ) ) )
            // InternalWorkflowDSL.g:569:1: ( ( rule__Workflow__BaseAssignment_2_1 ) )
            {
            // InternalWorkflowDSL.g:569:1: ( ( rule__Workflow__BaseAssignment_2_1 ) )
            // InternalWorkflowDSL.g:570:2: ( rule__Workflow__BaseAssignment_2_1 )
            {
             before(grammarAccess.getWorkflowAccess().getBaseAssignment_2_1()); 
            // InternalWorkflowDSL.g:571:2: ( rule__Workflow__BaseAssignment_2_1 )
            // InternalWorkflowDSL.g:571:3: rule__Workflow__BaseAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__BaseAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowAccess().getBaseAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_2__1__Impl"


    // $ANTLR start "rule__Workflow__Group_4__0"
    // InternalWorkflowDSL.g:580:1: rule__Workflow__Group_4__0 : rule__Workflow__Group_4__0__Impl rule__Workflow__Group_4__1 ;
    public final void rule__Workflow__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:584:1: ( rule__Workflow__Group_4__0__Impl rule__Workflow__Group_4__1 )
            // InternalWorkflowDSL.g:585:2: rule__Workflow__Group_4__0__Impl rule__Workflow__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Workflow__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4__0"


    // $ANTLR start "rule__Workflow__Group_4__0__Impl"
    // InternalWorkflowDSL.g:592:1: rule__Workflow__Group_4__0__Impl : ( 'parameters:' ) ;
    public final void rule__Workflow__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:596:1: ( ( 'parameters:' ) )
            // InternalWorkflowDSL.g:597:1: ( 'parameters:' )
            {
            // InternalWorkflowDSL.g:597:1: ( 'parameters:' )
            // InternalWorkflowDSL.g:598:2: 'parameters:'
            {
             before(grammarAccess.getWorkflowAccess().getParametersKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getParametersKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4__0__Impl"


    // $ANTLR start "rule__Workflow__Group_4__1"
    // InternalWorkflowDSL.g:607:1: rule__Workflow__Group_4__1 : rule__Workflow__Group_4__1__Impl rule__Workflow__Group_4__2 ;
    public final void rule__Workflow__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:611:1: ( rule__Workflow__Group_4__1__Impl rule__Workflow__Group_4__2 )
            // InternalWorkflowDSL.g:612:2: rule__Workflow__Group_4__1__Impl rule__Workflow__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Workflow__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4__1"


    // $ANTLR start "rule__Workflow__Group_4__1__Impl"
    // InternalWorkflowDSL.g:619:1: rule__Workflow__Group_4__1__Impl : ( '[' ) ;
    public final void rule__Workflow__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:623:1: ( ( '[' ) )
            // InternalWorkflowDSL.g:624:1: ( '[' )
            {
            // InternalWorkflowDSL.g:624:1: ( '[' )
            // InternalWorkflowDSL.g:625:2: '['
            {
             before(grammarAccess.getWorkflowAccess().getLeftSquareBracketKeyword_4_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getLeftSquareBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4__1__Impl"


    // $ANTLR start "rule__Workflow__Group_4__2"
    // InternalWorkflowDSL.g:634:1: rule__Workflow__Group_4__2 : rule__Workflow__Group_4__2__Impl rule__Workflow__Group_4__3 ;
    public final void rule__Workflow__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:638:1: ( rule__Workflow__Group_4__2__Impl rule__Workflow__Group_4__3 )
            // InternalWorkflowDSL.g:639:2: rule__Workflow__Group_4__2__Impl rule__Workflow__Group_4__3
            {
            pushFollow(FOLLOW_9);
            rule__Workflow__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4__2"


    // $ANTLR start "rule__Workflow__Group_4__2__Impl"
    // InternalWorkflowDSL.g:646:1: rule__Workflow__Group_4__2__Impl : ( ( rule__Workflow__Group_4_2__0 )? ) ;
    public final void rule__Workflow__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:650:1: ( ( ( rule__Workflow__Group_4_2__0 )? ) )
            // InternalWorkflowDSL.g:651:1: ( ( rule__Workflow__Group_4_2__0 )? )
            {
            // InternalWorkflowDSL.g:651:1: ( ( rule__Workflow__Group_4_2__0 )? )
            // InternalWorkflowDSL.g:652:2: ( rule__Workflow__Group_4_2__0 )?
            {
             before(grammarAccess.getWorkflowAccess().getGroup_4_2()); 
            // InternalWorkflowDSL.g:653:2: ( rule__Workflow__Group_4_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalWorkflowDSL.g:653:3: rule__Workflow__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Workflow__Group_4_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkflowAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4__2__Impl"


    // $ANTLR start "rule__Workflow__Group_4__3"
    // InternalWorkflowDSL.g:661:1: rule__Workflow__Group_4__3 : rule__Workflow__Group_4__3__Impl ;
    public final void rule__Workflow__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:665:1: ( rule__Workflow__Group_4__3__Impl )
            // InternalWorkflowDSL.g:666:2: rule__Workflow__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4__3"


    // $ANTLR start "rule__Workflow__Group_4__3__Impl"
    // InternalWorkflowDSL.g:672:1: rule__Workflow__Group_4__3__Impl : ( ']' ) ;
    public final void rule__Workflow__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:676:1: ( ( ']' ) )
            // InternalWorkflowDSL.g:677:1: ( ']' )
            {
            // InternalWorkflowDSL.g:677:1: ( ']' )
            // InternalWorkflowDSL.g:678:2: ']'
            {
             before(grammarAccess.getWorkflowAccess().getRightSquareBracketKeyword_4_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getRightSquareBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4__3__Impl"


    // $ANTLR start "rule__Workflow__Group_4_2__0"
    // InternalWorkflowDSL.g:688:1: rule__Workflow__Group_4_2__0 : rule__Workflow__Group_4_2__0__Impl rule__Workflow__Group_4_2__1 ;
    public final void rule__Workflow__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:692:1: ( rule__Workflow__Group_4_2__0__Impl rule__Workflow__Group_4_2__1 )
            // InternalWorkflowDSL.g:693:2: rule__Workflow__Group_4_2__0__Impl rule__Workflow__Group_4_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Workflow__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4_2__0"


    // $ANTLR start "rule__Workflow__Group_4_2__0__Impl"
    // InternalWorkflowDSL.g:700:1: rule__Workflow__Group_4_2__0__Impl : ( ( rule__Workflow__ParamsAssignment_4_2_0 ) ) ;
    public final void rule__Workflow__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:704:1: ( ( ( rule__Workflow__ParamsAssignment_4_2_0 ) ) )
            // InternalWorkflowDSL.g:705:1: ( ( rule__Workflow__ParamsAssignment_4_2_0 ) )
            {
            // InternalWorkflowDSL.g:705:1: ( ( rule__Workflow__ParamsAssignment_4_2_0 ) )
            // InternalWorkflowDSL.g:706:2: ( rule__Workflow__ParamsAssignment_4_2_0 )
            {
             before(grammarAccess.getWorkflowAccess().getParamsAssignment_4_2_0()); 
            // InternalWorkflowDSL.g:707:2: ( rule__Workflow__ParamsAssignment_4_2_0 )
            // InternalWorkflowDSL.g:707:3: rule__Workflow__ParamsAssignment_4_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__ParamsAssignment_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowAccess().getParamsAssignment_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4_2__0__Impl"


    // $ANTLR start "rule__Workflow__Group_4_2__1"
    // InternalWorkflowDSL.g:715:1: rule__Workflow__Group_4_2__1 : rule__Workflow__Group_4_2__1__Impl ;
    public final void rule__Workflow__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:719:1: ( rule__Workflow__Group_4_2__1__Impl )
            // InternalWorkflowDSL.g:720:2: rule__Workflow__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4_2__1"


    // $ANTLR start "rule__Workflow__Group_4_2__1__Impl"
    // InternalWorkflowDSL.g:726:1: rule__Workflow__Group_4_2__1__Impl : ( ( rule__Workflow__Group_4_2_1__0 )* ) ;
    public final void rule__Workflow__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:730:1: ( ( ( rule__Workflow__Group_4_2_1__0 )* ) )
            // InternalWorkflowDSL.g:731:1: ( ( rule__Workflow__Group_4_2_1__0 )* )
            {
            // InternalWorkflowDSL.g:731:1: ( ( rule__Workflow__Group_4_2_1__0 )* )
            // InternalWorkflowDSL.g:732:2: ( rule__Workflow__Group_4_2_1__0 )*
            {
             before(grammarAccess.getWorkflowAccess().getGroup_4_2_1()); 
            // InternalWorkflowDSL.g:733:2: ( rule__Workflow__Group_4_2_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWorkflowDSL.g:733:3: rule__Workflow__Group_4_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Workflow__Group_4_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getWorkflowAccess().getGroup_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4_2__1__Impl"


    // $ANTLR start "rule__Workflow__Group_4_2_1__0"
    // InternalWorkflowDSL.g:742:1: rule__Workflow__Group_4_2_1__0 : rule__Workflow__Group_4_2_1__0__Impl rule__Workflow__Group_4_2_1__1 ;
    public final void rule__Workflow__Group_4_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:746:1: ( rule__Workflow__Group_4_2_1__0__Impl rule__Workflow__Group_4_2_1__1 )
            // InternalWorkflowDSL.g:747:2: rule__Workflow__Group_4_2_1__0__Impl rule__Workflow__Group_4_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Workflow__Group_4_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group_4_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4_2_1__0"


    // $ANTLR start "rule__Workflow__Group_4_2_1__0__Impl"
    // InternalWorkflowDSL.g:754:1: rule__Workflow__Group_4_2_1__0__Impl : ( ',' ) ;
    public final void rule__Workflow__Group_4_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:758:1: ( ( ',' ) )
            // InternalWorkflowDSL.g:759:1: ( ',' )
            {
            // InternalWorkflowDSL.g:759:1: ( ',' )
            // InternalWorkflowDSL.g:760:2: ','
            {
             before(grammarAccess.getWorkflowAccess().getCommaKeyword_4_2_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getCommaKeyword_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4_2_1__0__Impl"


    // $ANTLR start "rule__Workflow__Group_4_2_1__1"
    // InternalWorkflowDSL.g:769:1: rule__Workflow__Group_4_2_1__1 : rule__Workflow__Group_4_2_1__1__Impl ;
    public final void rule__Workflow__Group_4_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:773:1: ( rule__Workflow__Group_4_2_1__1__Impl )
            // InternalWorkflowDSL.g:774:2: rule__Workflow__Group_4_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__Group_4_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4_2_1__1"


    // $ANTLR start "rule__Workflow__Group_4_2_1__1__Impl"
    // InternalWorkflowDSL.g:780:1: rule__Workflow__Group_4_2_1__1__Impl : ( ( rule__Workflow__ParamsAssignment_4_2_1_1 ) ) ;
    public final void rule__Workflow__Group_4_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:784:1: ( ( ( rule__Workflow__ParamsAssignment_4_2_1_1 ) ) )
            // InternalWorkflowDSL.g:785:1: ( ( rule__Workflow__ParamsAssignment_4_2_1_1 ) )
            {
            // InternalWorkflowDSL.g:785:1: ( ( rule__Workflow__ParamsAssignment_4_2_1_1 ) )
            // InternalWorkflowDSL.g:786:2: ( rule__Workflow__ParamsAssignment_4_2_1_1 )
            {
             before(grammarAccess.getWorkflowAccess().getParamsAssignment_4_2_1_1()); 
            // InternalWorkflowDSL.g:787:2: ( rule__Workflow__ParamsAssignment_4_2_1_1 )
            // InternalWorkflowDSL.g:787:3: rule__Workflow__ParamsAssignment_4_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__ParamsAssignment_4_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowAccess().getParamsAssignment_4_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4_2_1__1__Impl"


    // $ANTLR start "rule__Workflow__Group_5__0"
    // InternalWorkflowDSL.g:796:1: rule__Workflow__Group_5__0 : rule__Workflow__Group_5__0__Impl rule__Workflow__Group_5__1 ;
    public final void rule__Workflow__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:800:1: ( rule__Workflow__Group_5__0__Impl rule__Workflow__Group_5__1 )
            // InternalWorkflowDSL.g:801:2: rule__Workflow__Group_5__0__Impl rule__Workflow__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Workflow__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_5__0"


    // $ANTLR start "rule__Workflow__Group_5__0__Impl"
    // InternalWorkflowDSL.g:808:1: rule__Workflow__Group_5__0__Impl : ( 'steps:' ) ;
    public final void rule__Workflow__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:812:1: ( ( 'steps:' ) )
            // InternalWorkflowDSL.g:813:1: ( 'steps:' )
            {
            // InternalWorkflowDSL.g:813:1: ( 'steps:' )
            // InternalWorkflowDSL.g:814:2: 'steps:'
            {
             before(grammarAccess.getWorkflowAccess().getStepsKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getStepsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_5__0__Impl"


    // $ANTLR start "rule__Workflow__Group_5__1"
    // InternalWorkflowDSL.g:823:1: rule__Workflow__Group_5__1 : rule__Workflow__Group_5__1__Impl rule__Workflow__Group_5__2 ;
    public final void rule__Workflow__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:827:1: ( rule__Workflow__Group_5__1__Impl rule__Workflow__Group_5__2 )
            // InternalWorkflowDSL.g:828:2: rule__Workflow__Group_5__1__Impl rule__Workflow__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__Workflow__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_5__1"


    // $ANTLR start "rule__Workflow__Group_5__1__Impl"
    // InternalWorkflowDSL.g:835:1: rule__Workflow__Group_5__1__Impl : ( '[' ) ;
    public final void rule__Workflow__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:839:1: ( ( '[' ) )
            // InternalWorkflowDSL.g:840:1: ( '[' )
            {
            // InternalWorkflowDSL.g:840:1: ( '[' )
            // InternalWorkflowDSL.g:841:2: '['
            {
             before(grammarAccess.getWorkflowAccess().getLeftSquareBracketKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getLeftSquareBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_5__1__Impl"


    // $ANTLR start "rule__Workflow__Group_5__2"
    // InternalWorkflowDSL.g:850:1: rule__Workflow__Group_5__2 : rule__Workflow__Group_5__2__Impl rule__Workflow__Group_5__3 ;
    public final void rule__Workflow__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:854:1: ( rule__Workflow__Group_5__2__Impl rule__Workflow__Group_5__3 )
            // InternalWorkflowDSL.g:855:2: rule__Workflow__Group_5__2__Impl rule__Workflow__Group_5__3
            {
            pushFollow(FOLLOW_13);
            rule__Workflow__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_5__2"


    // $ANTLR start "rule__Workflow__Group_5__2__Impl"
    // InternalWorkflowDSL.g:862:1: rule__Workflow__Group_5__2__Impl : ( ( rule__Workflow__StepsAssignment_5_2 ) ) ;
    public final void rule__Workflow__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:866:1: ( ( ( rule__Workflow__StepsAssignment_5_2 ) ) )
            // InternalWorkflowDSL.g:867:1: ( ( rule__Workflow__StepsAssignment_5_2 ) )
            {
            // InternalWorkflowDSL.g:867:1: ( ( rule__Workflow__StepsAssignment_5_2 ) )
            // InternalWorkflowDSL.g:868:2: ( rule__Workflow__StepsAssignment_5_2 )
            {
             before(grammarAccess.getWorkflowAccess().getStepsAssignment_5_2()); 
            // InternalWorkflowDSL.g:869:2: ( rule__Workflow__StepsAssignment_5_2 )
            // InternalWorkflowDSL.g:869:3: rule__Workflow__StepsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__StepsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowAccess().getStepsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_5__2__Impl"


    // $ANTLR start "rule__Workflow__Group_5__3"
    // InternalWorkflowDSL.g:877:1: rule__Workflow__Group_5__3 : rule__Workflow__Group_5__3__Impl rule__Workflow__Group_5__4 ;
    public final void rule__Workflow__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:881:1: ( rule__Workflow__Group_5__3__Impl rule__Workflow__Group_5__4 )
            // InternalWorkflowDSL.g:882:2: rule__Workflow__Group_5__3__Impl rule__Workflow__Group_5__4
            {
            pushFollow(FOLLOW_13);
            rule__Workflow__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_5__3"


    // $ANTLR start "rule__Workflow__Group_5__3__Impl"
    // InternalWorkflowDSL.g:889:1: rule__Workflow__Group_5__3__Impl : ( ( rule__Workflow__Group_5_3__0 )* ) ;
    public final void rule__Workflow__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:893:1: ( ( ( rule__Workflow__Group_5_3__0 )* ) )
            // InternalWorkflowDSL.g:894:1: ( ( rule__Workflow__Group_5_3__0 )* )
            {
            // InternalWorkflowDSL.g:894:1: ( ( rule__Workflow__Group_5_3__0 )* )
            // InternalWorkflowDSL.g:895:2: ( rule__Workflow__Group_5_3__0 )*
            {
             before(grammarAccess.getWorkflowAccess().getGroup_5_3()); 
            // InternalWorkflowDSL.g:896:2: ( rule__Workflow__Group_5_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWorkflowDSL.g:896:3: rule__Workflow__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Workflow__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getWorkflowAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_5__3__Impl"


    // $ANTLR start "rule__Workflow__Group_5__4"
    // InternalWorkflowDSL.g:904:1: rule__Workflow__Group_5__4 : rule__Workflow__Group_5__4__Impl ;
    public final void rule__Workflow__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:908:1: ( rule__Workflow__Group_5__4__Impl )
            // InternalWorkflowDSL.g:909:2: rule__Workflow__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_5__4"


    // $ANTLR start "rule__Workflow__Group_5__4__Impl"
    // InternalWorkflowDSL.g:915:1: rule__Workflow__Group_5__4__Impl : ( ']' ) ;
    public final void rule__Workflow__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:919:1: ( ( ']' ) )
            // InternalWorkflowDSL.g:920:1: ( ']' )
            {
            // InternalWorkflowDSL.g:920:1: ( ']' )
            // InternalWorkflowDSL.g:921:2: ']'
            {
             before(grammarAccess.getWorkflowAccess().getRightSquareBracketKeyword_5_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getRightSquareBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_5__4__Impl"


    // $ANTLR start "rule__Workflow__Group_5_3__0"
    // InternalWorkflowDSL.g:931:1: rule__Workflow__Group_5_3__0 : rule__Workflow__Group_5_3__0__Impl rule__Workflow__Group_5_3__1 ;
    public final void rule__Workflow__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:935:1: ( rule__Workflow__Group_5_3__0__Impl rule__Workflow__Group_5_3__1 )
            // InternalWorkflowDSL.g:936:2: rule__Workflow__Group_5_3__0__Impl rule__Workflow__Group_5_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Workflow__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_5_3__0"


    // $ANTLR start "rule__Workflow__Group_5_3__0__Impl"
    // InternalWorkflowDSL.g:943:1: rule__Workflow__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Workflow__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:947:1: ( ( ',' ) )
            // InternalWorkflowDSL.g:948:1: ( ',' )
            {
            // InternalWorkflowDSL.g:948:1: ( ',' )
            // InternalWorkflowDSL.g:949:2: ','
            {
             before(grammarAccess.getWorkflowAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_5_3__0__Impl"


    // $ANTLR start "rule__Workflow__Group_5_3__1"
    // InternalWorkflowDSL.g:958:1: rule__Workflow__Group_5_3__1 : rule__Workflow__Group_5_3__1__Impl ;
    public final void rule__Workflow__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:962:1: ( rule__Workflow__Group_5_3__1__Impl )
            // InternalWorkflowDSL.g:963:2: rule__Workflow__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_5_3__1"


    // $ANTLR start "rule__Workflow__Group_5_3__1__Impl"
    // InternalWorkflowDSL.g:969:1: rule__Workflow__Group_5_3__1__Impl : ( ( rule__Workflow__StepsAssignment_5_3_1 ) ) ;
    public final void rule__Workflow__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:973:1: ( ( ( rule__Workflow__StepsAssignment_5_3_1 ) ) )
            // InternalWorkflowDSL.g:974:1: ( ( rule__Workflow__StepsAssignment_5_3_1 ) )
            {
            // InternalWorkflowDSL.g:974:1: ( ( rule__Workflow__StepsAssignment_5_3_1 ) )
            // InternalWorkflowDSL.g:975:2: ( rule__Workflow__StepsAssignment_5_3_1 )
            {
             before(grammarAccess.getWorkflowAccess().getStepsAssignment_5_3_1()); 
            // InternalWorkflowDSL.g:976:2: ( rule__Workflow__StepsAssignment_5_3_1 )
            // InternalWorkflowDSL.g:976:3: rule__Workflow__StepsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__StepsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowAccess().getStepsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_5_3__1__Impl"


    // $ANTLR start "rule__Step__Group_0__0"
    // InternalWorkflowDSL.g:985:1: rule__Step__Group_0__0 : rule__Step__Group_0__0__Impl rule__Step__Group_0__1 ;
    public final void rule__Step__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:989:1: ( rule__Step__Group_0__0__Impl rule__Step__Group_0__1 )
            // InternalWorkflowDSL.g:990:2: rule__Step__Group_0__0__Impl rule__Step__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Step__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_0__0"


    // $ANTLR start "rule__Step__Group_0__0__Impl"
    // InternalWorkflowDSL.g:997:1: rule__Step__Group_0__0__Impl : ( '{' ) ;
    public final void rule__Step__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1001:1: ( ( '{' ) )
            // InternalWorkflowDSL.g:1002:1: ( '{' )
            {
            // InternalWorkflowDSL.g:1002:1: ( '{' )
            // InternalWorkflowDSL.g:1003:2: '{'
            {
             before(grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_0__0__Impl"


    // $ANTLR start "rule__Step__Group_0__1"
    // InternalWorkflowDSL.g:1012:1: rule__Step__Group_0__1 : rule__Step__Group_0__1__Impl ;
    public final void rule__Step__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1016:1: ( rule__Step__Group_0__1__Impl )
            // InternalWorkflowDSL.g:1017:2: rule__Step__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_0__1"


    // $ANTLR start "rule__Step__Group_0__1__Impl"
    // InternalWorkflowDSL.g:1023:1: rule__Step__Group_0__1__Impl : ( ruleSourceStep ) ;
    public final void rule__Step__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1027:1: ( ( ruleSourceStep ) )
            // InternalWorkflowDSL.g:1028:1: ( ruleSourceStep )
            {
            // InternalWorkflowDSL.g:1028:1: ( ruleSourceStep )
            // InternalWorkflowDSL.g:1029:2: ruleSourceStep
            {
             before(grammarAccess.getStepAccess().getSourceStepParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSourceStep();

            state._fsp--;

             after(grammarAccess.getStepAccess().getSourceStepParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_0__1__Impl"


    // $ANTLR start "rule__Step__Group_2__0"
    // InternalWorkflowDSL.g:1039:1: rule__Step__Group_2__0 : rule__Step__Group_2__0__Impl rule__Step__Group_2__1 ;
    public final void rule__Step__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1043:1: ( rule__Step__Group_2__0__Impl rule__Step__Group_2__1 )
            // InternalWorkflowDSL.g:1044:2: rule__Step__Group_2__0__Impl rule__Step__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Step__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_2__0"


    // $ANTLR start "rule__Step__Group_2__0__Impl"
    // InternalWorkflowDSL.g:1051:1: rule__Step__Group_2__0__Impl : ( ruleSinkStep ) ;
    public final void rule__Step__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1055:1: ( ( ruleSinkStep ) )
            // InternalWorkflowDSL.g:1056:1: ( ruleSinkStep )
            {
            // InternalWorkflowDSL.g:1056:1: ( ruleSinkStep )
            // InternalWorkflowDSL.g:1057:2: ruleSinkStep
            {
             before(grammarAccess.getStepAccess().getSinkStepParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSinkStep();

            state._fsp--;

             after(grammarAccess.getStepAccess().getSinkStepParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_2__0__Impl"


    // $ANTLR start "rule__Step__Group_2__1"
    // InternalWorkflowDSL.g:1066:1: rule__Step__Group_2__1 : rule__Step__Group_2__1__Impl ;
    public final void rule__Step__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1070:1: ( rule__Step__Group_2__1__Impl )
            // InternalWorkflowDSL.g:1071:2: rule__Step__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_2__1"


    // $ANTLR start "rule__Step__Group_2__1__Impl"
    // InternalWorkflowDSL.g:1077:1: rule__Step__Group_2__1__Impl : ( '}' ) ;
    public final void rule__Step__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1081:1: ( ( '}' ) )
            // InternalWorkflowDSL.g:1082:1: ( '}' )
            {
            // InternalWorkflowDSL.g:1082:1: ( '}' )
            // InternalWorkflowDSL.g:1083:2: '}'
            {
             before(grammarAccess.getStepAccess().getRightCurlyBracketKeyword_2_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getRightCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_2__1__Impl"


    // $ANTLR start "rule__SourceStep__Group__0"
    // InternalWorkflowDSL.g:1093:1: rule__SourceStep__Group__0 : rule__SourceStep__Group__0__Impl rule__SourceStep__Group__1 ;
    public final void rule__SourceStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1097:1: ( rule__SourceStep__Group__0__Impl rule__SourceStep__Group__1 )
            // InternalWorkflowDSL.g:1098:2: rule__SourceStep__Group__0__Impl rule__SourceStep__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SourceStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group__0"


    // $ANTLR start "rule__SourceStep__Group__0__Impl"
    // InternalWorkflowDSL.g:1105:1: rule__SourceStep__Group__0__Impl : ( ( rule__SourceStep__NameAssignment_0 ) ) ;
    public final void rule__SourceStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1109:1: ( ( ( rule__SourceStep__NameAssignment_0 ) ) )
            // InternalWorkflowDSL.g:1110:1: ( ( rule__SourceStep__NameAssignment_0 ) )
            {
            // InternalWorkflowDSL.g:1110:1: ( ( rule__SourceStep__NameAssignment_0 ) )
            // InternalWorkflowDSL.g:1111:2: ( rule__SourceStep__NameAssignment_0 )
            {
             before(grammarAccess.getSourceStepAccess().getNameAssignment_0()); 
            // InternalWorkflowDSL.g:1112:2: ( rule__SourceStep__NameAssignment_0 )
            // InternalWorkflowDSL.g:1112:3: rule__SourceStep__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SourceStep__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSourceStepAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group__0__Impl"


    // $ANTLR start "rule__SourceStep__Group__1"
    // InternalWorkflowDSL.g:1120:1: rule__SourceStep__Group__1 : rule__SourceStep__Group__1__Impl rule__SourceStep__Group__2 ;
    public final void rule__SourceStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1124:1: ( rule__SourceStep__Group__1__Impl rule__SourceStep__Group__2 )
            // InternalWorkflowDSL.g:1125:2: rule__SourceStep__Group__1__Impl rule__SourceStep__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SourceStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group__1"


    // $ANTLR start "rule__SourceStep__Group__1__Impl"
    // InternalWorkflowDSL.g:1132:1: rule__SourceStep__Group__1__Impl : ( ( rule__SourceStep__Group_1__0 )? ) ;
    public final void rule__SourceStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1136:1: ( ( ( rule__SourceStep__Group_1__0 )? ) )
            // InternalWorkflowDSL.g:1137:1: ( ( rule__SourceStep__Group_1__0 )? )
            {
            // InternalWorkflowDSL.g:1137:1: ( ( rule__SourceStep__Group_1__0 )? )
            // InternalWorkflowDSL.g:1138:2: ( rule__SourceStep__Group_1__0 )?
            {
             before(grammarAccess.getSourceStepAccess().getGroup_1()); 
            // InternalWorkflowDSL.g:1139:2: ( rule__SourceStep__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalWorkflowDSL.g:1139:3: rule__SourceStep__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SourceStep__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceStepAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group__1__Impl"


    // $ANTLR start "rule__SourceStep__Group__2"
    // InternalWorkflowDSL.g:1147:1: rule__SourceStep__Group__2 : rule__SourceStep__Group__2__Impl rule__SourceStep__Group__3 ;
    public final void rule__SourceStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1151:1: ( rule__SourceStep__Group__2__Impl rule__SourceStep__Group__3 )
            // InternalWorkflowDSL.g:1152:2: rule__SourceStep__Group__2__Impl rule__SourceStep__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__SourceStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceStep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group__2"


    // $ANTLR start "rule__SourceStep__Group__2__Impl"
    // InternalWorkflowDSL.g:1159:1: rule__SourceStep__Group__2__Impl : ( ( rule__SourceStep__Group_2__0 )? ) ;
    public final void rule__SourceStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1163:1: ( ( ( rule__SourceStep__Group_2__0 )? ) )
            // InternalWorkflowDSL.g:1164:1: ( ( rule__SourceStep__Group_2__0 )? )
            {
            // InternalWorkflowDSL.g:1164:1: ( ( rule__SourceStep__Group_2__0 )? )
            // InternalWorkflowDSL.g:1165:2: ( rule__SourceStep__Group_2__0 )?
            {
             before(grammarAccess.getSourceStepAccess().getGroup_2()); 
            // InternalWorkflowDSL.g:1166:2: ( rule__SourceStep__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalWorkflowDSL.g:1166:3: rule__SourceStep__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SourceStep__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceStepAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group__2__Impl"


    // $ANTLR start "rule__SourceStep__Group__3"
    // InternalWorkflowDSL.g:1174:1: rule__SourceStep__Group__3 : rule__SourceStep__Group__3__Impl ;
    public final void rule__SourceStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1178:1: ( rule__SourceStep__Group__3__Impl )
            // InternalWorkflowDSL.g:1179:2: rule__SourceStep__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceStep__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group__3"


    // $ANTLR start "rule__SourceStep__Group__3__Impl"
    // InternalWorkflowDSL.g:1185:1: rule__SourceStep__Group__3__Impl : ( ( rule__SourceStep__Group_3__0 ) ) ;
    public final void rule__SourceStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1189:1: ( ( ( rule__SourceStep__Group_3__0 ) ) )
            // InternalWorkflowDSL.g:1190:1: ( ( rule__SourceStep__Group_3__0 ) )
            {
            // InternalWorkflowDSL.g:1190:1: ( ( rule__SourceStep__Group_3__0 ) )
            // InternalWorkflowDSL.g:1191:2: ( rule__SourceStep__Group_3__0 )
            {
             before(grammarAccess.getSourceStepAccess().getGroup_3()); 
            // InternalWorkflowDSL.g:1192:2: ( rule__SourceStep__Group_3__0 )
            // InternalWorkflowDSL.g:1192:3: rule__SourceStep__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__SourceStep__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceStepAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group__3__Impl"


    // $ANTLR start "rule__SourceStep__Group_1__0"
    // InternalWorkflowDSL.g:1201:1: rule__SourceStep__Group_1__0 : rule__SourceStep__Group_1__0__Impl rule__SourceStep__Group_1__1 ;
    public final void rule__SourceStep__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1205:1: ( rule__SourceStep__Group_1__0__Impl rule__SourceStep__Group_1__1 )
            // InternalWorkflowDSL.g:1206:2: rule__SourceStep__Group_1__0__Impl rule__SourceStep__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__SourceStep__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceStep__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_1__0"


    // $ANTLR start "rule__SourceStep__Group_1__0__Impl"
    // InternalWorkflowDSL.g:1213:1: rule__SourceStep__Group_1__0__Impl : ( 'recurring:' ) ;
    public final void rule__SourceStep__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1217:1: ( ( 'recurring:' ) )
            // InternalWorkflowDSL.g:1218:1: ( 'recurring:' )
            {
            // InternalWorkflowDSL.g:1218:1: ( 'recurring:' )
            // InternalWorkflowDSL.g:1219:2: 'recurring:'
            {
             before(grammarAccess.getSourceStepAccess().getRecurringKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSourceStepAccess().getRecurringKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_1__0__Impl"


    // $ANTLR start "rule__SourceStep__Group_1__1"
    // InternalWorkflowDSL.g:1228:1: rule__SourceStep__Group_1__1 : rule__SourceStep__Group_1__1__Impl ;
    public final void rule__SourceStep__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1232:1: ( rule__SourceStep__Group_1__1__Impl )
            // InternalWorkflowDSL.g:1233:2: rule__SourceStep__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceStep__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_1__1"


    // $ANTLR start "rule__SourceStep__Group_1__1__Impl"
    // InternalWorkflowDSL.g:1239:1: rule__SourceStep__Group_1__1__Impl : ( ( rule__SourceStep__RecurringAssignment_1_1 ) ) ;
    public final void rule__SourceStep__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1243:1: ( ( ( rule__SourceStep__RecurringAssignment_1_1 ) ) )
            // InternalWorkflowDSL.g:1244:1: ( ( rule__SourceStep__RecurringAssignment_1_1 ) )
            {
            // InternalWorkflowDSL.g:1244:1: ( ( rule__SourceStep__RecurringAssignment_1_1 ) )
            // InternalWorkflowDSL.g:1245:2: ( rule__SourceStep__RecurringAssignment_1_1 )
            {
             before(grammarAccess.getSourceStepAccess().getRecurringAssignment_1_1()); 
            // InternalWorkflowDSL.g:1246:2: ( rule__SourceStep__RecurringAssignment_1_1 )
            // InternalWorkflowDSL.g:1246:3: rule__SourceStep__RecurringAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SourceStep__RecurringAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceStepAccess().getRecurringAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_1__1__Impl"


    // $ANTLR start "rule__SourceStep__Group_2__0"
    // InternalWorkflowDSL.g:1255:1: rule__SourceStep__Group_2__0 : rule__SourceStep__Group_2__0__Impl rule__SourceStep__Group_2__1 ;
    public final void rule__SourceStep__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1259:1: ( rule__SourceStep__Group_2__0__Impl rule__SourceStep__Group_2__1 )
            // InternalWorkflowDSL.g:1260:2: rule__SourceStep__Group_2__0__Impl rule__SourceStep__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__SourceStep__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceStep__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_2__0"


    // $ANTLR start "rule__SourceStep__Group_2__0__Impl"
    // InternalWorkflowDSL.g:1267:1: rule__SourceStep__Group_2__0__Impl : ( 'parameters:' ) ;
    public final void rule__SourceStep__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1271:1: ( ( 'parameters:' ) )
            // InternalWorkflowDSL.g:1272:1: ( 'parameters:' )
            {
            // InternalWorkflowDSL.g:1272:1: ( 'parameters:' )
            // InternalWorkflowDSL.g:1273:2: 'parameters:'
            {
             before(grammarAccess.getSourceStepAccess().getParametersKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSourceStepAccess().getParametersKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_2__0__Impl"


    // $ANTLR start "rule__SourceStep__Group_2__1"
    // InternalWorkflowDSL.g:1282:1: rule__SourceStep__Group_2__1 : rule__SourceStep__Group_2__1__Impl rule__SourceStep__Group_2__2 ;
    public final void rule__SourceStep__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1286:1: ( rule__SourceStep__Group_2__1__Impl rule__SourceStep__Group_2__2 )
            // InternalWorkflowDSL.g:1287:2: rule__SourceStep__Group_2__1__Impl rule__SourceStep__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__SourceStep__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceStep__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_2__1"


    // $ANTLR start "rule__SourceStep__Group_2__1__Impl"
    // InternalWorkflowDSL.g:1294:1: rule__SourceStep__Group_2__1__Impl : ( '[' ) ;
    public final void rule__SourceStep__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1298:1: ( ( '[' ) )
            // InternalWorkflowDSL.g:1299:1: ( '[' )
            {
            // InternalWorkflowDSL.g:1299:1: ( '[' )
            // InternalWorkflowDSL.g:1300:2: '['
            {
             before(grammarAccess.getSourceStepAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSourceStepAccess().getLeftSquareBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_2__1__Impl"


    // $ANTLR start "rule__SourceStep__Group_2__2"
    // InternalWorkflowDSL.g:1309:1: rule__SourceStep__Group_2__2 : rule__SourceStep__Group_2__2__Impl rule__SourceStep__Group_2__3 ;
    public final void rule__SourceStep__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1313:1: ( rule__SourceStep__Group_2__2__Impl rule__SourceStep__Group_2__3 )
            // InternalWorkflowDSL.g:1314:2: rule__SourceStep__Group_2__2__Impl rule__SourceStep__Group_2__3
            {
            pushFollow(FOLLOW_9);
            rule__SourceStep__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceStep__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_2__2"


    // $ANTLR start "rule__SourceStep__Group_2__2__Impl"
    // InternalWorkflowDSL.g:1321:1: rule__SourceStep__Group_2__2__Impl : ( ( rule__SourceStep__Group_2_2__0 )? ) ;
    public final void rule__SourceStep__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1325:1: ( ( ( rule__SourceStep__Group_2_2__0 )? ) )
            // InternalWorkflowDSL.g:1326:1: ( ( rule__SourceStep__Group_2_2__0 )? )
            {
            // InternalWorkflowDSL.g:1326:1: ( ( rule__SourceStep__Group_2_2__0 )? )
            // InternalWorkflowDSL.g:1327:2: ( rule__SourceStep__Group_2_2__0 )?
            {
             before(grammarAccess.getSourceStepAccess().getGroup_2_2()); 
            // InternalWorkflowDSL.g:1328:2: ( rule__SourceStep__Group_2_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalWorkflowDSL.g:1328:3: rule__SourceStep__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SourceStep__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceStepAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_2__2__Impl"


    // $ANTLR start "rule__SourceStep__Group_2__3"
    // InternalWorkflowDSL.g:1336:1: rule__SourceStep__Group_2__3 : rule__SourceStep__Group_2__3__Impl ;
    public final void rule__SourceStep__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1340:1: ( rule__SourceStep__Group_2__3__Impl )
            // InternalWorkflowDSL.g:1341:2: rule__SourceStep__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceStep__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_2__3"


    // $ANTLR start "rule__SourceStep__Group_2__3__Impl"
    // InternalWorkflowDSL.g:1347:1: rule__SourceStep__Group_2__3__Impl : ( ']' ) ;
    public final void rule__SourceStep__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1351:1: ( ( ']' ) )
            // InternalWorkflowDSL.g:1352:1: ( ']' )
            {
            // InternalWorkflowDSL.g:1352:1: ( ']' )
            // InternalWorkflowDSL.g:1353:2: ']'
            {
             before(grammarAccess.getSourceStepAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSourceStepAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_2__3__Impl"


    // $ANTLR start "rule__SourceStep__Group_2_2__0"
    // InternalWorkflowDSL.g:1363:1: rule__SourceStep__Group_2_2__0 : rule__SourceStep__Group_2_2__0__Impl rule__SourceStep__Group_2_2__1 ;
    public final void rule__SourceStep__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1367:1: ( rule__SourceStep__Group_2_2__0__Impl rule__SourceStep__Group_2_2__1 )
            // InternalWorkflowDSL.g:1368:2: rule__SourceStep__Group_2_2__0__Impl rule__SourceStep__Group_2_2__1
            {
            pushFollow(FOLLOW_10);
            rule__SourceStep__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceStep__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_2_2__0"


    // $ANTLR start "rule__SourceStep__Group_2_2__0__Impl"
    // InternalWorkflowDSL.g:1375:1: rule__SourceStep__Group_2_2__0__Impl : ( ( rule__SourceStep__ParamsAssignment_2_2_0 ) ) ;
    public final void rule__SourceStep__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1379:1: ( ( ( rule__SourceStep__ParamsAssignment_2_2_0 ) ) )
            // InternalWorkflowDSL.g:1380:1: ( ( rule__SourceStep__ParamsAssignment_2_2_0 ) )
            {
            // InternalWorkflowDSL.g:1380:1: ( ( rule__SourceStep__ParamsAssignment_2_2_0 ) )
            // InternalWorkflowDSL.g:1381:2: ( rule__SourceStep__ParamsAssignment_2_2_0 )
            {
             before(grammarAccess.getSourceStepAccess().getParamsAssignment_2_2_0()); 
            // InternalWorkflowDSL.g:1382:2: ( rule__SourceStep__ParamsAssignment_2_2_0 )
            // InternalWorkflowDSL.g:1382:3: rule__SourceStep__ParamsAssignment_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SourceStep__ParamsAssignment_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSourceStepAccess().getParamsAssignment_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_2_2__0__Impl"


    // $ANTLR start "rule__SourceStep__Group_2_2__1"
    // InternalWorkflowDSL.g:1390:1: rule__SourceStep__Group_2_2__1 : rule__SourceStep__Group_2_2__1__Impl ;
    public final void rule__SourceStep__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1394:1: ( rule__SourceStep__Group_2_2__1__Impl )
            // InternalWorkflowDSL.g:1395:2: rule__SourceStep__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceStep__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_2_2__1"


    // $ANTLR start "rule__SourceStep__Group_2_2__1__Impl"
    // InternalWorkflowDSL.g:1401:1: rule__SourceStep__Group_2_2__1__Impl : ( ( rule__SourceStep__Group_2_2_1__0 )* ) ;
    public final void rule__SourceStep__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1405:1: ( ( ( rule__SourceStep__Group_2_2_1__0 )* ) )
            // InternalWorkflowDSL.g:1406:1: ( ( rule__SourceStep__Group_2_2_1__0 )* )
            {
            // InternalWorkflowDSL.g:1406:1: ( ( rule__SourceStep__Group_2_2_1__0 )* )
            // InternalWorkflowDSL.g:1407:2: ( rule__SourceStep__Group_2_2_1__0 )*
            {
             before(grammarAccess.getSourceStepAccess().getGroup_2_2_1()); 
            // InternalWorkflowDSL.g:1408:2: ( rule__SourceStep__Group_2_2_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWorkflowDSL.g:1408:3: rule__SourceStep__Group_2_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SourceStep__Group_2_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSourceStepAccess().getGroup_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_2_2__1__Impl"


    // $ANTLR start "rule__SourceStep__Group_2_2_1__0"
    // InternalWorkflowDSL.g:1417:1: rule__SourceStep__Group_2_2_1__0 : rule__SourceStep__Group_2_2_1__0__Impl rule__SourceStep__Group_2_2_1__1 ;
    public final void rule__SourceStep__Group_2_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1421:1: ( rule__SourceStep__Group_2_2_1__0__Impl rule__SourceStep__Group_2_2_1__1 )
            // InternalWorkflowDSL.g:1422:2: rule__SourceStep__Group_2_2_1__0__Impl rule__SourceStep__Group_2_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__SourceStep__Group_2_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceStep__Group_2_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_2_2_1__0"


    // $ANTLR start "rule__SourceStep__Group_2_2_1__0__Impl"
    // InternalWorkflowDSL.g:1429:1: rule__SourceStep__Group_2_2_1__0__Impl : ( ',' ) ;
    public final void rule__SourceStep__Group_2_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1433:1: ( ( ',' ) )
            // InternalWorkflowDSL.g:1434:1: ( ',' )
            {
            // InternalWorkflowDSL.g:1434:1: ( ',' )
            // InternalWorkflowDSL.g:1435:2: ','
            {
             before(grammarAccess.getSourceStepAccess().getCommaKeyword_2_2_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSourceStepAccess().getCommaKeyword_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_2_2_1__0__Impl"


    // $ANTLR start "rule__SourceStep__Group_2_2_1__1"
    // InternalWorkflowDSL.g:1444:1: rule__SourceStep__Group_2_2_1__1 : rule__SourceStep__Group_2_2_1__1__Impl ;
    public final void rule__SourceStep__Group_2_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1448:1: ( rule__SourceStep__Group_2_2_1__1__Impl )
            // InternalWorkflowDSL.g:1449:2: rule__SourceStep__Group_2_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceStep__Group_2_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_2_2_1__1"


    // $ANTLR start "rule__SourceStep__Group_2_2_1__1__Impl"
    // InternalWorkflowDSL.g:1455:1: rule__SourceStep__Group_2_2_1__1__Impl : ( ( rule__SourceStep__ParamsAssignment_2_2_1_1 ) ) ;
    public final void rule__SourceStep__Group_2_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1459:1: ( ( ( rule__SourceStep__ParamsAssignment_2_2_1_1 ) ) )
            // InternalWorkflowDSL.g:1460:1: ( ( rule__SourceStep__ParamsAssignment_2_2_1_1 ) )
            {
            // InternalWorkflowDSL.g:1460:1: ( ( rule__SourceStep__ParamsAssignment_2_2_1_1 ) )
            // InternalWorkflowDSL.g:1461:2: ( rule__SourceStep__ParamsAssignment_2_2_1_1 )
            {
             before(grammarAccess.getSourceStepAccess().getParamsAssignment_2_2_1_1()); 
            // InternalWorkflowDSL.g:1462:2: ( rule__SourceStep__ParamsAssignment_2_2_1_1 )
            // InternalWorkflowDSL.g:1462:3: rule__SourceStep__ParamsAssignment_2_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SourceStep__ParamsAssignment_2_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceStepAccess().getParamsAssignment_2_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_2_2_1__1__Impl"


    // $ANTLR start "rule__SourceStep__Group_3__0"
    // InternalWorkflowDSL.g:1471:1: rule__SourceStep__Group_3__0 : rule__SourceStep__Group_3__0__Impl rule__SourceStep__Group_3__1 ;
    public final void rule__SourceStep__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1475:1: ( rule__SourceStep__Group_3__0__Impl rule__SourceStep__Group_3__1 )
            // InternalWorkflowDSL.g:1476:2: rule__SourceStep__Group_3__0__Impl rule__SourceStep__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__SourceStep__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceStep__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_3__0"


    // $ANTLR start "rule__SourceStep__Group_3__0__Impl"
    // InternalWorkflowDSL.g:1483:1: rule__SourceStep__Group_3__0__Impl : ( 'writeTo:' ) ;
    public final void rule__SourceStep__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1487:1: ( ( 'writeTo:' ) )
            // InternalWorkflowDSL.g:1488:1: ( 'writeTo:' )
            {
            // InternalWorkflowDSL.g:1488:1: ( 'writeTo:' )
            // InternalWorkflowDSL.g:1489:2: 'writeTo:'
            {
             before(grammarAccess.getSourceStepAccess().getWriteToKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSourceStepAccess().getWriteToKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_3__0__Impl"


    // $ANTLR start "rule__SourceStep__Group_3__1"
    // InternalWorkflowDSL.g:1498:1: rule__SourceStep__Group_3__1 : rule__SourceStep__Group_3__1__Impl ;
    public final void rule__SourceStep__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1502:1: ( rule__SourceStep__Group_3__1__Impl )
            // InternalWorkflowDSL.g:1503:2: rule__SourceStep__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceStep__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_3__1"


    // $ANTLR start "rule__SourceStep__Group_3__1__Impl"
    // InternalWorkflowDSL.g:1509:1: rule__SourceStep__Group_3__1__Impl : ( ( rule__SourceStep__WriteToAssignment_3_1 ) ) ;
    public final void rule__SourceStep__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1513:1: ( ( ( rule__SourceStep__WriteToAssignment_3_1 ) ) )
            // InternalWorkflowDSL.g:1514:1: ( ( rule__SourceStep__WriteToAssignment_3_1 ) )
            {
            // InternalWorkflowDSL.g:1514:1: ( ( rule__SourceStep__WriteToAssignment_3_1 ) )
            // InternalWorkflowDSL.g:1515:2: ( rule__SourceStep__WriteToAssignment_3_1 )
            {
             before(grammarAccess.getSourceStepAccess().getWriteToAssignment_3_1()); 
            // InternalWorkflowDSL.g:1516:2: ( rule__SourceStep__WriteToAssignment_3_1 )
            // InternalWorkflowDSL.g:1516:3: rule__SourceStep__WriteToAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SourceStep__WriteToAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceStepAccess().getWriteToAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__Group_3__1__Impl"


    // $ANTLR start "rule__IntermediateStep__Group__0"
    // InternalWorkflowDSL.g:1525:1: rule__IntermediateStep__Group__0 : rule__IntermediateStep__Group__0__Impl rule__IntermediateStep__Group__1 ;
    public final void rule__IntermediateStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1529:1: ( rule__IntermediateStep__Group__0__Impl rule__IntermediateStep__Group__1 )
            // InternalWorkflowDSL.g:1530:2: rule__IntermediateStep__Group__0__Impl rule__IntermediateStep__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__IntermediateStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group__0"


    // $ANTLR start "rule__IntermediateStep__Group__0__Impl"
    // InternalWorkflowDSL.g:1537:1: rule__IntermediateStep__Group__0__Impl : ( ( rule__IntermediateStep__NameAssignment_0 ) ) ;
    public final void rule__IntermediateStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1541:1: ( ( ( rule__IntermediateStep__NameAssignment_0 ) ) )
            // InternalWorkflowDSL.g:1542:1: ( ( rule__IntermediateStep__NameAssignment_0 ) )
            {
            // InternalWorkflowDSL.g:1542:1: ( ( rule__IntermediateStep__NameAssignment_0 ) )
            // InternalWorkflowDSL.g:1543:2: ( rule__IntermediateStep__NameAssignment_0 )
            {
             before(grammarAccess.getIntermediateStepAccess().getNameAssignment_0()); 
            // InternalWorkflowDSL.g:1544:2: ( rule__IntermediateStep__NameAssignment_0 )
            // InternalWorkflowDSL.g:1544:3: rule__IntermediateStep__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__IntermediateStep__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntermediateStepAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group__0__Impl"


    // $ANTLR start "rule__IntermediateStep__Group__1"
    // InternalWorkflowDSL.g:1552:1: rule__IntermediateStep__Group__1 : rule__IntermediateStep__Group__1__Impl rule__IntermediateStep__Group__2 ;
    public final void rule__IntermediateStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1556:1: ( rule__IntermediateStep__Group__1__Impl rule__IntermediateStep__Group__2 )
            // InternalWorkflowDSL.g:1557:2: rule__IntermediateStep__Group__1__Impl rule__IntermediateStep__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__IntermediateStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group__1"


    // $ANTLR start "rule__IntermediateStep__Group__1__Impl"
    // InternalWorkflowDSL.g:1564:1: rule__IntermediateStep__Group__1__Impl : ( ( rule__IntermediateStep__Group_1__0 )? ) ;
    public final void rule__IntermediateStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1568:1: ( ( ( rule__IntermediateStep__Group_1__0 )? ) )
            // InternalWorkflowDSL.g:1569:1: ( ( rule__IntermediateStep__Group_1__0 )? )
            {
            // InternalWorkflowDSL.g:1569:1: ( ( rule__IntermediateStep__Group_1__0 )? )
            // InternalWorkflowDSL.g:1570:2: ( rule__IntermediateStep__Group_1__0 )?
            {
             before(grammarAccess.getIntermediateStepAccess().getGroup_1()); 
            // InternalWorkflowDSL.g:1571:2: ( rule__IntermediateStep__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalWorkflowDSL.g:1571:3: rule__IntermediateStep__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntermediateStep__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntermediateStepAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group__1__Impl"


    // $ANTLR start "rule__IntermediateStep__Group__2"
    // InternalWorkflowDSL.g:1579:1: rule__IntermediateStep__Group__2 : rule__IntermediateStep__Group__2__Impl rule__IntermediateStep__Group__3 ;
    public final void rule__IntermediateStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1583:1: ( rule__IntermediateStep__Group__2__Impl rule__IntermediateStep__Group__3 )
            // InternalWorkflowDSL.g:1584:2: rule__IntermediateStep__Group__2__Impl rule__IntermediateStep__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__IntermediateStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group__2"


    // $ANTLR start "rule__IntermediateStep__Group__2__Impl"
    // InternalWorkflowDSL.g:1591:1: rule__IntermediateStep__Group__2__Impl : ( ( rule__IntermediateStep__Group_2__0 )? ) ;
    public final void rule__IntermediateStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1595:1: ( ( ( rule__IntermediateStep__Group_2__0 )? ) )
            // InternalWorkflowDSL.g:1596:1: ( ( rule__IntermediateStep__Group_2__0 )? )
            {
            // InternalWorkflowDSL.g:1596:1: ( ( rule__IntermediateStep__Group_2__0 )? )
            // InternalWorkflowDSL.g:1597:2: ( rule__IntermediateStep__Group_2__0 )?
            {
             before(grammarAccess.getIntermediateStepAccess().getGroup_2()); 
            // InternalWorkflowDSL.g:1598:2: ( rule__IntermediateStep__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalWorkflowDSL.g:1598:3: rule__IntermediateStep__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntermediateStep__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntermediateStepAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group__2__Impl"


    // $ANTLR start "rule__IntermediateStep__Group__3"
    // InternalWorkflowDSL.g:1606:1: rule__IntermediateStep__Group__3 : rule__IntermediateStep__Group__3__Impl rule__IntermediateStep__Group__4 ;
    public final void rule__IntermediateStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1610:1: ( rule__IntermediateStep__Group__3__Impl rule__IntermediateStep__Group__4 )
            // InternalWorkflowDSL.g:1611:2: rule__IntermediateStep__Group__3__Impl rule__IntermediateStep__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__IntermediateStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group__3"


    // $ANTLR start "rule__IntermediateStep__Group__3__Impl"
    // InternalWorkflowDSL.g:1618:1: rule__IntermediateStep__Group__3__Impl : ( ( rule__IntermediateStep__Group_3__0 ) ) ;
    public final void rule__IntermediateStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1622:1: ( ( ( rule__IntermediateStep__Group_3__0 ) ) )
            // InternalWorkflowDSL.g:1623:1: ( ( rule__IntermediateStep__Group_3__0 ) )
            {
            // InternalWorkflowDSL.g:1623:1: ( ( rule__IntermediateStep__Group_3__0 ) )
            // InternalWorkflowDSL.g:1624:2: ( rule__IntermediateStep__Group_3__0 )
            {
             before(grammarAccess.getIntermediateStepAccess().getGroup_3()); 
            // InternalWorkflowDSL.g:1625:2: ( rule__IntermediateStep__Group_3__0 )
            // InternalWorkflowDSL.g:1625:3: rule__IntermediateStep__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getIntermediateStepAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group__3__Impl"


    // $ANTLR start "rule__IntermediateStep__Group__4"
    // InternalWorkflowDSL.g:1633:1: rule__IntermediateStep__Group__4 : rule__IntermediateStep__Group__4__Impl ;
    public final void rule__IntermediateStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1637:1: ( rule__IntermediateStep__Group__4__Impl )
            // InternalWorkflowDSL.g:1638:2: rule__IntermediateStep__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group__4"


    // $ANTLR start "rule__IntermediateStep__Group__4__Impl"
    // InternalWorkflowDSL.g:1644:1: rule__IntermediateStep__Group__4__Impl : ( ( rule__IntermediateStep__Group_4__0 ) ) ;
    public final void rule__IntermediateStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1648:1: ( ( ( rule__IntermediateStep__Group_4__0 ) ) )
            // InternalWorkflowDSL.g:1649:1: ( ( rule__IntermediateStep__Group_4__0 ) )
            {
            // InternalWorkflowDSL.g:1649:1: ( ( rule__IntermediateStep__Group_4__0 ) )
            // InternalWorkflowDSL.g:1650:2: ( rule__IntermediateStep__Group_4__0 )
            {
             before(grammarAccess.getIntermediateStepAccess().getGroup_4()); 
            // InternalWorkflowDSL.g:1651:2: ( rule__IntermediateStep__Group_4__0 )
            // InternalWorkflowDSL.g:1651:3: rule__IntermediateStep__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getIntermediateStepAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group__4__Impl"


    // $ANTLR start "rule__IntermediateStep__Group_1__0"
    // InternalWorkflowDSL.g:1660:1: rule__IntermediateStep__Group_1__0 : rule__IntermediateStep__Group_1__0__Impl rule__IntermediateStep__Group_1__1 ;
    public final void rule__IntermediateStep__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1664:1: ( rule__IntermediateStep__Group_1__0__Impl rule__IntermediateStep__Group_1__1 )
            // InternalWorkflowDSL.g:1665:2: rule__IntermediateStep__Group_1__0__Impl rule__IntermediateStep__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__IntermediateStep__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_1__0"


    // $ANTLR start "rule__IntermediateStep__Group_1__0__Impl"
    // InternalWorkflowDSL.g:1672:1: rule__IntermediateStep__Group_1__0__Impl : ( 'recurring:' ) ;
    public final void rule__IntermediateStep__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1676:1: ( ( 'recurring:' ) )
            // InternalWorkflowDSL.g:1677:1: ( 'recurring:' )
            {
            // InternalWorkflowDSL.g:1677:1: ( 'recurring:' )
            // InternalWorkflowDSL.g:1678:2: 'recurring:'
            {
             before(grammarAccess.getIntermediateStepAccess().getRecurringKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getIntermediateStepAccess().getRecurringKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_1__0__Impl"


    // $ANTLR start "rule__IntermediateStep__Group_1__1"
    // InternalWorkflowDSL.g:1687:1: rule__IntermediateStep__Group_1__1 : rule__IntermediateStep__Group_1__1__Impl ;
    public final void rule__IntermediateStep__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1691:1: ( rule__IntermediateStep__Group_1__1__Impl )
            // InternalWorkflowDSL.g:1692:2: rule__IntermediateStep__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_1__1"


    // $ANTLR start "rule__IntermediateStep__Group_1__1__Impl"
    // InternalWorkflowDSL.g:1698:1: rule__IntermediateStep__Group_1__1__Impl : ( ( rule__IntermediateStep__RecurringAssignment_1_1 ) ) ;
    public final void rule__IntermediateStep__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1702:1: ( ( ( rule__IntermediateStep__RecurringAssignment_1_1 ) ) )
            // InternalWorkflowDSL.g:1703:1: ( ( rule__IntermediateStep__RecurringAssignment_1_1 ) )
            {
            // InternalWorkflowDSL.g:1703:1: ( ( rule__IntermediateStep__RecurringAssignment_1_1 ) )
            // InternalWorkflowDSL.g:1704:2: ( rule__IntermediateStep__RecurringAssignment_1_1 )
            {
             before(grammarAccess.getIntermediateStepAccess().getRecurringAssignment_1_1()); 
            // InternalWorkflowDSL.g:1705:2: ( rule__IntermediateStep__RecurringAssignment_1_1 )
            // InternalWorkflowDSL.g:1705:3: rule__IntermediateStep__RecurringAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__IntermediateStep__RecurringAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIntermediateStepAccess().getRecurringAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_1__1__Impl"


    // $ANTLR start "rule__IntermediateStep__Group_2__0"
    // InternalWorkflowDSL.g:1714:1: rule__IntermediateStep__Group_2__0 : rule__IntermediateStep__Group_2__0__Impl rule__IntermediateStep__Group_2__1 ;
    public final void rule__IntermediateStep__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1718:1: ( rule__IntermediateStep__Group_2__0__Impl rule__IntermediateStep__Group_2__1 )
            // InternalWorkflowDSL.g:1719:2: rule__IntermediateStep__Group_2__0__Impl rule__IntermediateStep__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__IntermediateStep__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_2__0"


    // $ANTLR start "rule__IntermediateStep__Group_2__0__Impl"
    // InternalWorkflowDSL.g:1726:1: rule__IntermediateStep__Group_2__0__Impl : ( 'parameters:' ) ;
    public final void rule__IntermediateStep__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1730:1: ( ( 'parameters:' ) )
            // InternalWorkflowDSL.g:1731:1: ( 'parameters:' )
            {
            // InternalWorkflowDSL.g:1731:1: ( 'parameters:' )
            // InternalWorkflowDSL.g:1732:2: 'parameters:'
            {
             before(grammarAccess.getIntermediateStepAccess().getParametersKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIntermediateStepAccess().getParametersKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_2__0__Impl"


    // $ANTLR start "rule__IntermediateStep__Group_2__1"
    // InternalWorkflowDSL.g:1741:1: rule__IntermediateStep__Group_2__1 : rule__IntermediateStep__Group_2__1__Impl rule__IntermediateStep__Group_2__2 ;
    public final void rule__IntermediateStep__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1745:1: ( rule__IntermediateStep__Group_2__1__Impl rule__IntermediateStep__Group_2__2 )
            // InternalWorkflowDSL.g:1746:2: rule__IntermediateStep__Group_2__1__Impl rule__IntermediateStep__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__IntermediateStep__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_2__1"


    // $ANTLR start "rule__IntermediateStep__Group_2__1__Impl"
    // InternalWorkflowDSL.g:1753:1: rule__IntermediateStep__Group_2__1__Impl : ( '[' ) ;
    public final void rule__IntermediateStep__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1757:1: ( ( '[' ) )
            // InternalWorkflowDSL.g:1758:1: ( '[' )
            {
            // InternalWorkflowDSL.g:1758:1: ( '[' )
            // InternalWorkflowDSL.g:1759:2: '['
            {
             before(grammarAccess.getIntermediateStepAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIntermediateStepAccess().getLeftSquareBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_2__1__Impl"


    // $ANTLR start "rule__IntermediateStep__Group_2__2"
    // InternalWorkflowDSL.g:1768:1: rule__IntermediateStep__Group_2__2 : rule__IntermediateStep__Group_2__2__Impl rule__IntermediateStep__Group_2__3 ;
    public final void rule__IntermediateStep__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1772:1: ( rule__IntermediateStep__Group_2__2__Impl rule__IntermediateStep__Group_2__3 )
            // InternalWorkflowDSL.g:1773:2: rule__IntermediateStep__Group_2__2__Impl rule__IntermediateStep__Group_2__3
            {
            pushFollow(FOLLOW_9);
            rule__IntermediateStep__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_2__2"


    // $ANTLR start "rule__IntermediateStep__Group_2__2__Impl"
    // InternalWorkflowDSL.g:1780:1: rule__IntermediateStep__Group_2__2__Impl : ( ( rule__IntermediateStep__Group_2_2__0 )? ) ;
    public final void rule__IntermediateStep__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1784:1: ( ( ( rule__IntermediateStep__Group_2_2__0 )? ) )
            // InternalWorkflowDSL.g:1785:1: ( ( rule__IntermediateStep__Group_2_2__0 )? )
            {
            // InternalWorkflowDSL.g:1785:1: ( ( rule__IntermediateStep__Group_2_2__0 )? )
            // InternalWorkflowDSL.g:1786:2: ( rule__IntermediateStep__Group_2_2__0 )?
            {
             before(grammarAccess.getIntermediateStepAccess().getGroup_2_2()); 
            // InternalWorkflowDSL.g:1787:2: ( rule__IntermediateStep__Group_2_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalWorkflowDSL.g:1787:3: rule__IntermediateStep__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntermediateStep__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntermediateStepAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_2__2__Impl"


    // $ANTLR start "rule__IntermediateStep__Group_2__3"
    // InternalWorkflowDSL.g:1795:1: rule__IntermediateStep__Group_2__3 : rule__IntermediateStep__Group_2__3__Impl ;
    public final void rule__IntermediateStep__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1799:1: ( rule__IntermediateStep__Group_2__3__Impl )
            // InternalWorkflowDSL.g:1800:2: rule__IntermediateStep__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_2__3"


    // $ANTLR start "rule__IntermediateStep__Group_2__3__Impl"
    // InternalWorkflowDSL.g:1806:1: rule__IntermediateStep__Group_2__3__Impl : ( ']' ) ;
    public final void rule__IntermediateStep__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1810:1: ( ( ']' ) )
            // InternalWorkflowDSL.g:1811:1: ( ']' )
            {
            // InternalWorkflowDSL.g:1811:1: ( ']' )
            // InternalWorkflowDSL.g:1812:2: ']'
            {
             before(grammarAccess.getIntermediateStepAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIntermediateStepAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_2__3__Impl"


    // $ANTLR start "rule__IntermediateStep__Group_2_2__0"
    // InternalWorkflowDSL.g:1822:1: rule__IntermediateStep__Group_2_2__0 : rule__IntermediateStep__Group_2_2__0__Impl rule__IntermediateStep__Group_2_2__1 ;
    public final void rule__IntermediateStep__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1826:1: ( rule__IntermediateStep__Group_2_2__0__Impl rule__IntermediateStep__Group_2_2__1 )
            // InternalWorkflowDSL.g:1827:2: rule__IntermediateStep__Group_2_2__0__Impl rule__IntermediateStep__Group_2_2__1
            {
            pushFollow(FOLLOW_10);
            rule__IntermediateStep__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_2_2__0"


    // $ANTLR start "rule__IntermediateStep__Group_2_2__0__Impl"
    // InternalWorkflowDSL.g:1834:1: rule__IntermediateStep__Group_2_2__0__Impl : ( ( rule__IntermediateStep__ParamsAssignment_2_2_0 ) ) ;
    public final void rule__IntermediateStep__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1838:1: ( ( ( rule__IntermediateStep__ParamsAssignment_2_2_0 ) ) )
            // InternalWorkflowDSL.g:1839:1: ( ( rule__IntermediateStep__ParamsAssignment_2_2_0 ) )
            {
            // InternalWorkflowDSL.g:1839:1: ( ( rule__IntermediateStep__ParamsAssignment_2_2_0 ) )
            // InternalWorkflowDSL.g:1840:2: ( rule__IntermediateStep__ParamsAssignment_2_2_0 )
            {
             before(grammarAccess.getIntermediateStepAccess().getParamsAssignment_2_2_0()); 
            // InternalWorkflowDSL.g:1841:2: ( rule__IntermediateStep__ParamsAssignment_2_2_0 )
            // InternalWorkflowDSL.g:1841:3: rule__IntermediateStep__ParamsAssignment_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__IntermediateStep__ParamsAssignment_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getIntermediateStepAccess().getParamsAssignment_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_2_2__0__Impl"


    // $ANTLR start "rule__IntermediateStep__Group_2_2__1"
    // InternalWorkflowDSL.g:1849:1: rule__IntermediateStep__Group_2_2__1 : rule__IntermediateStep__Group_2_2__1__Impl ;
    public final void rule__IntermediateStep__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1853:1: ( rule__IntermediateStep__Group_2_2__1__Impl )
            // InternalWorkflowDSL.g:1854:2: rule__IntermediateStep__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_2_2__1"


    // $ANTLR start "rule__IntermediateStep__Group_2_2__1__Impl"
    // InternalWorkflowDSL.g:1860:1: rule__IntermediateStep__Group_2_2__1__Impl : ( ( rule__IntermediateStep__Group_2_2_1__0 )* ) ;
    public final void rule__IntermediateStep__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1864:1: ( ( ( rule__IntermediateStep__Group_2_2_1__0 )* ) )
            // InternalWorkflowDSL.g:1865:1: ( ( rule__IntermediateStep__Group_2_2_1__0 )* )
            {
            // InternalWorkflowDSL.g:1865:1: ( ( rule__IntermediateStep__Group_2_2_1__0 )* )
            // InternalWorkflowDSL.g:1866:2: ( rule__IntermediateStep__Group_2_2_1__0 )*
            {
             before(grammarAccess.getIntermediateStepAccess().getGroup_2_2_1()); 
            // InternalWorkflowDSL.g:1867:2: ( rule__IntermediateStep__Group_2_2_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalWorkflowDSL.g:1867:3: rule__IntermediateStep__Group_2_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__IntermediateStep__Group_2_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getIntermediateStepAccess().getGroup_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_2_2__1__Impl"


    // $ANTLR start "rule__IntermediateStep__Group_2_2_1__0"
    // InternalWorkflowDSL.g:1876:1: rule__IntermediateStep__Group_2_2_1__0 : rule__IntermediateStep__Group_2_2_1__0__Impl rule__IntermediateStep__Group_2_2_1__1 ;
    public final void rule__IntermediateStep__Group_2_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1880:1: ( rule__IntermediateStep__Group_2_2_1__0__Impl rule__IntermediateStep__Group_2_2_1__1 )
            // InternalWorkflowDSL.g:1881:2: rule__IntermediateStep__Group_2_2_1__0__Impl rule__IntermediateStep__Group_2_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__IntermediateStep__Group_2_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group_2_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_2_2_1__0"


    // $ANTLR start "rule__IntermediateStep__Group_2_2_1__0__Impl"
    // InternalWorkflowDSL.g:1888:1: rule__IntermediateStep__Group_2_2_1__0__Impl : ( ',' ) ;
    public final void rule__IntermediateStep__Group_2_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1892:1: ( ( ',' ) )
            // InternalWorkflowDSL.g:1893:1: ( ',' )
            {
            // InternalWorkflowDSL.g:1893:1: ( ',' )
            // InternalWorkflowDSL.g:1894:2: ','
            {
             before(grammarAccess.getIntermediateStepAccess().getCommaKeyword_2_2_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIntermediateStepAccess().getCommaKeyword_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_2_2_1__0__Impl"


    // $ANTLR start "rule__IntermediateStep__Group_2_2_1__1"
    // InternalWorkflowDSL.g:1903:1: rule__IntermediateStep__Group_2_2_1__1 : rule__IntermediateStep__Group_2_2_1__1__Impl ;
    public final void rule__IntermediateStep__Group_2_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1907:1: ( rule__IntermediateStep__Group_2_2_1__1__Impl )
            // InternalWorkflowDSL.g:1908:2: rule__IntermediateStep__Group_2_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group_2_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_2_2_1__1"


    // $ANTLR start "rule__IntermediateStep__Group_2_2_1__1__Impl"
    // InternalWorkflowDSL.g:1914:1: rule__IntermediateStep__Group_2_2_1__1__Impl : ( ( rule__IntermediateStep__ParamsAssignment_2_2_1_1 ) ) ;
    public final void rule__IntermediateStep__Group_2_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1918:1: ( ( ( rule__IntermediateStep__ParamsAssignment_2_2_1_1 ) ) )
            // InternalWorkflowDSL.g:1919:1: ( ( rule__IntermediateStep__ParamsAssignment_2_2_1_1 ) )
            {
            // InternalWorkflowDSL.g:1919:1: ( ( rule__IntermediateStep__ParamsAssignment_2_2_1_1 ) )
            // InternalWorkflowDSL.g:1920:2: ( rule__IntermediateStep__ParamsAssignment_2_2_1_1 )
            {
             before(grammarAccess.getIntermediateStepAccess().getParamsAssignment_2_2_1_1()); 
            // InternalWorkflowDSL.g:1921:2: ( rule__IntermediateStep__ParamsAssignment_2_2_1_1 )
            // InternalWorkflowDSL.g:1921:3: rule__IntermediateStep__ParamsAssignment_2_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__IntermediateStep__ParamsAssignment_2_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIntermediateStepAccess().getParamsAssignment_2_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_2_2_1__1__Impl"


    // $ANTLR start "rule__IntermediateStep__Group_3__0"
    // InternalWorkflowDSL.g:1930:1: rule__IntermediateStep__Group_3__0 : rule__IntermediateStep__Group_3__0__Impl rule__IntermediateStep__Group_3__1 ;
    public final void rule__IntermediateStep__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1934:1: ( rule__IntermediateStep__Group_3__0__Impl rule__IntermediateStep__Group_3__1 )
            // InternalWorkflowDSL.g:1935:2: rule__IntermediateStep__Group_3__0__Impl rule__IntermediateStep__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__IntermediateStep__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_3__0"


    // $ANTLR start "rule__IntermediateStep__Group_3__0__Impl"
    // InternalWorkflowDSL.g:1942:1: rule__IntermediateStep__Group_3__0__Impl : ( 'readFrom:' ) ;
    public final void rule__IntermediateStep__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1946:1: ( ( 'readFrom:' ) )
            // InternalWorkflowDSL.g:1947:1: ( 'readFrom:' )
            {
            // InternalWorkflowDSL.g:1947:1: ( 'readFrom:' )
            // InternalWorkflowDSL.g:1948:2: 'readFrom:'
            {
             before(grammarAccess.getIntermediateStepAccess().getReadFromKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getIntermediateStepAccess().getReadFromKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_3__0__Impl"


    // $ANTLR start "rule__IntermediateStep__Group_3__1"
    // InternalWorkflowDSL.g:1957:1: rule__IntermediateStep__Group_3__1 : rule__IntermediateStep__Group_3__1__Impl ;
    public final void rule__IntermediateStep__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1961:1: ( rule__IntermediateStep__Group_3__1__Impl )
            // InternalWorkflowDSL.g:1962:2: rule__IntermediateStep__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_3__1"


    // $ANTLR start "rule__IntermediateStep__Group_3__1__Impl"
    // InternalWorkflowDSL.g:1968:1: rule__IntermediateStep__Group_3__1__Impl : ( ( rule__IntermediateStep__ReadFromAssignment_3_1 ) ) ;
    public final void rule__IntermediateStep__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1972:1: ( ( ( rule__IntermediateStep__ReadFromAssignment_3_1 ) ) )
            // InternalWorkflowDSL.g:1973:1: ( ( rule__IntermediateStep__ReadFromAssignment_3_1 ) )
            {
            // InternalWorkflowDSL.g:1973:1: ( ( rule__IntermediateStep__ReadFromAssignment_3_1 ) )
            // InternalWorkflowDSL.g:1974:2: ( rule__IntermediateStep__ReadFromAssignment_3_1 )
            {
             before(grammarAccess.getIntermediateStepAccess().getReadFromAssignment_3_1()); 
            // InternalWorkflowDSL.g:1975:2: ( rule__IntermediateStep__ReadFromAssignment_3_1 )
            // InternalWorkflowDSL.g:1975:3: rule__IntermediateStep__ReadFromAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__IntermediateStep__ReadFromAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIntermediateStepAccess().getReadFromAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_3__1__Impl"


    // $ANTLR start "rule__IntermediateStep__Group_4__0"
    // InternalWorkflowDSL.g:1984:1: rule__IntermediateStep__Group_4__0 : rule__IntermediateStep__Group_4__0__Impl rule__IntermediateStep__Group_4__1 ;
    public final void rule__IntermediateStep__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:1988:1: ( rule__IntermediateStep__Group_4__0__Impl rule__IntermediateStep__Group_4__1 )
            // InternalWorkflowDSL.g:1989:2: rule__IntermediateStep__Group_4__0__Impl rule__IntermediateStep__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__IntermediateStep__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_4__0"


    // $ANTLR start "rule__IntermediateStep__Group_4__0__Impl"
    // InternalWorkflowDSL.g:1996:1: rule__IntermediateStep__Group_4__0__Impl : ( 'writeTo:' ) ;
    public final void rule__IntermediateStep__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2000:1: ( ( 'writeTo:' ) )
            // InternalWorkflowDSL.g:2001:1: ( 'writeTo:' )
            {
            // InternalWorkflowDSL.g:2001:1: ( 'writeTo:' )
            // InternalWorkflowDSL.g:2002:2: 'writeTo:'
            {
             before(grammarAccess.getIntermediateStepAccess().getWriteToKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIntermediateStepAccess().getWriteToKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_4__0__Impl"


    // $ANTLR start "rule__IntermediateStep__Group_4__1"
    // InternalWorkflowDSL.g:2011:1: rule__IntermediateStep__Group_4__1 : rule__IntermediateStep__Group_4__1__Impl ;
    public final void rule__IntermediateStep__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2015:1: ( rule__IntermediateStep__Group_4__1__Impl )
            // InternalWorkflowDSL.g:2016:2: rule__IntermediateStep__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntermediateStep__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_4__1"


    // $ANTLR start "rule__IntermediateStep__Group_4__1__Impl"
    // InternalWorkflowDSL.g:2022:1: rule__IntermediateStep__Group_4__1__Impl : ( ( rule__IntermediateStep__WriteToAssignment_4_1 ) ) ;
    public final void rule__IntermediateStep__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2026:1: ( ( ( rule__IntermediateStep__WriteToAssignment_4_1 ) ) )
            // InternalWorkflowDSL.g:2027:1: ( ( rule__IntermediateStep__WriteToAssignment_4_1 ) )
            {
            // InternalWorkflowDSL.g:2027:1: ( ( rule__IntermediateStep__WriteToAssignment_4_1 ) )
            // InternalWorkflowDSL.g:2028:2: ( rule__IntermediateStep__WriteToAssignment_4_1 )
            {
             before(grammarAccess.getIntermediateStepAccess().getWriteToAssignment_4_1()); 
            // InternalWorkflowDSL.g:2029:2: ( rule__IntermediateStep__WriteToAssignment_4_1 )
            // InternalWorkflowDSL.g:2029:3: rule__IntermediateStep__WriteToAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__IntermediateStep__WriteToAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIntermediateStepAccess().getWriteToAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__Group_4__1__Impl"


    // $ANTLR start "rule__SinkStep__Group__0"
    // InternalWorkflowDSL.g:2038:1: rule__SinkStep__Group__0 : rule__SinkStep__Group__0__Impl rule__SinkStep__Group__1 ;
    public final void rule__SinkStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2042:1: ( rule__SinkStep__Group__0__Impl rule__SinkStep__Group__1 )
            // InternalWorkflowDSL.g:2043:2: rule__SinkStep__Group__0__Impl rule__SinkStep__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SinkStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SinkStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group__0"


    // $ANTLR start "rule__SinkStep__Group__0__Impl"
    // InternalWorkflowDSL.g:2050:1: rule__SinkStep__Group__0__Impl : ( ( rule__SinkStep__NameAssignment_0 ) ) ;
    public final void rule__SinkStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2054:1: ( ( ( rule__SinkStep__NameAssignment_0 ) ) )
            // InternalWorkflowDSL.g:2055:1: ( ( rule__SinkStep__NameAssignment_0 ) )
            {
            // InternalWorkflowDSL.g:2055:1: ( ( rule__SinkStep__NameAssignment_0 ) )
            // InternalWorkflowDSL.g:2056:2: ( rule__SinkStep__NameAssignment_0 )
            {
             before(grammarAccess.getSinkStepAccess().getNameAssignment_0()); 
            // InternalWorkflowDSL.g:2057:2: ( rule__SinkStep__NameAssignment_0 )
            // InternalWorkflowDSL.g:2057:3: rule__SinkStep__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SinkStep__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSinkStepAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group__0__Impl"


    // $ANTLR start "rule__SinkStep__Group__1"
    // InternalWorkflowDSL.g:2065:1: rule__SinkStep__Group__1 : rule__SinkStep__Group__1__Impl rule__SinkStep__Group__2 ;
    public final void rule__SinkStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2069:1: ( rule__SinkStep__Group__1__Impl rule__SinkStep__Group__2 )
            // InternalWorkflowDSL.g:2070:2: rule__SinkStep__Group__1__Impl rule__SinkStep__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__SinkStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SinkStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group__1"


    // $ANTLR start "rule__SinkStep__Group__1__Impl"
    // InternalWorkflowDSL.g:2077:1: rule__SinkStep__Group__1__Impl : ( ( rule__SinkStep__Group_1__0 )? ) ;
    public final void rule__SinkStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2081:1: ( ( ( rule__SinkStep__Group_1__0 )? ) )
            // InternalWorkflowDSL.g:2082:1: ( ( rule__SinkStep__Group_1__0 )? )
            {
            // InternalWorkflowDSL.g:2082:1: ( ( rule__SinkStep__Group_1__0 )? )
            // InternalWorkflowDSL.g:2083:2: ( rule__SinkStep__Group_1__0 )?
            {
             before(grammarAccess.getSinkStepAccess().getGroup_1()); 
            // InternalWorkflowDSL.g:2084:2: ( rule__SinkStep__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalWorkflowDSL.g:2084:3: rule__SinkStep__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SinkStep__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSinkStepAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group__1__Impl"


    // $ANTLR start "rule__SinkStep__Group__2"
    // InternalWorkflowDSL.g:2092:1: rule__SinkStep__Group__2 : rule__SinkStep__Group__2__Impl rule__SinkStep__Group__3 ;
    public final void rule__SinkStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2096:1: ( rule__SinkStep__Group__2__Impl rule__SinkStep__Group__3 )
            // InternalWorkflowDSL.g:2097:2: rule__SinkStep__Group__2__Impl rule__SinkStep__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__SinkStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SinkStep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group__2"


    // $ANTLR start "rule__SinkStep__Group__2__Impl"
    // InternalWorkflowDSL.g:2104:1: rule__SinkStep__Group__2__Impl : ( ( rule__SinkStep__Group_2__0 )? ) ;
    public final void rule__SinkStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2108:1: ( ( ( rule__SinkStep__Group_2__0 )? ) )
            // InternalWorkflowDSL.g:2109:1: ( ( rule__SinkStep__Group_2__0 )? )
            {
            // InternalWorkflowDSL.g:2109:1: ( ( rule__SinkStep__Group_2__0 )? )
            // InternalWorkflowDSL.g:2110:2: ( rule__SinkStep__Group_2__0 )?
            {
             before(grammarAccess.getSinkStepAccess().getGroup_2()); 
            // InternalWorkflowDSL.g:2111:2: ( rule__SinkStep__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalWorkflowDSL.g:2111:3: rule__SinkStep__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SinkStep__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSinkStepAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group__2__Impl"


    // $ANTLR start "rule__SinkStep__Group__3"
    // InternalWorkflowDSL.g:2119:1: rule__SinkStep__Group__3 : rule__SinkStep__Group__3__Impl ;
    public final void rule__SinkStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2123:1: ( rule__SinkStep__Group__3__Impl )
            // InternalWorkflowDSL.g:2124:2: rule__SinkStep__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SinkStep__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group__3"


    // $ANTLR start "rule__SinkStep__Group__3__Impl"
    // InternalWorkflowDSL.g:2130:1: rule__SinkStep__Group__3__Impl : ( ( rule__SinkStep__Group_3__0 ) ) ;
    public final void rule__SinkStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2134:1: ( ( ( rule__SinkStep__Group_3__0 ) ) )
            // InternalWorkflowDSL.g:2135:1: ( ( rule__SinkStep__Group_3__0 ) )
            {
            // InternalWorkflowDSL.g:2135:1: ( ( rule__SinkStep__Group_3__0 ) )
            // InternalWorkflowDSL.g:2136:2: ( rule__SinkStep__Group_3__0 )
            {
             before(grammarAccess.getSinkStepAccess().getGroup_3()); 
            // InternalWorkflowDSL.g:2137:2: ( rule__SinkStep__Group_3__0 )
            // InternalWorkflowDSL.g:2137:3: rule__SinkStep__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__SinkStep__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getSinkStepAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group__3__Impl"


    // $ANTLR start "rule__SinkStep__Group_1__0"
    // InternalWorkflowDSL.g:2146:1: rule__SinkStep__Group_1__0 : rule__SinkStep__Group_1__0__Impl rule__SinkStep__Group_1__1 ;
    public final void rule__SinkStep__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2150:1: ( rule__SinkStep__Group_1__0__Impl rule__SinkStep__Group_1__1 )
            // InternalWorkflowDSL.g:2151:2: rule__SinkStep__Group_1__0__Impl rule__SinkStep__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__SinkStep__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SinkStep__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_1__0"


    // $ANTLR start "rule__SinkStep__Group_1__0__Impl"
    // InternalWorkflowDSL.g:2158:1: rule__SinkStep__Group_1__0__Impl : ( 'recurring:' ) ;
    public final void rule__SinkStep__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2162:1: ( ( 'recurring:' ) )
            // InternalWorkflowDSL.g:2163:1: ( 'recurring:' )
            {
            // InternalWorkflowDSL.g:2163:1: ( 'recurring:' )
            // InternalWorkflowDSL.g:2164:2: 'recurring:'
            {
             before(grammarAccess.getSinkStepAccess().getRecurringKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSinkStepAccess().getRecurringKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_1__0__Impl"


    // $ANTLR start "rule__SinkStep__Group_1__1"
    // InternalWorkflowDSL.g:2173:1: rule__SinkStep__Group_1__1 : rule__SinkStep__Group_1__1__Impl ;
    public final void rule__SinkStep__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2177:1: ( rule__SinkStep__Group_1__1__Impl )
            // InternalWorkflowDSL.g:2178:2: rule__SinkStep__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SinkStep__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_1__1"


    // $ANTLR start "rule__SinkStep__Group_1__1__Impl"
    // InternalWorkflowDSL.g:2184:1: rule__SinkStep__Group_1__1__Impl : ( ( rule__SinkStep__RecurringAssignment_1_1 ) ) ;
    public final void rule__SinkStep__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2188:1: ( ( ( rule__SinkStep__RecurringAssignment_1_1 ) ) )
            // InternalWorkflowDSL.g:2189:1: ( ( rule__SinkStep__RecurringAssignment_1_1 ) )
            {
            // InternalWorkflowDSL.g:2189:1: ( ( rule__SinkStep__RecurringAssignment_1_1 ) )
            // InternalWorkflowDSL.g:2190:2: ( rule__SinkStep__RecurringAssignment_1_1 )
            {
             before(grammarAccess.getSinkStepAccess().getRecurringAssignment_1_1()); 
            // InternalWorkflowDSL.g:2191:2: ( rule__SinkStep__RecurringAssignment_1_1 )
            // InternalWorkflowDSL.g:2191:3: rule__SinkStep__RecurringAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SinkStep__RecurringAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSinkStepAccess().getRecurringAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_1__1__Impl"


    // $ANTLR start "rule__SinkStep__Group_2__0"
    // InternalWorkflowDSL.g:2200:1: rule__SinkStep__Group_2__0 : rule__SinkStep__Group_2__0__Impl rule__SinkStep__Group_2__1 ;
    public final void rule__SinkStep__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2204:1: ( rule__SinkStep__Group_2__0__Impl rule__SinkStep__Group_2__1 )
            // InternalWorkflowDSL.g:2205:2: rule__SinkStep__Group_2__0__Impl rule__SinkStep__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__SinkStep__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SinkStep__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_2__0"


    // $ANTLR start "rule__SinkStep__Group_2__0__Impl"
    // InternalWorkflowDSL.g:2212:1: rule__SinkStep__Group_2__0__Impl : ( 'parameters:' ) ;
    public final void rule__SinkStep__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2216:1: ( ( 'parameters:' ) )
            // InternalWorkflowDSL.g:2217:1: ( 'parameters:' )
            {
            // InternalWorkflowDSL.g:2217:1: ( 'parameters:' )
            // InternalWorkflowDSL.g:2218:2: 'parameters:'
            {
             before(grammarAccess.getSinkStepAccess().getParametersKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSinkStepAccess().getParametersKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_2__0__Impl"


    // $ANTLR start "rule__SinkStep__Group_2__1"
    // InternalWorkflowDSL.g:2227:1: rule__SinkStep__Group_2__1 : rule__SinkStep__Group_2__1__Impl rule__SinkStep__Group_2__2 ;
    public final void rule__SinkStep__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2231:1: ( rule__SinkStep__Group_2__1__Impl rule__SinkStep__Group_2__2 )
            // InternalWorkflowDSL.g:2232:2: rule__SinkStep__Group_2__1__Impl rule__SinkStep__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__SinkStep__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SinkStep__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_2__1"


    // $ANTLR start "rule__SinkStep__Group_2__1__Impl"
    // InternalWorkflowDSL.g:2239:1: rule__SinkStep__Group_2__1__Impl : ( '[' ) ;
    public final void rule__SinkStep__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2243:1: ( ( '[' ) )
            // InternalWorkflowDSL.g:2244:1: ( '[' )
            {
            // InternalWorkflowDSL.g:2244:1: ( '[' )
            // InternalWorkflowDSL.g:2245:2: '['
            {
             before(grammarAccess.getSinkStepAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSinkStepAccess().getLeftSquareBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_2__1__Impl"


    // $ANTLR start "rule__SinkStep__Group_2__2"
    // InternalWorkflowDSL.g:2254:1: rule__SinkStep__Group_2__2 : rule__SinkStep__Group_2__2__Impl rule__SinkStep__Group_2__3 ;
    public final void rule__SinkStep__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2258:1: ( rule__SinkStep__Group_2__2__Impl rule__SinkStep__Group_2__3 )
            // InternalWorkflowDSL.g:2259:2: rule__SinkStep__Group_2__2__Impl rule__SinkStep__Group_2__3
            {
            pushFollow(FOLLOW_9);
            rule__SinkStep__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SinkStep__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_2__2"


    // $ANTLR start "rule__SinkStep__Group_2__2__Impl"
    // InternalWorkflowDSL.g:2266:1: rule__SinkStep__Group_2__2__Impl : ( ( rule__SinkStep__Group_2_2__0 )? ) ;
    public final void rule__SinkStep__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2270:1: ( ( ( rule__SinkStep__Group_2_2__0 )? ) )
            // InternalWorkflowDSL.g:2271:1: ( ( rule__SinkStep__Group_2_2__0 )? )
            {
            // InternalWorkflowDSL.g:2271:1: ( ( rule__SinkStep__Group_2_2__0 )? )
            // InternalWorkflowDSL.g:2272:2: ( rule__SinkStep__Group_2_2__0 )?
            {
             before(grammarAccess.getSinkStepAccess().getGroup_2_2()); 
            // InternalWorkflowDSL.g:2273:2: ( rule__SinkStep__Group_2_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalWorkflowDSL.g:2273:3: rule__SinkStep__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SinkStep__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSinkStepAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_2__2__Impl"


    // $ANTLR start "rule__SinkStep__Group_2__3"
    // InternalWorkflowDSL.g:2281:1: rule__SinkStep__Group_2__3 : rule__SinkStep__Group_2__3__Impl ;
    public final void rule__SinkStep__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2285:1: ( rule__SinkStep__Group_2__3__Impl )
            // InternalWorkflowDSL.g:2286:2: rule__SinkStep__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SinkStep__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_2__3"


    // $ANTLR start "rule__SinkStep__Group_2__3__Impl"
    // InternalWorkflowDSL.g:2292:1: rule__SinkStep__Group_2__3__Impl : ( ']' ) ;
    public final void rule__SinkStep__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2296:1: ( ( ']' ) )
            // InternalWorkflowDSL.g:2297:1: ( ']' )
            {
            // InternalWorkflowDSL.g:2297:1: ( ']' )
            // InternalWorkflowDSL.g:2298:2: ']'
            {
             before(grammarAccess.getSinkStepAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSinkStepAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_2__3__Impl"


    // $ANTLR start "rule__SinkStep__Group_2_2__0"
    // InternalWorkflowDSL.g:2308:1: rule__SinkStep__Group_2_2__0 : rule__SinkStep__Group_2_2__0__Impl rule__SinkStep__Group_2_2__1 ;
    public final void rule__SinkStep__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2312:1: ( rule__SinkStep__Group_2_2__0__Impl rule__SinkStep__Group_2_2__1 )
            // InternalWorkflowDSL.g:2313:2: rule__SinkStep__Group_2_2__0__Impl rule__SinkStep__Group_2_2__1
            {
            pushFollow(FOLLOW_10);
            rule__SinkStep__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SinkStep__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_2_2__0"


    // $ANTLR start "rule__SinkStep__Group_2_2__0__Impl"
    // InternalWorkflowDSL.g:2320:1: rule__SinkStep__Group_2_2__0__Impl : ( ( rule__SinkStep__ParamsAssignment_2_2_0 ) ) ;
    public final void rule__SinkStep__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2324:1: ( ( ( rule__SinkStep__ParamsAssignment_2_2_0 ) ) )
            // InternalWorkflowDSL.g:2325:1: ( ( rule__SinkStep__ParamsAssignment_2_2_0 ) )
            {
            // InternalWorkflowDSL.g:2325:1: ( ( rule__SinkStep__ParamsAssignment_2_2_0 ) )
            // InternalWorkflowDSL.g:2326:2: ( rule__SinkStep__ParamsAssignment_2_2_0 )
            {
             before(grammarAccess.getSinkStepAccess().getParamsAssignment_2_2_0()); 
            // InternalWorkflowDSL.g:2327:2: ( rule__SinkStep__ParamsAssignment_2_2_0 )
            // InternalWorkflowDSL.g:2327:3: rule__SinkStep__ParamsAssignment_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SinkStep__ParamsAssignment_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSinkStepAccess().getParamsAssignment_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_2_2__0__Impl"


    // $ANTLR start "rule__SinkStep__Group_2_2__1"
    // InternalWorkflowDSL.g:2335:1: rule__SinkStep__Group_2_2__1 : rule__SinkStep__Group_2_2__1__Impl ;
    public final void rule__SinkStep__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2339:1: ( rule__SinkStep__Group_2_2__1__Impl )
            // InternalWorkflowDSL.g:2340:2: rule__SinkStep__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SinkStep__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_2_2__1"


    // $ANTLR start "rule__SinkStep__Group_2_2__1__Impl"
    // InternalWorkflowDSL.g:2346:1: rule__SinkStep__Group_2_2__1__Impl : ( ( rule__SinkStep__Group_2_2_1__0 )* ) ;
    public final void rule__SinkStep__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2350:1: ( ( ( rule__SinkStep__Group_2_2_1__0 )* ) )
            // InternalWorkflowDSL.g:2351:1: ( ( rule__SinkStep__Group_2_2_1__0 )* )
            {
            // InternalWorkflowDSL.g:2351:1: ( ( rule__SinkStep__Group_2_2_1__0 )* )
            // InternalWorkflowDSL.g:2352:2: ( rule__SinkStep__Group_2_2_1__0 )*
            {
             before(grammarAccess.getSinkStepAccess().getGroup_2_2_1()); 
            // InternalWorkflowDSL.g:2353:2: ( rule__SinkStep__Group_2_2_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalWorkflowDSL.g:2353:3: rule__SinkStep__Group_2_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SinkStep__Group_2_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSinkStepAccess().getGroup_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_2_2__1__Impl"


    // $ANTLR start "rule__SinkStep__Group_2_2_1__0"
    // InternalWorkflowDSL.g:2362:1: rule__SinkStep__Group_2_2_1__0 : rule__SinkStep__Group_2_2_1__0__Impl rule__SinkStep__Group_2_2_1__1 ;
    public final void rule__SinkStep__Group_2_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2366:1: ( rule__SinkStep__Group_2_2_1__0__Impl rule__SinkStep__Group_2_2_1__1 )
            // InternalWorkflowDSL.g:2367:2: rule__SinkStep__Group_2_2_1__0__Impl rule__SinkStep__Group_2_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__SinkStep__Group_2_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SinkStep__Group_2_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_2_2_1__0"


    // $ANTLR start "rule__SinkStep__Group_2_2_1__0__Impl"
    // InternalWorkflowDSL.g:2374:1: rule__SinkStep__Group_2_2_1__0__Impl : ( ',' ) ;
    public final void rule__SinkStep__Group_2_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2378:1: ( ( ',' ) )
            // InternalWorkflowDSL.g:2379:1: ( ',' )
            {
            // InternalWorkflowDSL.g:2379:1: ( ',' )
            // InternalWorkflowDSL.g:2380:2: ','
            {
             before(grammarAccess.getSinkStepAccess().getCommaKeyword_2_2_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSinkStepAccess().getCommaKeyword_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_2_2_1__0__Impl"


    // $ANTLR start "rule__SinkStep__Group_2_2_1__1"
    // InternalWorkflowDSL.g:2389:1: rule__SinkStep__Group_2_2_1__1 : rule__SinkStep__Group_2_2_1__1__Impl ;
    public final void rule__SinkStep__Group_2_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2393:1: ( rule__SinkStep__Group_2_2_1__1__Impl )
            // InternalWorkflowDSL.g:2394:2: rule__SinkStep__Group_2_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SinkStep__Group_2_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_2_2_1__1"


    // $ANTLR start "rule__SinkStep__Group_2_2_1__1__Impl"
    // InternalWorkflowDSL.g:2400:1: rule__SinkStep__Group_2_2_1__1__Impl : ( ( rule__SinkStep__ParamsAssignment_2_2_1_1 ) ) ;
    public final void rule__SinkStep__Group_2_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2404:1: ( ( ( rule__SinkStep__ParamsAssignment_2_2_1_1 ) ) )
            // InternalWorkflowDSL.g:2405:1: ( ( rule__SinkStep__ParamsAssignment_2_2_1_1 ) )
            {
            // InternalWorkflowDSL.g:2405:1: ( ( rule__SinkStep__ParamsAssignment_2_2_1_1 ) )
            // InternalWorkflowDSL.g:2406:2: ( rule__SinkStep__ParamsAssignment_2_2_1_1 )
            {
             before(grammarAccess.getSinkStepAccess().getParamsAssignment_2_2_1_1()); 
            // InternalWorkflowDSL.g:2407:2: ( rule__SinkStep__ParamsAssignment_2_2_1_1 )
            // InternalWorkflowDSL.g:2407:3: rule__SinkStep__ParamsAssignment_2_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SinkStep__ParamsAssignment_2_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSinkStepAccess().getParamsAssignment_2_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_2_2_1__1__Impl"


    // $ANTLR start "rule__SinkStep__Group_3__0"
    // InternalWorkflowDSL.g:2416:1: rule__SinkStep__Group_3__0 : rule__SinkStep__Group_3__0__Impl rule__SinkStep__Group_3__1 ;
    public final void rule__SinkStep__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2420:1: ( rule__SinkStep__Group_3__0__Impl rule__SinkStep__Group_3__1 )
            // InternalWorkflowDSL.g:2421:2: rule__SinkStep__Group_3__0__Impl rule__SinkStep__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__SinkStep__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SinkStep__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_3__0"


    // $ANTLR start "rule__SinkStep__Group_3__0__Impl"
    // InternalWorkflowDSL.g:2428:1: rule__SinkStep__Group_3__0__Impl : ( 'readFrom:' ) ;
    public final void rule__SinkStep__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2432:1: ( ( 'readFrom:' ) )
            // InternalWorkflowDSL.g:2433:1: ( 'readFrom:' )
            {
            // InternalWorkflowDSL.g:2433:1: ( 'readFrom:' )
            // InternalWorkflowDSL.g:2434:2: 'readFrom:'
            {
             before(grammarAccess.getSinkStepAccess().getReadFromKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSinkStepAccess().getReadFromKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_3__0__Impl"


    // $ANTLR start "rule__SinkStep__Group_3__1"
    // InternalWorkflowDSL.g:2443:1: rule__SinkStep__Group_3__1 : rule__SinkStep__Group_3__1__Impl ;
    public final void rule__SinkStep__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2447:1: ( rule__SinkStep__Group_3__1__Impl )
            // InternalWorkflowDSL.g:2448:2: rule__SinkStep__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SinkStep__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_3__1"


    // $ANTLR start "rule__SinkStep__Group_3__1__Impl"
    // InternalWorkflowDSL.g:2454:1: rule__SinkStep__Group_3__1__Impl : ( ( rule__SinkStep__ReadFromAssignment_3_1 ) ) ;
    public final void rule__SinkStep__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2458:1: ( ( ( rule__SinkStep__ReadFromAssignment_3_1 ) ) )
            // InternalWorkflowDSL.g:2459:1: ( ( rule__SinkStep__ReadFromAssignment_3_1 ) )
            {
            // InternalWorkflowDSL.g:2459:1: ( ( rule__SinkStep__ReadFromAssignment_3_1 ) )
            // InternalWorkflowDSL.g:2460:2: ( rule__SinkStep__ReadFromAssignment_3_1 )
            {
             before(grammarAccess.getSinkStepAccess().getReadFromAssignment_3_1()); 
            // InternalWorkflowDSL.g:2461:2: ( rule__SinkStep__ReadFromAssignment_3_1 )
            // InternalWorkflowDSL.g:2461:3: rule__SinkStep__ReadFromAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SinkStep__ReadFromAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSinkStepAccess().getReadFromAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__Group_3__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalWorkflowDSL.g:2470:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2474:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalWorkflowDSL.g:2475:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalWorkflowDSL.g:2482:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2486:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalWorkflowDSL.g:2487:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalWorkflowDSL.g:2487:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalWorkflowDSL.g:2488:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalWorkflowDSL.g:2489:2: ( rule__Parameter__NameAssignment_0 )
            // InternalWorkflowDSL.g:2489:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalWorkflowDSL.g:2497:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2501:1: ( rule__Parameter__Group__1__Impl )
            // InternalWorkflowDSL.g:2502:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalWorkflowDSL.g:2508:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__Group_1__0 )? ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2512:1: ( ( ( rule__Parameter__Group_1__0 )? ) )
            // InternalWorkflowDSL.g:2513:1: ( ( rule__Parameter__Group_1__0 )? )
            {
            // InternalWorkflowDSL.g:2513:1: ( ( rule__Parameter__Group_1__0 )? )
            // InternalWorkflowDSL.g:2514:2: ( rule__Parameter__Group_1__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_1()); 
            // InternalWorkflowDSL.g:2515:2: ( rule__Parameter__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalWorkflowDSL.g:2515:3: rule__Parameter__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group_1__0"
    // InternalWorkflowDSL.g:2524:1: rule__Parameter__Group_1__0 : rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 ;
    public final void rule__Parameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2528:1: ( rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 )
            // InternalWorkflowDSL.g:2529:2: rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Parameter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1__0"


    // $ANTLR start "rule__Parameter__Group_1__0__Impl"
    // InternalWorkflowDSL.g:2536:1: rule__Parameter__Group_1__0__Impl : ( '=' ) ;
    public final void rule__Parameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2540:1: ( ( '=' ) )
            // InternalWorkflowDSL.g:2541:1: ( '=' )
            {
            // InternalWorkflowDSL.g:2541:1: ( '=' )
            // InternalWorkflowDSL.g:2542:2: '='
            {
             before(grammarAccess.getParameterAccess().getEqualsSignKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1__0__Impl"


    // $ANTLR start "rule__Parameter__Group_1__1"
    // InternalWorkflowDSL.g:2551:1: rule__Parameter__Group_1__1 : rule__Parameter__Group_1__1__Impl ;
    public final void rule__Parameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2555:1: ( rule__Parameter__Group_1__1__Impl )
            // InternalWorkflowDSL.g:2556:2: rule__Parameter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1__1"


    // $ANTLR start "rule__Parameter__Group_1__1__Impl"
    // InternalWorkflowDSL.g:2562:1: rule__Parameter__Group_1__1__Impl : ( ( rule__Parameter__ValueAssignment_1_1 ) ) ;
    public final void rule__Parameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2566:1: ( ( ( rule__Parameter__ValueAssignment_1_1 ) ) )
            // InternalWorkflowDSL.g:2567:1: ( ( rule__Parameter__ValueAssignment_1_1 ) )
            {
            // InternalWorkflowDSL.g:2567:1: ( ( rule__Parameter__ValueAssignment_1_1 ) )
            // InternalWorkflowDSL.g:2568:2: ( rule__Parameter__ValueAssignment_1_1 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_1_1()); 
            // InternalWorkflowDSL.g:2569:2: ( rule__Parameter__ValueAssignment_1_1 )
            // InternalWorkflowDSL.g:2569:3: rule__Parameter__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1__1__Impl"


    // $ANTLR start "rule__ParameterValueTypes__Group_0__0"
    // InternalWorkflowDSL.g:2578:1: rule__ParameterValueTypes__Group_0__0 : rule__ParameterValueTypes__Group_0__0__Impl rule__ParameterValueTypes__Group_0__1 ;
    public final void rule__ParameterValueTypes__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2582:1: ( rule__ParameterValueTypes__Group_0__0__Impl rule__ParameterValueTypes__Group_0__1 )
            // InternalWorkflowDSL.g:2583:2: rule__ParameterValueTypes__Group_0__0__Impl rule__ParameterValueTypes__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__ParameterValueTypes__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValueTypes__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Group_0__0"


    // $ANTLR start "rule__ParameterValueTypes__Group_0__0__Impl"
    // InternalWorkflowDSL.g:2590:1: rule__ParameterValueTypes__Group_0__0__Impl : ( () ) ;
    public final void rule__ParameterValueTypes__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2594:1: ( ( () ) )
            // InternalWorkflowDSL.g:2595:1: ( () )
            {
            // InternalWorkflowDSL.g:2595:1: ( () )
            // InternalWorkflowDSL.g:2596:2: ()
            {
             before(grammarAccess.getParameterValueTypesAccess().getStringTypeAction_0_0()); 
            // InternalWorkflowDSL.g:2597:2: ()
            // InternalWorkflowDSL.g:2597:3: 
            {
            }

             after(grammarAccess.getParameterValueTypesAccess().getStringTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Group_0__0__Impl"


    // $ANTLR start "rule__ParameterValueTypes__Group_0__1"
    // InternalWorkflowDSL.g:2605:1: rule__ParameterValueTypes__Group_0__1 : rule__ParameterValueTypes__Group_0__1__Impl ;
    public final void rule__ParameterValueTypes__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2609:1: ( rule__ParameterValueTypes__Group_0__1__Impl )
            // InternalWorkflowDSL.g:2610:2: rule__ParameterValueTypes__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValueTypes__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Group_0__1"


    // $ANTLR start "rule__ParameterValueTypes__Group_0__1__Impl"
    // InternalWorkflowDSL.g:2616:1: rule__ParameterValueTypes__Group_0__1__Impl : ( ( rule__ParameterValueTypes__ValueAssignment_0_1 ) ) ;
    public final void rule__ParameterValueTypes__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2620:1: ( ( ( rule__ParameterValueTypes__ValueAssignment_0_1 ) ) )
            // InternalWorkflowDSL.g:2621:1: ( ( rule__ParameterValueTypes__ValueAssignment_0_1 ) )
            {
            // InternalWorkflowDSL.g:2621:1: ( ( rule__ParameterValueTypes__ValueAssignment_0_1 ) )
            // InternalWorkflowDSL.g:2622:2: ( rule__ParameterValueTypes__ValueAssignment_0_1 )
            {
             before(grammarAccess.getParameterValueTypesAccess().getValueAssignment_0_1()); 
            // InternalWorkflowDSL.g:2623:2: ( rule__ParameterValueTypes__ValueAssignment_0_1 )
            // InternalWorkflowDSL.g:2623:3: rule__ParameterValueTypes__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValueTypes__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueTypesAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Group_0__1__Impl"


    // $ANTLR start "rule__ParameterValueTypes__Group_1__0"
    // InternalWorkflowDSL.g:2632:1: rule__ParameterValueTypes__Group_1__0 : rule__ParameterValueTypes__Group_1__0__Impl rule__ParameterValueTypes__Group_1__1 ;
    public final void rule__ParameterValueTypes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2636:1: ( rule__ParameterValueTypes__Group_1__0__Impl rule__ParameterValueTypes__Group_1__1 )
            // InternalWorkflowDSL.g:2637:2: rule__ParameterValueTypes__Group_1__0__Impl rule__ParameterValueTypes__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__ParameterValueTypes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValueTypes__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Group_1__0"


    // $ANTLR start "rule__ParameterValueTypes__Group_1__0__Impl"
    // InternalWorkflowDSL.g:2644:1: rule__ParameterValueTypes__Group_1__0__Impl : ( () ) ;
    public final void rule__ParameterValueTypes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2648:1: ( ( () ) )
            // InternalWorkflowDSL.g:2649:1: ( () )
            {
            // InternalWorkflowDSL.g:2649:1: ( () )
            // InternalWorkflowDSL.g:2650:2: ()
            {
             before(grammarAccess.getParameterValueTypesAccess().getIntTypeAction_1_0()); 
            // InternalWorkflowDSL.g:2651:2: ()
            // InternalWorkflowDSL.g:2651:3: 
            {
            }

             after(grammarAccess.getParameterValueTypesAccess().getIntTypeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Group_1__0__Impl"


    // $ANTLR start "rule__ParameterValueTypes__Group_1__1"
    // InternalWorkflowDSL.g:2659:1: rule__ParameterValueTypes__Group_1__1 : rule__ParameterValueTypes__Group_1__1__Impl ;
    public final void rule__ParameterValueTypes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2663:1: ( rule__ParameterValueTypes__Group_1__1__Impl )
            // InternalWorkflowDSL.g:2664:2: rule__ParameterValueTypes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValueTypes__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Group_1__1"


    // $ANTLR start "rule__ParameterValueTypes__Group_1__1__Impl"
    // InternalWorkflowDSL.g:2670:1: rule__ParameterValueTypes__Group_1__1__Impl : ( ( rule__ParameterValueTypes__ValueAssignment_1_1 ) ) ;
    public final void rule__ParameterValueTypes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2674:1: ( ( ( rule__ParameterValueTypes__ValueAssignment_1_1 ) ) )
            // InternalWorkflowDSL.g:2675:1: ( ( rule__ParameterValueTypes__ValueAssignment_1_1 ) )
            {
            // InternalWorkflowDSL.g:2675:1: ( ( rule__ParameterValueTypes__ValueAssignment_1_1 ) )
            // InternalWorkflowDSL.g:2676:2: ( rule__ParameterValueTypes__ValueAssignment_1_1 )
            {
             before(grammarAccess.getParameterValueTypesAccess().getValueAssignment_1_1()); 
            // InternalWorkflowDSL.g:2677:2: ( rule__ParameterValueTypes__ValueAssignment_1_1 )
            // InternalWorkflowDSL.g:2677:3: rule__ParameterValueTypes__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValueTypes__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueTypesAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Group_1__1__Impl"


    // $ANTLR start "rule__ParameterValueTypes__Group_2__0"
    // InternalWorkflowDSL.g:2686:1: rule__ParameterValueTypes__Group_2__0 : rule__ParameterValueTypes__Group_2__0__Impl rule__ParameterValueTypes__Group_2__1 ;
    public final void rule__ParameterValueTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2690:1: ( rule__ParameterValueTypes__Group_2__0__Impl rule__ParameterValueTypes__Group_2__1 )
            // InternalWorkflowDSL.g:2691:2: rule__ParameterValueTypes__Group_2__0__Impl rule__ParameterValueTypes__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__ParameterValueTypes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValueTypes__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Group_2__0"


    // $ANTLR start "rule__ParameterValueTypes__Group_2__0__Impl"
    // InternalWorkflowDSL.g:2698:1: rule__ParameterValueTypes__Group_2__0__Impl : ( () ) ;
    public final void rule__ParameterValueTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2702:1: ( ( () ) )
            // InternalWorkflowDSL.g:2703:1: ( () )
            {
            // InternalWorkflowDSL.g:2703:1: ( () )
            // InternalWorkflowDSL.g:2704:2: ()
            {
             before(grammarAccess.getParameterValueTypesAccess().getBoolTypeAction_2_0()); 
            // InternalWorkflowDSL.g:2705:2: ()
            // InternalWorkflowDSL.g:2705:3: 
            {
            }

             after(grammarAccess.getParameterValueTypesAccess().getBoolTypeAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterValueTypes__Group_2__1"
    // InternalWorkflowDSL.g:2713:1: rule__ParameterValueTypes__Group_2__1 : rule__ParameterValueTypes__Group_2__1__Impl ;
    public final void rule__ParameterValueTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2717:1: ( rule__ParameterValueTypes__Group_2__1__Impl )
            // InternalWorkflowDSL.g:2718:2: rule__ParameterValueTypes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValueTypes__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Group_2__1"


    // $ANTLR start "rule__ParameterValueTypes__Group_2__1__Impl"
    // InternalWorkflowDSL.g:2724:1: rule__ParameterValueTypes__Group_2__1__Impl : ( ( rule__ParameterValueTypes__ValueAssignment_2_1 ) ) ;
    public final void rule__ParameterValueTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2728:1: ( ( ( rule__ParameterValueTypes__ValueAssignment_2_1 ) ) )
            // InternalWorkflowDSL.g:2729:1: ( ( rule__ParameterValueTypes__ValueAssignment_2_1 ) )
            {
            // InternalWorkflowDSL.g:2729:1: ( ( rule__ParameterValueTypes__ValueAssignment_2_1 ) )
            // InternalWorkflowDSL.g:2730:2: ( rule__ParameterValueTypes__ValueAssignment_2_1 )
            {
             before(grammarAccess.getParameterValueTypesAccess().getValueAssignment_2_1()); 
            // InternalWorkflowDSL.g:2731:2: ( rule__ParameterValueTypes__ValueAssignment_2_1 )
            // InternalWorkflowDSL.g:2731:3: rule__ParameterValueTypes__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValueTypes__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueTypesAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterValueTypes__Group_3__0"
    // InternalWorkflowDSL.g:2740:1: rule__ParameterValueTypes__Group_3__0 : rule__ParameterValueTypes__Group_3__0__Impl rule__ParameterValueTypes__Group_3__1 ;
    public final void rule__ParameterValueTypes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2744:1: ( rule__ParameterValueTypes__Group_3__0__Impl rule__ParameterValueTypes__Group_3__1 )
            // InternalWorkflowDSL.g:2745:2: rule__ParameterValueTypes__Group_3__0__Impl rule__ParameterValueTypes__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__ParameterValueTypes__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValueTypes__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Group_3__0"


    // $ANTLR start "rule__ParameterValueTypes__Group_3__0__Impl"
    // InternalWorkflowDSL.g:2752:1: rule__ParameterValueTypes__Group_3__0__Impl : ( () ) ;
    public final void rule__ParameterValueTypes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2756:1: ( ( () ) )
            // InternalWorkflowDSL.g:2757:1: ( () )
            {
            // InternalWorkflowDSL.g:2757:1: ( () )
            // InternalWorkflowDSL.g:2758:2: ()
            {
             before(grammarAccess.getParameterValueTypesAccess().getIdentifierAction_3_0()); 
            // InternalWorkflowDSL.g:2759:2: ()
            // InternalWorkflowDSL.g:2759:3: 
            {
            }

             after(grammarAccess.getParameterValueTypesAccess().getIdentifierAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Group_3__0__Impl"


    // $ANTLR start "rule__ParameterValueTypes__Group_3__1"
    // InternalWorkflowDSL.g:2767:1: rule__ParameterValueTypes__Group_3__1 : rule__ParameterValueTypes__Group_3__1__Impl ;
    public final void rule__ParameterValueTypes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2771:1: ( rule__ParameterValueTypes__Group_3__1__Impl )
            // InternalWorkflowDSL.g:2772:2: rule__ParameterValueTypes__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValueTypes__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Group_3__1"


    // $ANTLR start "rule__ParameterValueTypes__Group_3__1__Impl"
    // InternalWorkflowDSL.g:2778:1: rule__ParameterValueTypes__Group_3__1__Impl : ( ( rule__ParameterValueTypes__ValueAssignment_3_1 ) ) ;
    public final void rule__ParameterValueTypes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2782:1: ( ( ( rule__ParameterValueTypes__ValueAssignment_3_1 ) ) )
            // InternalWorkflowDSL.g:2783:1: ( ( rule__ParameterValueTypes__ValueAssignment_3_1 ) )
            {
            // InternalWorkflowDSL.g:2783:1: ( ( rule__ParameterValueTypes__ValueAssignment_3_1 ) )
            // InternalWorkflowDSL.g:2784:2: ( rule__ParameterValueTypes__ValueAssignment_3_1 )
            {
             before(grammarAccess.getParameterValueTypesAccess().getValueAssignment_3_1()); 
            // InternalWorkflowDSL.g:2785:2: ( rule__ParameterValueTypes__ValueAssignment_3_1 )
            // InternalWorkflowDSL.g:2785:3: rule__ParameterValueTypes__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValueTypes__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueTypesAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__Group_3__1__Impl"


    // $ANTLR start "rule__WFModel__WorkflowAssignment"
    // InternalWorkflowDSL.g:2794:1: rule__WFModel__WorkflowAssignment : ( ruleWorkflow ) ;
    public final void rule__WFModel__WorkflowAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2798:1: ( ( ruleWorkflow ) )
            // InternalWorkflowDSL.g:2799:2: ( ruleWorkflow )
            {
            // InternalWorkflowDSL.g:2799:2: ( ruleWorkflow )
            // InternalWorkflowDSL.g:2800:3: ruleWorkflow
            {
             before(grammarAccess.getWFModelAccess().getWorkflowWorkflowParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkflow();

            state._fsp--;

             after(grammarAccess.getWFModelAccess().getWorkflowWorkflowParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WFModel__WorkflowAssignment"


    // $ANTLR start "rule__Workflow__NameAssignment_1"
    // InternalWorkflowDSL.g:2809:1: rule__Workflow__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Workflow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2813:1: ( ( RULE_ID ) )
            // InternalWorkflowDSL.g:2814:2: ( RULE_ID )
            {
            // InternalWorkflowDSL.g:2814:2: ( RULE_ID )
            // InternalWorkflowDSL.g:2815:3: RULE_ID
            {
             before(grammarAccess.getWorkflowAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__NameAssignment_1"


    // $ANTLR start "rule__Workflow__BaseAssignment_2_1"
    // InternalWorkflowDSL.g:2824:1: rule__Workflow__BaseAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Workflow__BaseAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2828:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDSL.g:2829:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDSL.g:2829:2: ( ( RULE_ID ) )
            // InternalWorkflowDSL.g:2830:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkflowAccess().getBaseWorkflowCrossReference_2_1_0()); 
            // InternalWorkflowDSL.g:2831:3: ( RULE_ID )
            // InternalWorkflowDSL.g:2832:4: RULE_ID
            {
             before(grammarAccess.getWorkflowAccess().getBaseWorkflowIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getBaseWorkflowIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getWorkflowAccess().getBaseWorkflowCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__BaseAssignment_2_1"


    // $ANTLR start "rule__Workflow__ParamsAssignment_4_2_0"
    // InternalWorkflowDSL.g:2843:1: rule__Workflow__ParamsAssignment_4_2_0 : ( ruleParameter ) ;
    public final void rule__Workflow__ParamsAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2847:1: ( ( ruleParameter ) )
            // InternalWorkflowDSL.g:2848:2: ( ruleParameter )
            {
            // InternalWorkflowDSL.g:2848:2: ( ruleParameter )
            // InternalWorkflowDSL.g:2849:3: ruleParameter
            {
             before(grammarAccess.getWorkflowAccess().getParamsParameterParserRuleCall_4_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getWorkflowAccess().getParamsParameterParserRuleCall_4_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__ParamsAssignment_4_2_0"


    // $ANTLR start "rule__Workflow__ParamsAssignment_4_2_1_1"
    // InternalWorkflowDSL.g:2858:1: rule__Workflow__ParamsAssignment_4_2_1_1 : ( ruleParameter ) ;
    public final void rule__Workflow__ParamsAssignment_4_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2862:1: ( ( ruleParameter ) )
            // InternalWorkflowDSL.g:2863:2: ( ruleParameter )
            {
            // InternalWorkflowDSL.g:2863:2: ( ruleParameter )
            // InternalWorkflowDSL.g:2864:3: ruleParameter
            {
             before(grammarAccess.getWorkflowAccess().getParamsParameterParserRuleCall_4_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getWorkflowAccess().getParamsParameterParserRuleCall_4_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__ParamsAssignment_4_2_1_1"


    // $ANTLR start "rule__Workflow__StepsAssignment_5_2"
    // InternalWorkflowDSL.g:2873:1: rule__Workflow__StepsAssignment_5_2 : ( ruleStep ) ;
    public final void rule__Workflow__StepsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2877:1: ( ( ruleStep ) )
            // InternalWorkflowDSL.g:2878:2: ( ruleStep )
            {
            // InternalWorkflowDSL.g:2878:2: ( ruleStep )
            // InternalWorkflowDSL.g:2879:3: ruleStep
            {
             before(grammarAccess.getWorkflowAccess().getStepsStepParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getWorkflowAccess().getStepsStepParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__StepsAssignment_5_2"


    // $ANTLR start "rule__Workflow__StepsAssignment_5_3_1"
    // InternalWorkflowDSL.g:2888:1: rule__Workflow__StepsAssignment_5_3_1 : ( ruleStep ) ;
    public final void rule__Workflow__StepsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2892:1: ( ( ruleStep ) )
            // InternalWorkflowDSL.g:2893:2: ( ruleStep )
            {
            // InternalWorkflowDSL.g:2893:2: ( ruleStep )
            // InternalWorkflowDSL.g:2894:3: ruleStep
            {
             before(grammarAccess.getWorkflowAccess().getStepsStepParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getWorkflowAccess().getStepsStepParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__StepsAssignment_5_3_1"


    // $ANTLR start "rule__SourceStep__NameAssignment_0"
    // InternalWorkflowDSL.g:2903:1: rule__SourceStep__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SourceStep__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2907:1: ( ( RULE_ID ) )
            // InternalWorkflowDSL.g:2908:2: ( RULE_ID )
            {
            // InternalWorkflowDSL.g:2908:2: ( RULE_ID )
            // InternalWorkflowDSL.g:2909:3: RULE_ID
            {
             before(grammarAccess.getSourceStepAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSourceStepAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__NameAssignment_0"


    // $ANTLR start "rule__SourceStep__RecurringAssignment_1_1"
    // InternalWorkflowDSL.g:2918:1: rule__SourceStep__RecurringAssignment_1_1 : ( RULE_BOOL_LITERAL ) ;
    public final void rule__SourceStep__RecurringAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2922:1: ( ( RULE_BOOL_LITERAL ) )
            // InternalWorkflowDSL.g:2923:2: ( RULE_BOOL_LITERAL )
            {
            // InternalWorkflowDSL.g:2923:2: ( RULE_BOOL_LITERAL )
            // InternalWorkflowDSL.g:2924:3: RULE_BOOL_LITERAL
            {
             before(grammarAccess.getSourceStepAccess().getRecurringBOOL_LITERALTerminalRuleCall_1_1_0()); 
            match(input,RULE_BOOL_LITERAL,FOLLOW_2); 
             after(grammarAccess.getSourceStepAccess().getRecurringBOOL_LITERALTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__RecurringAssignment_1_1"


    // $ANTLR start "rule__SourceStep__ParamsAssignment_2_2_0"
    // InternalWorkflowDSL.g:2933:1: rule__SourceStep__ParamsAssignment_2_2_0 : ( ruleParameter ) ;
    public final void rule__SourceStep__ParamsAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2937:1: ( ( ruleParameter ) )
            // InternalWorkflowDSL.g:2938:2: ( ruleParameter )
            {
            // InternalWorkflowDSL.g:2938:2: ( ruleParameter )
            // InternalWorkflowDSL.g:2939:3: ruleParameter
            {
             before(grammarAccess.getSourceStepAccess().getParamsParameterParserRuleCall_2_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getSourceStepAccess().getParamsParameterParserRuleCall_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__ParamsAssignment_2_2_0"


    // $ANTLR start "rule__SourceStep__ParamsAssignment_2_2_1_1"
    // InternalWorkflowDSL.g:2948:1: rule__SourceStep__ParamsAssignment_2_2_1_1 : ( ruleParameter ) ;
    public final void rule__SourceStep__ParamsAssignment_2_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2952:1: ( ( ruleParameter ) )
            // InternalWorkflowDSL.g:2953:2: ( ruleParameter )
            {
            // InternalWorkflowDSL.g:2953:2: ( ruleParameter )
            // InternalWorkflowDSL.g:2954:3: ruleParameter
            {
             before(grammarAccess.getSourceStepAccess().getParamsParameterParserRuleCall_2_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getSourceStepAccess().getParamsParameterParserRuleCall_2_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__ParamsAssignment_2_2_1_1"


    // $ANTLR start "rule__SourceStep__WriteToAssignment_3_1"
    // InternalWorkflowDSL.g:2963:1: rule__SourceStep__WriteToAssignment_3_1 : ( ruleMessageQueue ) ;
    public final void rule__SourceStep__WriteToAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2967:1: ( ( ruleMessageQueue ) )
            // InternalWorkflowDSL.g:2968:2: ( ruleMessageQueue )
            {
            // InternalWorkflowDSL.g:2968:2: ( ruleMessageQueue )
            // InternalWorkflowDSL.g:2969:3: ruleMessageQueue
            {
             before(grammarAccess.getSourceStepAccess().getWriteToMessageQueueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageQueue();

            state._fsp--;

             after(grammarAccess.getSourceStepAccess().getWriteToMessageQueueParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStep__WriteToAssignment_3_1"


    // $ANTLR start "rule__IntermediateStep__NameAssignment_0"
    // InternalWorkflowDSL.g:2978:1: rule__IntermediateStep__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IntermediateStep__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2982:1: ( ( RULE_ID ) )
            // InternalWorkflowDSL.g:2983:2: ( RULE_ID )
            {
            // InternalWorkflowDSL.g:2983:2: ( RULE_ID )
            // InternalWorkflowDSL.g:2984:3: RULE_ID
            {
             before(grammarAccess.getIntermediateStepAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntermediateStepAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__NameAssignment_0"


    // $ANTLR start "rule__IntermediateStep__RecurringAssignment_1_1"
    // InternalWorkflowDSL.g:2993:1: rule__IntermediateStep__RecurringAssignment_1_1 : ( RULE_BOOL_LITERAL ) ;
    public final void rule__IntermediateStep__RecurringAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:2997:1: ( ( RULE_BOOL_LITERAL ) )
            // InternalWorkflowDSL.g:2998:2: ( RULE_BOOL_LITERAL )
            {
            // InternalWorkflowDSL.g:2998:2: ( RULE_BOOL_LITERAL )
            // InternalWorkflowDSL.g:2999:3: RULE_BOOL_LITERAL
            {
             before(grammarAccess.getIntermediateStepAccess().getRecurringBOOL_LITERALTerminalRuleCall_1_1_0()); 
            match(input,RULE_BOOL_LITERAL,FOLLOW_2); 
             after(grammarAccess.getIntermediateStepAccess().getRecurringBOOL_LITERALTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__RecurringAssignment_1_1"


    // $ANTLR start "rule__IntermediateStep__ParamsAssignment_2_2_0"
    // InternalWorkflowDSL.g:3008:1: rule__IntermediateStep__ParamsAssignment_2_2_0 : ( ruleParameter ) ;
    public final void rule__IntermediateStep__ParamsAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:3012:1: ( ( ruleParameter ) )
            // InternalWorkflowDSL.g:3013:2: ( ruleParameter )
            {
            // InternalWorkflowDSL.g:3013:2: ( ruleParameter )
            // InternalWorkflowDSL.g:3014:3: ruleParameter
            {
             before(grammarAccess.getIntermediateStepAccess().getParamsParameterParserRuleCall_2_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getIntermediateStepAccess().getParamsParameterParserRuleCall_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__ParamsAssignment_2_2_0"


    // $ANTLR start "rule__IntermediateStep__ParamsAssignment_2_2_1_1"
    // InternalWorkflowDSL.g:3023:1: rule__IntermediateStep__ParamsAssignment_2_2_1_1 : ( ruleParameter ) ;
    public final void rule__IntermediateStep__ParamsAssignment_2_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:3027:1: ( ( ruleParameter ) )
            // InternalWorkflowDSL.g:3028:2: ( ruleParameter )
            {
            // InternalWorkflowDSL.g:3028:2: ( ruleParameter )
            // InternalWorkflowDSL.g:3029:3: ruleParameter
            {
             before(grammarAccess.getIntermediateStepAccess().getParamsParameterParserRuleCall_2_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getIntermediateStepAccess().getParamsParameterParserRuleCall_2_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__ParamsAssignment_2_2_1_1"


    // $ANTLR start "rule__IntermediateStep__ReadFromAssignment_3_1"
    // InternalWorkflowDSL.g:3038:1: rule__IntermediateStep__ReadFromAssignment_3_1 : ( ruleMessageQueue ) ;
    public final void rule__IntermediateStep__ReadFromAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:3042:1: ( ( ruleMessageQueue ) )
            // InternalWorkflowDSL.g:3043:2: ( ruleMessageQueue )
            {
            // InternalWorkflowDSL.g:3043:2: ( ruleMessageQueue )
            // InternalWorkflowDSL.g:3044:3: ruleMessageQueue
            {
             before(grammarAccess.getIntermediateStepAccess().getReadFromMessageQueueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageQueue();

            state._fsp--;

             after(grammarAccess.getIntermediateStepAccess().getReadFromMessageQueueParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__ReadFromAssignment_3_1"


    // $ANTLR start "rule__IntermediateStep__WriteToAssignment_4_1"
    // InternalWorkflowDSL.g:3053:1: rule__IntermediateStep__WriteToAssignment_4_1 : ( ruleMessageQueue ) ;
    public final void rule__IntermediateStep__WriteToAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:3057:1: ( ( ruleMessageQueue ) )
            // InternalWorkflowDSL.g:3058:2: ( ruleMessageQueue )
            {
            // InternalWorkflowDSL.g:3058:2: ( ruleMessageQueue )
            // InternalWorkflowDSL.g:3059:3: ruleMessageQueue
            {
             before(grammarAccess.getIntermediateStepAccess().getWriteToMessageQueueParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageQueue();

            state._fsp--;

             after(grammarAccess.getIntermediateStepAccess().getWriteToMessageQueueParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateStep__WriteToAssignment_4_1"


    // $ANTLR start "rule__SinkStep__NameAssignment_0"
    // InternalWorkflowDSL.g:3068:1: rule__SinkStep__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SinkStep__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:3072:1: ( ( RULE_ID ) )
            // InternalWorkflowDSL.g:3073:2: ( RULE_ID )
            {
            // InternalWorkflowDSL.g:3073:2: ( RULE_ID )
            // InternalWorkflowDSL.g:3074:3: RULE_ID
            {
             before(grammarAccess.getSinkStepAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSinkStepAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__NameAssignment_0"


    // $ANTLR start "rule__SinkStep__RecurringAssignment_1_1"
    // InternalWorkflowDSL.g:3083:1: rule__SinkStep__RecurringAssignment_1_1 : ( RULE_BOOL_LITERAL ) ;
    public final void rule__SinkStep__RecurringAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:3087:1: ( ( RULE_BOOL_LITERAL ) )
            // InternalWorkflowDSL.g:3088:2: ( RULE_BOOL_LITERAL )
            {
            // InternalWorkflowDSL.g:3088:2: ( RULE_BOOL_LITERAL )
            // InternalWorkflowDSL.g:3089:3: RULE_BOOL_LITERAL
            {
             before(grammarAccess.getSinkStepAccess().getRecurringBOOL_LITERALTerminalRuleCall_1_1_0()); 
            match(input,RULE_BOOL_LITERAL,FOLLOW_2); 
             after(grammarAccess.getSinkStepAccess().getRecurringBOOL_LITERALTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__RecurringAssignment_1_1"


    // $ANTLR start "rule__SinkStep__ParamsAssignment_2_2_0"
    // InternalWorkflowDSL.g:3098:1: rule__SinkStep__ParamsAssignment_2_2_0 : ( ruleParameter ) ;
    public final void rule__SinkStep__ParamsAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:3102:1: ( ( ruleParameter ) )
            // InternalWorkflowDSL.g:3103:2: ( ruleParameter )
            {
            // InternalWorkflowDSL.g:3103:2: ( ruleParameter )
            // InternalWorkflowDSL.g:3104:3: ruleParameter
            {
             before(grammarAccess.getSinkStepAccess().getParamsParameterParserRuleCall_2_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getSinkStepAccess().getParamsParameterParserRuleCall_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__ParamsAssignment_2_2_0"


    // $ANTLR start "rule__SinkStep__ParamsAssignment_2_2_1_1"
    // InternalWorkflowDSL.g:3113:1: rule__SinkStep__ParamsAssignment_2_2_1_1 : ( ruleParameter ) ;
    public final void rule__SinkStep__ParamsAssignment_2_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:3117:1: ( ( ruleParameter ) )
            // InternalWorkflowDSL.g:3118:2: ( ruleParameter )
            {
            // InternalWorkflowDSL.g:3118:2: ( ruleParameter )
            // InternalWorkflowDSL.g:3119:3: ruleParameter
            {
             before(grammarAccess.getSinkStepAccess().getParamsParameterParserRuleCall_2_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getSinkStepAccess().getParamsParameterParserRuleCall_2_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__ParamsAssignment_2_2_1_1"


    // $ANTLR start "rule__SinkStep__ReadFromAssignment_3_1"
    // InternalWorkflowDSL.g:3128:1: rule__SinkStep__ReadFromAssignment_3_1 : ( ruleMessageQueue ) ;
    public final void rule__SinkStep__ReadFromAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:3132:1: ( ( ruleMessageQueue ) )
            // InternalWorkflowDSL.g:3133:2: ( ruleMessageQueue )
            {
            // InternalWorkflowDSL.g:3133:2: ( ruleMessageQueue )
            // InternalWorkflowDSL.g:3134:3: ruleMessageQueue
            {
             before(grammarAccess.getSinkStepAccess().getReadFromMessageQueueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageQueue();

            state._fsp--;

             after(grammarAccess.getSinkStepAccess().getReadFromMessageQueueParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinkStep__ReadFromAssignment_3_1"


    // $ANTLR start "rule__MessageQueue__NameAssignment"
    // InternalWorkflowDSL.g:3143:1: rule__MessageQueue__NameAssignment : ( RULE_ID ) ;
    public final void rule__MessageQueue__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:3147:1: ( ( RULE_ID ) )
            // InternalWorkflowDSL.g:3148:2: ( RULE_ID )
            {
            // InternalWorkflowDSL.g:3148:2: ( RULE_ID )
            // InternalWorkflowDSL.g:3149:3: RULE_ID
            {
             before(grammarAccess.getMessageQueueAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageQueueAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQueue__NameAssignment"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalWorkflowDSL.g:3158:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:3162:1: ( ( RULE_ID ) )
            // InternalWorkflowDSL.g:3163:2: ( RULE_ID )
            {
            // InternalWorkflowDSL.g:3163:2: ( RULE_ID )
            // InternalWorkflowDSL.g:3164:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__ValueAssignment_1_1"
    // InternalWorkflowDSL.g:3173:1: rule__Parameter__ValueAssignment_1_1 : ( ruleParameterValueTypes ) ;
    public final void rule__Parameter__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:3177:1: ( ( ruleParameterValueTypes ) )
            // InternalWorkflowDSL.g:3178:2: ( ruleParameterValueTypes )
            {
            // InternalWorkflowDSL.g:3178:2: ( ruleParameterValueTypes )
            // InternalWorkflowDSL.g:3179:3: ruleParameterValueTypes
            {
             before(grammarAccess.getParameterAccess().getValueParameterValueTypesParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValueTypes();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueParameterValueTypesParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAssignment_1_1"


    // $ANTLR start "rule__ParameterValueTypes__ValueAssignment_0_1"
    // InternalWorkflowDSL.g:3188:1: rule__ParameterValueTypes__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__ParameterValueTypes__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:3192:1: ( ( RULE_STRING ) )
            // InternalWorkflowDSL.g:3193:2: ( RULE_STRING )
            {
            // InternalWorkflowDSL.g:3193:2: ( RULE_STRING )
            // InternalWorkflowDSL.g:3194:3: RULE_STRING
            {
             before(grammarAccess.getParameterValueTypesAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParameterValueTypesAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__ValueAssignment_0_1"


    // $ANTLR start "rule__ParameterValueTypes__ValueAssignment_1_1"
    // InternalWorkflowDSL.g:3203:1: rule__ParameterValueTypes__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__ParameterValueTypes__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:3207:1: ( ( RULE_INT ) )
            // InternalWorkflowDSL.g:3208:2: ( RULE_INT )
            {
            // InternalWorkflowDSL.g:3208:2: ( RULE_INT )
            // InternalWorkflowDSL.g:3209:3: RULE_INT
            {
             before(grammarAccess.getParameterValueTypesAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getParameterValueTypesAccess().getValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__ValueAssignment_1_1"


    // $ANTLR start "rule__ParameterValueTypes__ValueAssignment_2_1"
    // InternalWorkflowDSL.g:3218:1: rule__ParameterValueTypes__ValueAssignment_2_1 : ( RULE_BOOL_LITERAL ) ;
    public final void rule__ParameterValueTypes__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:3222:1: ( ( RULE_BOOL_LITERAL ) )
            // InternalWorkflowDSL.g:3223:2: ( RULE_BOOL_LITERAL )
            {
            // InternalWorkflowDSL.g:3223:2: ( RULE_BOOL_LITERAL )
            // InternalWorkflowDSL.g:3224:3: RULE_BOOL_LITERAL
            {
             before(grammarAccess.getParameterValueTypesAccess().getValueBOOL_LITERALTerminalRuleCall_2_1_0()); 
            match(input,RULE_BOOL_LITERAL,FOLLOW_2); 
             after(grammarAccess.getParameterValueTypesAccess().getValueBOOL_LITERALTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__ValueAssignment_2_1"


    // $ANTLR start "rule__ParameterValueTypes__ValueAssignment_3_1"
    // InternalWorkflowDSL.g:3233:1: rule__ParameterValueTypes__ValueAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__ParameterValueTypes__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDSL.g:3237:1: ( ( RULE_ID ) )
            // InternalWorkflowDSL.g:3238:2: ( RULE_ID )
            {
            // InternalWorkflowDSL.g:3238:2: ( RULE_ID )
            // InternalWorkflowDSL.g:3239:3: RULE_ID
            {
             before(grammarAccess.getParameterValueTypesAccess().getValueIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterValueTypesAccess().getValueIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValueTypes__ValueAssignment_3_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\20\1\5\1\21\1\4\1\20\1\4\1\16\1\22\1\27\2\uffff\2\4\5\22\1\4\4\22";
    static final String dfa_3s = "\1\15\1\uffff\1\27\1\5\1\21\1\4\1\27\1\22\1\26\1\30\1\27\2\uffff\1\7\1\4\4\23\1\30\1\7\4\23";
    static final String dfa_4s = "\1\uffff\1\1\11\uffff\1\3\1\2\14\uffff";
    static final String dfa_5s = "\31\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\10\uffff\1\1",
            "",
            "\1\4\4\uffff\1\3\1\uffff\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\4\6\uffff\1\5",
            "\1\11\15\uffff\1\12",
            "\1\13\7\uffff\1\14",
            "\1\12\1\16\4\uffff\1\15",
            "\1\5",
            "",
            "",
            "\1\22\1\21\1\17\1\20",
            "\1\23",
            "\1\12\1\16",
            "\1\12\1\16",
            "\1\12\1\16",
            "\1\12\1\16",
            "\1\12\1\16\4\uffff\1\24",
            "\1\30\1\27\1\25\1\26",
            "\1\12\1\16",
            "\1\12\1\16",
            "\1\12\1\16",
            "\1\12\1\16"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "277:1: rule__Step__Alternatives : ( ( ( rule__Step__Group_0__0 ) ) | ( ruleIntermediateStep ) | ( ( rule__Step__Group_2__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000610000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000A10000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});

}