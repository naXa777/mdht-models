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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.MusculoskeletalSystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Musculoskeletal System Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MusculoskeletalSystemSection#validateMusculoskeletalSystemSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MusculoskeletalSystemSection#validateMusculoskeletalSystemSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MusculoskeletalSystemSection#validateMusculoskeletalSystemSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MusculoskeletalSystemSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MusculoskeletalSystemSectionOperations extends SectionOperations {
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
	protected MusculoskeletalSystemSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMusculoskeletalSystemSectionTemplateId(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMusculoskeletalSystemSectionTemplateId(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.9.34')";

	/**
	 * The cached OCL invariant for the '{@link #validateMusculoskeletalSystemSectionTemplateId(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMusculoskeletalSystemSectionTemplateId(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param musculoskeletalSystemSection The receiving '<em><b>Musculoskeletal System Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMusculoskeletalSystemSectionTemplateId(
			MusculoskeletalSystemSection musculoskeletalSystemSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.MUSCULOSKELETAL_SYSTEM_SECTION);
			try {
				VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				musculoskeletalSystemSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.MUSCULOSKELETAL_SYSTEM_SECTION__MUSCULOSKELETAL_SYSTEM_SECTION_TEMPLATE_ID,
						IHEPlugin.INSTANCE.getString(
							"MusculoskeletalSystemSectionMusculoskeletalSystemSectionTemplateId"),
						new Object[] { musculoskeletalSystemSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMusculoskeletalSystemSectionCode(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMusculoskeletalSystemSectionCode(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '11410-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMusculoskeletalSystemSectionCode(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMusculoskeletalSystemSectionCode(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param musculoskeletalSystemSection The receiving '<em><b>Musculoskeletal System Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMusculoskeletalSystemSectionCode(
			MusculoskeletalSystemSection musculoskeletalSystemSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.MUSCULOSKELETAL_SYSTEM_SECTION);
			try {
				VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				musculoskeletalSystemSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.MUSCULOSKELETAL_SYSTEM_SECTION__MUSCULOSKELETAL_SYSTEM_SECTION_CODE,
						IHEPlugin.INSTANCE.getString("MusculoskeletalSystemSectionMusculoskeletalSystemSectionCode"),
						new Object[] { musculoskeletalSystemSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMusculoskeletalSystemSectionProblemEntry(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Problem Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMusculoskeletalSystemSectionProblemEntry(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ihe::ProblemEntry))";

	/**
	 * The cached OCL invariant for the '{@link #validateMusculoskeletalSystemSectionProblemEntry(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Problem Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMusculoskeletalSystemSectionProblemEntry(MusculoskeletalSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param musculoskeletalSystemSection The receiving '<em><b>Musculoskeletal System Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMusculoskeletalSystemSectionProblemEntry(
			MusculoskeletalSystemSection musculoskeletalSystemSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.MUSCULOSKELETAL_SYSTEM_SECTION);
			try {
				VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				musculoskeletalSystemSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.MUSCULOSKELETAL_SYSTEM_SECTION__MUSCULOSKELETAL_SYSTEM_SECTION_PROBLEM_ENTRY,
						IHEPlugin.INSTANCE.getString(
							"MusculoskeletalSystemSectionMusculoskeletalSystemSectionProblemEntry"),
						new Object[] { musculoskeletalSystemSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemEntry(MusculoskeletalSystemSection) <em>Get Problem Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntry(MusculoskeletalSystemSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_ENTRY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemEntry))->asSequence()->any(true).oclAsType(ihe::ProblemEntry)";

	/**
	 * The cached OCL query for the '{@link #getProblemEntry(MusculoskeletalSystemSection) <em>Get Problem Entry</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntry(MusculoskeletalSystemSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_ENTRY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProblemEntry getProblemEntry(MusculoskeletalSystemSection musculoskeletalSystemSection) {

		if (GET_PROBLEM_ENTRY__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.MUSCULOSKELETAL_SYSTEM_SECTION,
				IHEPackage.Literals.MUSCULOSKELETAL_SYSTEM_SECTION.getEAllOperations().get(58));
			try {
				GET_PROBLEM_ENTRY__EOCL_QRY = helper.createQuery(GET_PROBLEM_ENTRY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROBLEM_ENTRY__EOCL_QRY);
		return (ProblemEntry) query.evaluate(musculoskeletalSystemSection);
	}

} // MusculoskeletalSystemSectionOperations
