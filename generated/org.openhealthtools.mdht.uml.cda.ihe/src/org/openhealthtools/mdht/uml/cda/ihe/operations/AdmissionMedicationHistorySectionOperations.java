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
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Admission Medication History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection#validateAdmissionMedicationHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection#validateAdmissionMedicationHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication History Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdmissionMedicationHistorySectionOperations extends SectionOperations {
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
	protected AdmissionMedicationHistorySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdmissionMedicationHistorySectionTemplateId(AdmissionMedicationHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdmissionMedicationHistorySectionTemplateId(AdmissionMedicationHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.20')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdmissionMedicationHistorySectionTemplateId(AdmissionMedicationHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdmissionMedicationHistorySectionTemplateId(AdmissionMedicationHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param admissionMedicationHistorySection The receiving '<em><b>Admission Medication History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdmissionMedicationHistorySectionTemplateId(
			AdmissionMedicationHistorySection admissionMedicationHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.ADMISSION_MEDICATION_HISTORY_SECTION);
			try {
				VALIDATE_ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				admissionMedicationHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.ADMISSION_MEDICATION_HISTORY_SECTION__ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID,
						IHEPlugin.INSTANCE.getString(
							"AdmissionMedicationHistorySectionAdmissionMedicationHistorySectionTemplateId"),
						new Object[] { admissionMedicationHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdmissionMedicationHistorySectionCode(AdmissionMedicationHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication History Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdmissionMedicationHistorySectionCode(AdmissionMedicationHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADMISSION_MEDICATION_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '42346-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdmissionMedicationHistorySectionCode(AdmissionMedicationHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication History Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdmissionMedicationHistorySectionCode(AdmissionMedicationHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_ADMISSION_MEDICATION_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param admissionMedicationHistorySection The receiving '<em><b>Admission Medication History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdmissionMedicationHistorySectionCode(
			AdmissionMedicationHistorySection admissionMedicationHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADMISSION_MEDICATION_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.ADMISSION_MEDICATION_HISTORY_SECTION);
			try {
				VALIDATE_ADMISSION_MEDICATION_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADMISSION_MEDICATION_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADMISSION_MEDICATION_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				admissionMedicationHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.ADMISSION_MEDICATION_HISTORY_SECTION__ADMISSION_MEDICATION_HISTORY_SECTION_CODE,
						IHEPlugin.INSTANCE.getString(
							"AdmissionMedicationHistorySectionAdmissionMedicationHistorySectionCode"),
						new Object[] { admissionMedicationHistorySection }));
			}

			return false;
		}
		return true;
	}

} // AdmissionMedicationHistorySectionOperations
