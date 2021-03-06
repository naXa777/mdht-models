/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Test Organization</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization#validateStudyTestOrganizationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Test Organization Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization#validateStudyTestOrganizationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Test Organization Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization#validateStudyTestOrganizationRoleOfPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Test Organization Role Of Performer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudyTestOrganizationOperations extends org.eclipse.mdht.uml.cda.operations.Participant2Operations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyTestOrganizationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTestOrganizationTemplateId(StudyTestOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Test Organization Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTestOrganizationTemplateId(StudyTestOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TEST_ORGANIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.88')";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTestOrganizationTemplateId(StudyTestOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Test Organization Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTestOrganizationTemplateId(StudyTestOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_STUDY_TEST_ORGANIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTestOrganization The receiving '<em><b>Study Test Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTestOrganizationTemplateId(StudyTestOrganization studyTestOrganization, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_STUDY_TEST_ORGANIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TEST_ORGANIZATION);
			try {
				VALIDATE_STUDY_TEST_ORGANIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_STUDY_TEST_ORGANIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_STUDY_TEST_ORGANIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(studyTestOrganization)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TEST_ORGANIZATION__STUDY_TEST_ORGANIZATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTestOrganizationStudyTestOrganizationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTestOrganization, context) }),
						 new Object [] { studyTestOrganization }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTestOrganizationTypeCode(StudyTestOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Test Organization Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTestOrganizationTypeCode(StudyTestOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TEST_ORGANIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeCode=vocab::ParticipationType::AUT";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTestOrganizationTypeCode(StudyTestOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Test Organization Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTestOrganizationTypeCode(StudyTestOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_STUDY_TEST_ORGANIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTestOrganization The receiving '<em><b>Study Test Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTestOrganizationTypeCode(StudyTestOrganization studyTestOrganization, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_STUDY_TEST_ORGANIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TEST_ORGANIZATION);
			try {
				VALIDATE_STUDY_TEST_ORGANIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_STUDY_TEST_ORGANIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_STUDY_TEST_ORGANIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(studyTestOrganization)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TEST_ORGANIZATION__STUDY_TEST_ORGANIZATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTestOrganizationStudyTestOrganizationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTestOrganization, context) }),
						 new Object [] { studyTestOrganization }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyTestOrganizationRoleOfPerformer(StudyTestOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Test Organization Role Of Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTestOrganizationRoleOfPerformer(StudyTestOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_TEST_ORGANIZATION_ROLE_OF_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyTestOrganizationRoleOfPerformer(StudyTestOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Test Organization Role Of Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyTestOrganizationRoleOfPerformer(StudyTestOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_STUDY_TEST_ORGANIZATION_ROLE_OF_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param studyTestOrganization The receiving '<em><b>Study Test Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStudyTestOrganizationRoleOfPerformer(StudyTestOrganization studyTestOrganization, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_STUDY_TEST_ORGANIZATION_ROLE_OF_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.STUDY_TEST_ORGANIZATION);
			try {
				VALIDATE_STUDY_TEST_ORGANIZATION_ROLE_OF_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_STUDY_TEST_ORGANIZATION_ROLE_OF_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_STUDY_TEST_ORGANIZATION_ROLE_OF_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(studyTestOrganization)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.STUDY_TEST_ORGANIZATION__STUDY_TEST_ORGANIZATION_ROLE_OF_PERFORMER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudyTestOrganizationStudyTestOrganizationRoleOfPerformer", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studyTestOrganization, context) }),
						 new Object [] { studyTestOrganization }));
			}
			 
			return false;
		}
		return true;
	}

} // StudyTestOrganizationOperations