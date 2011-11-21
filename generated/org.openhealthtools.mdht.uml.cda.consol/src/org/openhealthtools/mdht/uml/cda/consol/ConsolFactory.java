/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage
 * @generated
 */
public interface ConsolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConsolFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.consol.impl.ConsolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints createGeneralHeaderConstraints();

	/**
	 * Returns a new object of class '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Drug Sensitivity</em>'.
	 * @generated
	 */
	AllergyDrugSensitivity createAllergyDrugSensitivity();

	/**
	 * Returns a new object of class '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Episode Observation</em>'.
	 * @generated
	 */
	EpisodeObservation createEpisodeObservation();

	/**
	 * Returns a new object of class '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Intolerance</em>'.
	 * @generated
	 */
	AllergyIntolerance createAllergyIntolerance();

	/**
	 * Returns a new object of class '<em>Problem Entry Reaction Observation Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Entry Reaction Observation Container</em>'.
	 * @generated
	 */
	ProblemEntryReactionObservationContainer createProblemEntryReactionObservationContainer();

	/**
	 * Returns a new object of class '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Age Observation</em>'.
	 * @generated
	 */
	AgeObservation createAgeObservation();

	/**
	 * Returns a new object of class '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Severity</em>'.
	 * @generated
	 */
	Severity createSeverity();

	/**
	 * Returns a new object of class '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Status Observation</em>'.
	 * @generated
	 */
	ProblemStatusObservation createProblemStatusObservation();

	/**
	 * Returns a new object of class '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Status Observation</em>'.
	 * @generated
	 */
	HealthStatusObservation createHealthStatusObservation();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication</em>'.
	 * @generated
	 */
	Medication createMedication();

	/**
	 * Returns a new object of class '<em>Medication Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Type</em>'.
	 * @generated
	 */
	MedicationType createMedicationType();

	/**
	 * Returns a new object of class '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Order Information</em>'.
	 * @generated
	 */
	MedicationOrderInformation createMedicationOrderInformation();

	/**
	 * Returns a new object of class '<em>Medication Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Status Observation</em>'.
	 * @generated
	 */
	MedicationStatusObservation createMedicationStatusObservation();

	/**
	 * Returns a new object of class '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Instance</em>'.
	 * @generated
	 */
	ProductInstance createProductInstance();

	/**
	 * Returns a new object of class '<em>Medication Fullfillment Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Fullfillment Instructions</em>'.
	 * @generated
	 */
	MedicationFullfillmentInstructions createMedicationFullfillmentInstructions();

	/**
	 * Returns a new object of class '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Series Number Observation</em>'.
	 * @generated
	 */
	MedicationSeriesNumberObservation createMedicationSeriesNumberObservation();

	/**
	 * Returns a new object of class '<em>Internal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Reference</em>'.
	 * @generated
	 */
	InternalReference createInternalReference();

	/**
	 * Returns a new object of class '<em>Patient Medical Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Medical Instructions</em>'.
	 * @generated
	 */
	PatientMedicalInstructions createPatientMedicalInstructions();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Summary</em>'.
	 * @generated
	 */
	PatientSummary createPatientSummary();

	/**
	 * Returns a new object of class '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directives Section</em>'.
	 * @generated
	 */
	AdvanceDirectivesSection createAdvanceDirectivesSection();

	/**
	 * Returns a new object of class '<em>Advance Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive</em>'.
	 * @generated
	 */
	AdvanceDirective createAdvanceDirective();

	/**
	 * Returns a new object of class '<em>Advance Directive Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive Status Observation</em>'.
	 * @generated
	 */
	AdvanceDirectiveStatusObservation createAdvanceDirectiveStatusObservation();

	/**
	 * Returns a new object of class '<em>Allergies Reactions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergies Reactions Section</em>'.
	 * @generated
	 */
	AllergiesReactionsSection createAllergiesReactionsSection();

	/**
	 * Returns a new object of class '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem List Section</em>'.
	 * @generated
	 */
	ProblemListSection createProblemListSection();

	/**
	 * Returns a new object of class '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounters Section</em>'.
	 * @generated
	 */
	EncountersSection createEncountersSection();

	/**
	 * Returns a new object of class '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter</em>'.
	 * @generated
	 */
	Encounter createEncounter();

	/**
	 * Returns a new object of class '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounters Activity</em>'.
	 * @generated
	 */
	EncountersActivity createEncountersActivity();

	/**
	 * Returns a new object of class '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunizations Section</em>'.
	 * @generated
	 */
	ImmunizationsSection createImmunizationsSection();

	/**
	 * Returns a new object of class '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization</em>'.
	 * @generated
	 */
	Immunization createImmunization();

	/**
	 * Returns a new object of class '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payers Section</em>'.
	 * @generated
	 */
	PayersSection createPayersSection();

	/**
	 * Returns a new object of class '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insurance Provider</em>'.
	 * @generated
	 */
	InsuranceProvider createInsuranceProvider();

	/**
	 * Returns a new object of class '<em>Payer Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payer Entry</em>'.
	 * @generated
	 */
	PayerEntry createPayerEntry();

	/**
	 * Returns a new object of class '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Section</em>'.
	 * @generated
	 */
	MedicationsSection createMedicationsSection();

	/**
	 * Returns a new object of class '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Section</em>'.
	 * @generated
	 */
	PlanOfCareSection createPlanOfCareSection();

	/**
	 * Returns a new object of class '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure</em>'.
	 * @generated
	 */
	Procedure createProcedure();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Act</em>'.
	 * @generated
	 */
	PlanOfCareActivityAct createPlanOfCareActivityAct();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Encounter</em>'.
	 * @generated
	 */
	PlanOfCareActivityEncounter createPlanOfCareActivityEncounter();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Observation</em>'.
	 * @generated
	 */
	PlanOfCareActivityObservation createPlanOfCareActivityObservation();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Procedure</em>'.
	 * @generated
	 */
	PlanOfCareActivityProcedure createPlanOfCareActivityProcedure();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Substance Administration</em>'.
	 * @generated
	 */
	PlanOfCareActivitySubstanceAdministration createPlanOfCareActivitySubstanceAdministration();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Supply</em>'.
	 * @generated
	 */
	PlanOfCareActivitySupply createPlanOfCareActivitySupply();

	/**
	 * Returns a new object of class '<em>Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pregnancy History Section</em>'.
	 * @generated
	 */
	PregnancyHistorySection createPregnancyHistorySection();

	/**
	 * Returns a new object of class '<em>Pregnancy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pregnancy Observation</em>'.
	 * @generated
	 */
	PregnancyObservation createPregnancyObservation();

	/**
	 * Returns a new object of class '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surgeries Section</em>'.
	 * @generated
	 */
	SurgeriesSection createSurgeriesSection();

	/**
	 * Returns a new object of class '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reference</em>'.
	 * @generated
	 */
	ExternalReference createExternalReference();

	/**
	 * Returns a new object of class '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * @generated
	 */
	ProcedureEntryProcedureActivityProcedure createProcedureEntryProcedureActivityProcedure();

	/**
	 * Returns a new object of class '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Section</em>'.
	 * @generated
	 */
	VitalSignsSection createVitalSignsSection();

	/**
	 * Returns a new object of class '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Organizer</em>'.
	 * @generated
	 */
	VitalSignsOrganizer createVitalSignsOrganizer();

	/**
	 * Returns a new object of class '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Sign</em>'.
	 * @generated
	 */
	VitalSign createVitalSign();

	/**
	 * Returns a new object of class '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Results Section</em>'.
	 * @generated
	 */
	DiagnosticResultsSection createDiagnosticResultsSection();

	/**
	 * Returns a new object of class '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result</em>'.
	 * @generated
	 */
	Result createResult();

	/**
	 * Returns a new object of class '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Organizer</em>'.
	 * @generated
	 */
	ResultOrganizer createResultOrganizer();

	/**
	 * Returns a new object of class '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Section</em>'.
	 * @generated
	 */
	FamilyHistorySection createFamilyHistorySection();

	/**
	 * Returns a new object of class '<em>Family History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History</em>'.
	 * @generated
	 */
	FamilyHistory createFamilyHistory();

	/**
	 * Returns a new object of class '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Observation</em>'.
	 * @generated
	 */
	FamilyHistoryObservation createFamilyHistoryObservation();

	/**
	 * Returns a new object of class '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Section</em>'.
	 * @generated
	 */
	SocialHistorySection createSocialHistorySection();

	/**
	 * Returns a new object of class '<em>Social History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History</em>'.
	 * @generated
	 */
	SocialHistory createSocialHistory();

	/**
	 * Returns a new object of class '<em>Social History Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Status Observation</em>'.
	 * @generated
	 */
	SocialHistoryStatusObservation createSocialHistoryStatusObservation();

	/**
	 * Returns a new object of class '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Results Section</em>'.
	 * @generated
	 */
	ResultsSection createResultsSection();

	/**
	 * Returns a new object of class '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medical Equipment Section</em>'.
	 * @generated
	 */
	MedicalEquipmentSection createMedicalEquipmentSection();

	/**
	 * Returns a new object of class '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Status Section</em>'.
	 * @generated
	 */
	FunctionalStatusSection createFunctionalStatusSection();

	/**
	 * Returns a new object of class '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purpose Section</em>'.
	 * @generated
	 */
	PurposeSection createPurposeSection();

	/**
	 * Returns a new object of class '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purpose Activity</em>'.
	 * @generated
	 */
	PurposeActivity createPurposeActivity();

	/**
	 * Returns a new object of class '<em>Advance Directive Verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive Verification</em>'.
	 * @generated
	 */
	AdvanceDirectiveVerification createAdvanceDirectiveVerification();

	/**
	 * Returns a new object of class '<em>Advance Directive Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive Reference</em>'.
	 * @generated
	 */
	AdvanceDirectiveReference createAdvanceDirectiveReference();

	/**
	 * Returns a new object of class '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Location</em>'.
	 * @generated
	 */
	EncounterLocation createEncounterLocation();

	/**
	 * Returns a new object of class '<em>Payer Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payer Entity</em>'.
	 * @generated
	 */
	PayerEntity createPayerEntity();

	/**
	 * Returns a new object of class '<em>Covered Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Covered Party</em>'.
	 * @generated
	 */
	CoveredParty createCoveredParty();

	/**
	 * Returns a new object of class '<em>Policy Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Subscriber</em>'.
	 * @generated
	 */
	PolicySubscriber createPolicySubscriber();

	/**
	 * Returns a new object of class '<em>Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Support</em>'.
	 * @generated
	 */
	Support createSupport();

	/**
	 * Returns a new object of class '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Of Past Illness Section</em>'.
	 * @generated
	 */
	HistoryOfPastIllnessSection createHistoryOfPastIllnessSection();

	/**
	 * Returns a new object of class '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chief Complaint Section</em>'.
	 * @generated
	 */
	ChiefComplaintSection createChiefComplaintSection();

	/**
	 * Returns a new object of class '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reason For Referral Section</em>'.
	 * @generated
	 */
	ReasonForReferralSection createReasonForReferralSection();

	/**
	 * Returns a new object of class '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Of Present Illness</em>'.
	 * @generated
	 */
	HistoryOfPresentIllness createHistoryOfPresentIllness();

	/**
	 * Returns a new object of class '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Admission Diagnosis Section</em>'.
	 * @generated
	 */
	HospitalAdmissionDiagnosisSection createHospitalAdmissionDiagnosisSection();

	/**
	 * Returns a new object of class '<em>Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Diagnosis Section</em>'.
	 * @generated
	 */
	DischargeDiagnosisSection createDischargeDiagnosisSection();

	/**
	 * Returns a new object of class '<em>Admission Medication History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admission Medication History Section</em>'.
	 * @generated
	 */
	AdmissionMedicationHistorySection createAdmissionMedicationHistorySection();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Medications Section</em>'.
	 * @generated
	 */
	HospitalDischargeMedicationsSection createHospitalDischargeMedicationsSection();

	/**
	 * Returns a new object of class '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Administered Section</em>'.
	 * @generated
	 */
	MedicationsAdministeredSection createMedicationsAdministeredSection();

	/**
	 * Returns a new object of class '<em>Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Exam Section</em>'.
	 * @generated
	 */
	PhysicalExamSection createPhysicalExamSection();

	/**
	 * Returns a new object of class '<em>General Appearance Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Appearance Section</em>'.
	 * @generated
	 */
	GeneralAppearanceSection createGeneralAppearanceSection();

	/**
	 * Returns a new object of class '<em>Visible Implanted Medical Devices Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visible Implanted Medical Devices Section</em>'.
	 * @generated
	 */
	VisibleImplantedMedicalDevicesSection createVisibleImplantedMedicalDevicesSection();

	/**
	 * Returns a new object of class '<em>Integumentary System Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integumentary System Section</em>'.
	 * @generated
	 */
	IntegumentarySystemSection createIntegumentarySystemSection();

	/**
	 * Returns a new object of class '<em>Head Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Head Section</em>'.
	 * @generated
	 */
	HeadSection createHeadSection();

	/**
	 * Returns a new object of class '<em>Eyes Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eyes Section</em>'.
	 * @generated
	 */
	EyesSection createEyesSection();

	/**
	 * Returns a new object of class '<em>Ears Nose Mouth Throat Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ears Nose Mouth Throat Section</em>'.
	 * @generated
	 */
	EarsNoseMouthThroatSection createEarsNoseMouthThroatSection();

	/**
	 * Returns a new object of class '<em>Ears Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ears Section</em>'.
	 * @generated
	 */
	EarsSection createEarsSection();

	/**
	 * Returns a new object of class '<em>Nose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nose Section</em>'.
	 * @generated
	 */
	NoseSection createNoseSection();

	/**
	 * Returns a new object of class '<em>Mouth Throat Teeth Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mouth Throat Teeth Section</em>'.
	 * @generated
	 */
	MouthThroatTeethSection createMouthThroatTeethSection();

	/**
	 * Returns a new object of class '<em>Neck Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neck Section</em>'.
	 * @generated
	 */
	NeckSection createNeckSection();

	/**
	 * Returns a new object of class '<em>Endocrine System Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endocrine System Section</em>'.
	 * @generated
	 */
	EndocrineSystemSection createEndocrineSystemSection();

	/**
	 * Returns a new object of class '<em>Thorax Lungs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thorax Lungs Section</em>'.
	 * @generated
	 */
	ThoraxLungsSection createThoraxLungsSection();

	/**
	 * Returns a new object of class '<em>Chest Wall Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chest Wall Section</em>'.
	 * @generated
	 */
	ChestWallSection createChestWallSection();

	/**
	 * Returns a new object of class '<em>Breast Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Breast Section</em>'.
	 * @generated
	 */
	BreastSection createBreastSection();

	/**
	 * Returns a new object of class '<em>Heart Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heart Section</em>'.
	 * @generated
	 */
	HeartSection createHeartSection();

	/**
	 * Returns a new object of class '<em>Respiratory System Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Respiratory System Section</em>'.
	 * @generated
	 */
	RespiratorySystemSection createRespiratorySystemSection();

	/**
	 * Returns a new object of class '<em>Abdomen Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abdomen Section</em>'.
	 * @generated
	 */
	AbdomenSection createAbdomenSection();

	/**
	 * Returns a new object of class '<em>Lymphatic Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lymphatic Section</em>'.
	 * @generated
	 */
	LymphaticSection createLymphaticSection();

	/**
	 * Returns a new object of class '<em>Vessels Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vessels Section</em>'.
	 * @generated
	 */
	VesselsSection createVesselsSection();

	/**
	 * Returns a new object of class '<em>Musculoskeletal System Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Musculoskeletal System Section</em>'.
	 * @generated
	 */
	MusculoskeletalSystemSection createMusculoskeletalSystemSection();

	/**
	 * Returns a new object of class '<em>Neurologic System Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neurologic System Section</em>'.
	 * @generated
	 */
	NeurologicSystemSection createNeurologicSystemSection();

	/**
	 * Returns a new object of class '<em>Genitalia Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Genitalia Section</em>'.
	 * @generated
	 */
	GenitaliaSection createGenitaliaSection();

	/**
	 * Returns a new object of class '<em>Rectum Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectum Section</em>'.
	 * @generated
	 */
	RectumSection createRectumSection();

	/**
	 * Returns a new object of class '<em>Extremities Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extremities Section</em>'.
	 * @generated
	 */
	ExtremitiesSection createExtremitiesSection();

	/**
	 * Returns a new object of class '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Review Of Systems Section</em>'.
	 * @generated
	 */
	ReviewOfSystemsSection createReviewOfSystemsSection();

	/**
	 * Returns a new object of class '<em>Hospital Course Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Course Section</em>'.
	 * @generated
	 */
	HospitalCourseSection createHospitalCourseSection();

	/**
	 * Returns a new object of class '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment And Plan Section</em>'.
	 * @generated
	 */
	AssessmentAndPlanSection createAssessmentAndPlanSection();

	/**
	 * Returns a new object of class '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Entry</em>'.
	 * @generated
	 */
	ConditionEntry createConditionEntry();

	/**
	 * Returns a new object of class '<em>Cause Of Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cause Of Death Observation</em>'.
	 * @generated
	 */
	CauseOfDeathObservation createCauseOfDeathObservation();

	/**
	 * Returns a new object of class '<em>Language Spoken</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Spoken</em>'.
	 * @generated
	 */
	LanguageSpoken createLanguageSpoken();

	/**
	 * Returns a new object of class '<em>Healthcare Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthcare Provider</em>'.
	 * @generated
	 */
	HealthcareProvider createHealthcareProvider();

	/**
	 * Returns a new object of class '<em>Medication Normal Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Normal Dose</em>'.
	 * @generated
	 */
	MedicationNormalDose createMedicationNormalDose();

	/**
	 * Returns a new object of class '<em>Medication Split Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Split Dose</em>'.
	 * @generated
	 */
	MedicationSplitDose createMedicationSplitDose();

	/**
	 * Returns a new object of class '<em>Medication Tapered Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Tapered Dose</em>'.
	 * @generated
	 */
	MedicationTaperedDose createMedicationTaperedDose();

	/**
	 * Returns a new object of class '<em>Medication Conditional Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Conditional Dose</em>'.
	 * @generated
	 */
	MedicationConditionalDose createMedicationConditionalDose();

	/**
	 * Returns a new object of class '<em>Medication Combination Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Combination Medication</em>'.
	 * @generated
	 */
	MedicationCombinationMedication createMedicationCombinationMedication();

	/**
	 * Returns a new object of class '<em>Support Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Support Guardian</em>'.
	 * @generated
	 */
	SupportGuardian createSupportGuardian();

	/**
	 * Returns a new object of class '<em>Support Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Support Participant</em>'.
	 * @generated
	 */
	SupportParticipant createSupportParticipant();

	/**
	 * Returns a new object of class '<em>Unstructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unstructured Document</em>'.
	 * @generated
	 */
	UnstructuredDocument createUnstructuredDocument();

	/**
	 * Returns a new object of class '<em>Scan Original Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scan Original Author</em>'.
	 * @generated
	 */
	ScanOriginalAuthor createScanOriginalAuthor();

	/**
	 * Returns a new object of class '<em>Scanning Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scanning Device</em>'.
	 * @generated
	 */
	ScanningDevice createScanningDevice();

	/**
	 * Returns a new object of class '<em>Scan Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scan Data Enterer</em>'.
	 * @generated
	 */
	ScanDataEnterer createScanDataEnterer();

	/**
	 * Returns a new object of class '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Information</em>'.
	 * @generated
	 */
	MedicationInformation createMedicationInformation();

	/**
	 * Returns a new object of class '<em>Unstructured Or Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unstructured Or Scanned Document</em>'.
	 * @generated
	 */
	UnstructuredOrScannedDocument createUnstructuredOrScannedDocument();

	/**
	 * Returns a new object of class '<em>Referral Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referral Summary</em>'.
	 * @generated
	 */
	ReferralSummary createReferralSummary();

	/**
	 * Returns a new object of class '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Summary</em>'.
	 * @generated
	 */
	DischargeSummary createDischargeSummary();

	/**
	 * Returns a new object of class '<em>Discharge Diet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Diet</em>'.
	 * @generated
	 */
	DischargeDiet createDischargeDiet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConsolPackage getConsolPackage();

} //ConsolFactory
