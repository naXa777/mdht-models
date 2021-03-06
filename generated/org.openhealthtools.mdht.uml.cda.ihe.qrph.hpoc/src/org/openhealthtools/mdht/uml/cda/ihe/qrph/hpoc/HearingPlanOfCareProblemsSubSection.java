/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hearing Plan Of Care Problems Sub Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage#getHearingPlanOfCareProblemsSubSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HearingPlanOfCareProblemsSubSectionTemplateId HearingPlanOfCareProblemsSubSectionCode HearingPlanOfCareProblemsSubSectionCodeP HearingPlanOfCareProblemsSubSectionText HearingPlanOfCareProblemsSubSectionTitle HearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern' templateId.root='1.3.6.1.4.1.19376.1.7.3.1.1.26.2.3.5' code.code='11450-4-HPOC' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='HPOC Problem List'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern constraints.validation.error='HearingPlanOfCareProblemsSubSectionEntryHpocProblemConcernAct'"
 * @generated
 */
public interface HearingPlanOfCareProblemsSubSection extends Section
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.7.3.1.1.26.2.3.5\')'"
	 * @generated
	 */
  boolean validateHearingPlanOfCareProblemsSubSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'11450-4-HPOC\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
  boolean validateHearingPlanOfCareProblemsSubSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
  boolean validateHearingPlanOfCareProblemsSubSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
	 * @generated
	 */
  boolean validateHearingPlanOfCareProblemsSubSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
	 * @generated
	 */
  boolean validateHearingPlanOfCareProblemsSubSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
  boolean validateHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern(DiagnosticChain diagnostics, Map<Object, Object> context);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearingPlanOfCareProblemsSubSection init();

		/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingPlanOfCareProblemsSubSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HearingPlanOfCareProblemsSubSection
