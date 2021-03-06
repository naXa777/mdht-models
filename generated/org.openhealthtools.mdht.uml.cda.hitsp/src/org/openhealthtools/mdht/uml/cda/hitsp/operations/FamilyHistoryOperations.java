/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.operations.FamilyHistoryOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory#validateFamilyHistoryRelatedSubjectCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Related Subject Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory#validateFamilyHistoryHasSDTCid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Has SDT Cid</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory#validateFamilyHistoryHasFamilyName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Has Family Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory#validateFamilyHistoryHasGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Has Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory#validateFamilyHistoryFamilyMemberCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Family Member Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory#validateFamilyHistoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory#validateFamilyHistoryProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory#getProblemStatusObservations() <em>Get Problem Status Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryOperations extends FamilyHistoryOrganizerOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
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
	protected FamilyHistoryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryRelatedSubjectCodeValueSet(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Related Subject Code Value Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryRelatedSubjectCodeValueSet(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.code.codeSystem = '2.16.840.1.113883.5.111'";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryRelatedSubjectCodeValueSet(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Related Subject Code Value Set</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryRelatedSubjectCodeValueSet(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistory The receiving '<em><b>Family History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryRelatedSubjectCodeValueSet(FamilyHistory familyHistory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.FAMILY_HISTORY);
			try {
				VALIDATE_FAMILY_HISTORY_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.FAMILY_HISTORY__FAMILY_HISTORY_RELATED_SUBJECT_CODE_VALUE_SET,
						HITSPPlugin.INSTANCE.getString("FamilyHistoryFamilyHistoryRelatedSubjectCodeValueSet"),
						new Object[] { familyHistory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryHasSDTCid(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Has SDT Cid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryHasSDTCid(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_HAS_SDT_CID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.subject.sDTCId->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryHasSDTCid(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Has SDT Cid</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryHasSDTCid(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_HAS_SDT_CID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistory The receiving '<em><b>Family History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryHasSDTCid(FamilyHistory familyHistory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_HAS_SDT_CID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.FAMILY_HISTORY);
			try {
				VALIDATE_FAMILY_HISTORY_HAS_SDT_CID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FAMILY_HISTORY_HAS_SDT_CID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_HAS_SDT_CID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(familyHistory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.FAMILY_HISTORY__FAMILY_HISTORY_HAS_SDT_CID,
						HITSPPlugin.INSTANCE.getString("FamilyHistoryFamilyHistoryHasSDTCid"),
						new Object[] { familyHistory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryHasFamilyName(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Has Family Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryHasFamilyName(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_HAS_FAMILY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.subject.name->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryHasFamilyName(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Has Family Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryHasFamilyName(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_HAS_FAMILY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistory The receiving '<em><b>Family History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryHasFamilyName(FamilyHistory familyHistory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_HAS_FAMILY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.FAMILY_HISTORY);
			try {
				VALIDATE_FAMILY_HISTORY_HAS_FAMILY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FAMILY_HISTORY_HAS_FAMILY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_HAS_FAMILY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(familyHistory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.FAMILY_HISTORY__FAMILY_HISTORY_HAS_FAMILY_NAME,
						HITSPPlugin.INSTANCE.getString("FamilyHistoryFamilyHistoryHasFamilyName"),
						new Object[] { familyHistory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryHasGenderCode(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Has Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryHasGenderCode(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject.relatedSubject.subject.administrativeGenderCode.codeSystem = '2.16.840.1.113883.5.1' and (self.subject.relatedSubject.subject.administrativeGenderCode.code = 'F' or self.subject.relatedSubject.subject.administrativeGenderCode.code='M' or self.subject.relatedSubject.subject.administrativeGenderCode.code='UN')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryHasGenderCode(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Has Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryHasGenderCode(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistory The receiving '<em><b>Family History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryHasGenderCode(FamilyHistory familyHistory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.FAMILY_HISTORY);
			try {
				VALIDATE_FAMILY_HISTORY_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FAMILY_HISTORY_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(familyHistory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.FAMILY_HISTORY__FAMILY_HISTORY_HAS_GENDER_CODE,
						HITSPPlugin.INSTANCE.getString("FamilyHistoryFamilyHistoryHasGenderCode"),
						new Object[] { familyHistory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryFamilyMemberCondition(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Family Member Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryFamilyMemberCondition(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_FAMILY_MEMBER_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ihe::FamilyHistoryObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryFamilyMemberCondition(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Family Member Condition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryFamilyMemberCondition(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_FAMILY_MEMBER_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistory The receiving '<em><b>Family History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryFamilyMemberCondition(FamilyHistory familyHistory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_FAMILY_MEMBER_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.FAMILY_HISTORY);
			try {
				VALIDATE_FAMILY_HISTORY_FAMILY_MEMBER_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_FAMILY_MEMBER_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_FAMILY_MEMBER_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.FAMILY_HISTORY__FAMILY_HISTORY_FAMILY_MEMBER_CONDITION,
						HITSPPlugin.INSTANCE.getString("FamilyHistoryFamilyHistoryFamilyMemberCondition"),
						new Object[] { familyHistory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryTemplateId(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryTemplateId(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.18')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryTemplateId(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryTemplateId(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistory The receiving '<em><b>Family History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryTemplateId(FamilyHistory familyHistory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.FAMILY_HISTORY);
			try {
				VALIDATE_FAMILY_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FAMILY_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(familyHistory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.FAMILY_HISTORY__FAMILY_HISTORY_TEMPLATE_ID,
						HITSPPlugin.INSTANCE.getString("FamilyHistoryFamilyHistoryTemplateId"),
						new Object[] { familyHistory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryProblemStatusObservation(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryProblemStatusObservation(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(ihe::ProblemStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryProblemStatusObservation(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Problem Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryProblemStatusObservation(FamilyHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistory The receiving '<em><b>Family History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryProblemStatusObservation(FamilyHistory familyHistory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.FAMILY_HISTORY);
			try {
				VALIDATE_FAMILY_HISTORY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistory)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.FAMILY_HISTORY__FAMILY_HISTORY_PROBLEM_STATUS_OBSERVATION,
						HITSPPlugin.INSTANCE.getString("FamilyHistoryFamilyHistoryProblemStatusObservation"),
						new Object[] { familyHistory }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemStatusObservations(FamilyHistory) <em>Get Problem Status Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatusObservations(FamilyHistory)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_STATUS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemStatusObservation)).oclAsType(ihe::ProblemStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getProblemStatusObservations(FamilyHistory) <em>Get Problem Status Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatusObservations(FamilyHistory)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_STATUS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<ProblemStatusObservation> getProblemStatusObservations(FamilyHistory familyHistory) {

		if (GET_PROBLEM_STATUS_OBSERVATIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				HITSPPackage.Literals.FAMILY_HISTORY, HITSPPackage.Literals.FAMILY_HISTORY.getEAllOperations().get(83));
			try {
				GET_PROBLEM_STATUS_OBSERVATIONS__EOCL_QRY = helper.createQuery(
					GET_PROBLEM_STATUS_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROBLEM_STATUS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemStatusObservation> result = (Collection<ProblemStatusObservation>) query.evaluate(
			familyHistory);
		return new BasicEList.UnmodifiableEList<ProblemStatusObservation>(result.size(), result.toArray());
	}

} // FamilyHistoryOperations
