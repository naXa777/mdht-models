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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry;
import org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coded Results Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#validateCodedResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#validateCodedResultsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#validateCodedResultsSectionProcedureEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Procedure Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#validateCodedResultsSectionExternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#validateCodedResultsSectionSimpleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Simple Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#getProcedureEntries() <em>Get Procedure Entries</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#getExternalReferences() <em>Get External References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#getSimpleObservations() <em>Get Simple Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodedResultsSectionOperations extends SectionOperations {
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
	protected CodedResultsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedResultsSectionTemplateId(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionTemplateId(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.28')";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedResultsSectionTemplateId(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionTemplateId(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codedResultsSection The receiving '<em><b>Coded Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodedResultsSectionTemplateId(CodedResultsSection codedResultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_RESULTS_SECTION);
			try {
				VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				codedResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_TEMPLATE_ID,
						IHEPlugin.INSTANCE.getString("CodedResultsSectionCodedResultsSectionTemplateId"),
						new Object[] { codedResultsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedResultsSectionCode(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionCode(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedResultsSectionCode(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionCode(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codedResultsSection The receiving '<em><b>Coded Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodedResultsSectionCode(CodedResultsSection codedResultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_RESULTS_SECTION);
			try {
				VALIDATE_CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(codedResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_CODE,
						IHEPlugin.INSTANCE.getString("CodedResultsSectionCodedResultsSectionCode"),
						new Object[] { codedResultsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedResultsSectionProcedureEntry(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Procedure Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionProcedureEntry(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_RESULTS_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(ihe::ProcedureEntry))";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedResultsSectionProcedureEntry(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Procedure Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionProcedureEntry(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CODED_RESULTS_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codedResultsSection The receiving '<em><b>Coded Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodedResultsSectionProcedureEntry(CodedResultsSection codedResultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CODED_RESULTS_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_RESULTS_SECTION);
			try {
				VALIDATE_CODED_RESULTS_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CODED_RESULTS_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CODED_RESULTS_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				codedResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_PROCEDURE_ENTRY,
						IHEPlugin.INSTANCE.getString("CodedResultsSectionCodedResultsSectionProcedureEntry"),
						new Object[] { codedResultsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedResultsSectionExternalReference(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section External Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionExternalReference(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ihe::ExternalReference))";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedResultsSectionExternalReference(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section External Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionExternalReference(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CODED_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codedResultsSection The receiving '<em><b>Coded Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodedResultsSectionExternalReference(CodedResultsSection codedResultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CODED_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_RESULTS_SECTION);
			try {
				VALIDATE_CODED_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CODED_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CODED_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				codedResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_EXTERNAL_REFERENCE,
						IHEPlugin.INSTANCE.getString("CodedResultsSectionCodedResultsSectionExternalReference"),
						new Object[] { codedResultsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedResultsSectionSimpleObservation(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Simple Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionSimpleObservation(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_RESULTS_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ihe::SimpleObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedResultsSectionSimpleObservation(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Simple Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionSimpleObservation(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CODED_RESULTS_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codedResultsSection The receiving '<em><b>Coded Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodedResultsSectionSimpleObservation(CodedResultsSection codedResultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CODED_RESULTS_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_RESULTS_SECTION);
			try {
				VALIDATE_CODED_RESULTS_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CODED_RESULTS_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CODED_RESULTS_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				codedResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_SIMPLE_OBSERVATION,
						IHEPlugin.INSTANCE.getString("CodedResultsSectionCodedResultsSectionSimpleObservation"),
						new Object[] { codedResultsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureEntries(CodedResultsSection) <em>Get Procedure Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEntries(CodedResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ENTRIES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(ihe::ProcedureEntry)).oclAsType(ihe::ProcedureEntry)";

	/**
	 * The cached OCL query for the '{@link #getProcedureEntries(CodedResultsSection) <em>Get Procedure Entries</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEntries(CodedResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ENTRIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<ProcedureEntry> getProcedureEntries(CodedResultsSection codedResultsSection) {

		if (GET_PROCEDURE_ENTRIES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.CODED_RESULTS_SECTION,
				IHEPackage.Literals.CODED_RESULTS_SECTION.getEAllOperations().get(60));
			try {
				GET_PROCEDURE_ENTRIES__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ENTRIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROCEDURE_ENTRIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureEntry> result = (Collection<ProcedureEntry>) query.evaluate(codedResultsSection);
		return new BasicEList.UnmodifiableEList<ProcedureEntry>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getExternalReferences(CodedResultsSection) <em>Get External References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences(CodedResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXTERNAL_REFERENCES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::ExternalReference)).oclAsType(ihe::ExternalReference)";

	/**
	 * The cached OCL query for the '{@link #getExternalReferences(CodedResultsSection) <em>Get External References</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences(CodedResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXTERNAL_REFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<ExternalReference> getExternalReferences(CodedResultsSection codedResultsSection) {

		if (GET_EXTERNAL_REFERENCES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.CODED_RESULTS_SECTION,
				IHEPackage.Literals.CODED_RESULTS_SECTION.getEAllOperations().get(61));
			try {
				GET_EXTERNAL_REFERENCES__EOCL_QRY = helper.createQuery(GET_EXTERNAL_REFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_EXTERNAL_REFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ExternalReference> result = (Collection<ExternalReference>) query.evaluate(codedResultsSection);
		return new BasicEList.UnmodifiableEList<ExternalReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSimpleObservations(CodedResultsSection) <em>Get Simple Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleObservations(CodedResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SIMPLE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::SimpleObservation)).oclAsType(ihe::SimpleObservation)";

	/**
	 * The cached OCL query for the '{@link #getSimpleObservations(CodedResultsSection) <em>Get Simple Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleObservations(CodedResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SIMPLE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<SimpleObservation> getSimpleObservations(CodedResultsSection codedResultsSection) {

		if (GET_SIMPLE_OBSERVATIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.CODED_RESULTS_SECTION,
				IHEPackage.Literals.CODED_RESULTS_SECTION.getEAllOperations().get(62));
			try {
				GET_SIMPLE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_SIMPLE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_SIMPLE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SimpleObservation> result = (Collection<SimpleObservation>) query.evaluate(codedResultsSection);
		return new BasicEList.UnmodifiableEList<SimpleObservation>(result.size(), result.toArray());
	}

} // CodedResultsSectionOperations
