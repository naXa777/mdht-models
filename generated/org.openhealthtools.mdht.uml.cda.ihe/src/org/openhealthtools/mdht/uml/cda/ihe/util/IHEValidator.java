/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.ihe.*;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.ihe.CarePlanSection;
import org.openhealthtools.mdht.uml.cda.ihe.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.CombinationMedication;
import org.openhealthtools.mdht.uml.cda.ihe.Comment;
import org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ConditionalDose;
import org.openhealthtools.mdht.uml.cda.ihe.CoverageEntry;
import org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterActivity;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterPlanOfCare;
import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.HealthcareProvidersPharmacies;
import org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.IHERegistryDelegate;
import org.openhealthtools.mdht.uml.cda.ihe.Immunization;
import org.openhealthtools.mdht.uml.cda.ihe.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IntakeOutputSection;
import org.openhealthtools.mdht.uml.cda.ihe.InternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDevicesSection;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDocument;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalSummary;
import org.openhealthtools.mdht.uml.cda.ihe.Medication;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.NormalDose;
import org.openhealthtools.mdht.uml.cda.ihe.ObservationRequestEntry;
import org.openhealthtools.mdht.uml.cda.ihe.PHRExtract;
import org.openhealthtools.mdht.uml.cda.ihe.PHRUpdate;
import org.openhealthtools.mdht.uml.cda.ihe.PatientContact;
import org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian;
import org.openhealthtools.mdht.uml.cda.ihe.PatientContactParticipant;
import org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.ihe.PayerEntry;
import org.openhealthtools.mdht.uml.cda.ihe.PayersSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamNarrativeSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.PregnancyHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryPlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.ProductEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.ihe.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ScanDataEnterer;
import org.openhealthtools.mdht.uml.cda.ihe.ScanOriginalAuthor;
import org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument;
import org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice;
import org.openhealthtools.mdht.uml.cda.ihe.Severity;
import org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation;
import org.openhealthtools.mdht.uml.cda.ihe.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.SplitDose;
import org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry;
import org.openhealthtools.mdht.uml.cda.ihe.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.TaperedDose;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage
 * @generated
 */
public class IHEValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final IHEValidator INSTANCE = new IHEValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.ihe";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Immunizations Section Template Id' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IHE_IMMUNIZATIONS_SECTION_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Immunizations Section Immunization' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IHE_IMMUNIZATIONS_SECTION_IMMUNIZATION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunization Comments' of 'Immunization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATION__IMMUNIZATION_COMMENTS = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunization Template Id' of 'Immunization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATION__IMMUNIZATION_TEMPLATE_ID = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunization Code' of 'Immunization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATION__IMMUNIZATION_CODE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunization Status Code' of 'Immunization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATION__IMMUNIZATION_STATUS_CODE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunization Mood Code' of 'Immunization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATION__IMMUNIZATION_MOOD_CODE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunization Effective Time' of 'Immunization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATION__IMMUNIZATION_EFFECTIVE_TIME = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Administered Section Template Id' of 'Medications Administered Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_ADMINISTERED_SECTION__MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Administered Section Code' of 'Medications Administered Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_ADMINISTERED_SECTION__MEDICATIONS_ADMINISTERED_SECTION_CODE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Concern Entry Effective Time Low High' of 'Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONCERN_ENTRY__CONCERN_ENTRY_EFFECTIVE_TIME_LOW_HIGH = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Concern Entry Has Related Observations' of 'Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONCERN_ENTRY__CONCERN_ENTRY_HAS_RELATED_OBSERVATIONS = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Concern Entry Related Observations Type Code' of 'Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONCERN_ENTRY__CONCERN_ENTRY_RELATED_OBSERVATIONS_TYPE_CODE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Concern Entry Template Id' of 'Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONCERN_ENTRY__CONCERN_ENTRY_TEMPLATE_ID = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Concern Entry Effective Time' of 'Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONCERN_ENTRY__CONCERN_ENTRY_EFFECTIVE_TIME = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Document Template Id' of 'Medical Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_DOCUMENT__MEDICAL_DOCUMENT_TEMPLATE_ID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Active Problems Section Template Id' of 'Active Problems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVE_PROBLEMS_SECTION__ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Active Problems Section Problem Concern Entry' of 'Active Problems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVE_PROBLEMS_SECTION__ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Concern Entry Template Id' of 'Problem Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_CONCERN_ENTRY__PROBLEM_CONCERN_ENTRY_TEMPLATE_ID = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Concern Entry Problem Entry' of 'Problem Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_CONCERN_ENTRY__PROBLEM_CONCERN_ENTRY_PROBLEM_ENTRY = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Has Text Reference' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_HAS_TEXT_REFERENCE = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Comment Inversion Ind' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_COMMENT_INVERSION_IND = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Template Id' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_TEMPLATE_ID = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Code' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_CODE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Effective Time' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_EFFECTIVE_TIME = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Id' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_ID = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Text' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_TEXT = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Value' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_VALUE = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Severity' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_SEVERITY = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Problem Status Observation' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_PROBLEM_STATUS_OBSERVATION = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Health Status Observation' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_HEALTH_STATUS_OBSERVATION = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Comment' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_COMMENT = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Has Text Reference' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_HAS_TEXT_REFERENCE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Template Id' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_TEMPLATE_ID = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Text' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_TEXT = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Observation Value' of 'Severity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY__SEVERITY_OBSERVATION_VALUE = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Problem Status Observation Has Text Reference' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__IHE_PROBLEM_STATUS_OBSERVATION_HAS_TEXT_REFERENCE = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Problem Status Observation Template Id' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__IHE_PROBLEM_STATUS_OBSERVATION_TEMPLATE_ID = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Problem Status Observation Text' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__IHE_PROBLEM_STATUS_OBSERVATION_TEXT = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Value' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__STATUS_OBSERVATION_VALUE = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Health Status Observation Has Text Reference' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Health Status Observation Template Id' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_TEMPLATE_ID = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Health Status Observation Text' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__HEALTH_STATUS_OBSERVATION_TEXT = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Value' of 'Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_STATUS_OBSERVATION__STATUS_OBSERVATION_VALUE = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Comment Has Text Reference' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__IHE_COMMENT_HAS_TEXT_REFERENCE = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Comment Effective Time When Author Present' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__IHE_COMMENT_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Comment Has Author Id' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__IHE_COMMENT_HAS_AUTHOR_ID = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Comment Has Author Organization' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__IHE_COMMENT_HAS_AUTHOR_ORGANIZATION = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Comment Status Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__IHE_COMMENT_STATUS_CODE = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Comment Text' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__IHE_COMMENT_TEXT = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Template Id' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_TEMPLATE_ID = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Has Dosing' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_HAS_DOSING = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Dosing Relationship' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_DOSING_RELATIONSHIP = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Has Description No Med Not Known' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_HAS_DESCRIPTION_NO_MED_NOT_KNOWN = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Reason Class Mood' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_REASON_CLASS_MOOD = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Has Product Entry' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_HAS_PRODUCT_ENTRY = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Has Intructions Inversion' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_HAS_INTRUCTIONS_INVERSION = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Product Strength' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_PRODUCT_STRENGTH = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Product Name' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_PRODUCT_NAME = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Precondition Reference' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_PRECONDITION_REFERENCE = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Has Supply Entry Inversion' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_HAS_SUPPLY_ENTRY_INVERSION = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Has Fill Number' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_HAS_FILL_NUMBER = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Template Id' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_TEMPLATE_ID = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Approach Site Code' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_APPROACH_SITE_CODE = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Dose Quantity' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_DOSE_QUANTITY = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Rate Quantity' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_RATE_QUANTITY = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Code' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_CODE = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Status Code' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_STATUS_CODE = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Effective Time' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_EFFECTIVE_TIME = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Internal Reference Template Id' of 'Internal Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_REFERENCE__INTERNAL_REFERENCE_TEMPLATE_ID = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Internal Reference Code' of 'Internal Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_REFERENCE__INTERNAL_REFERENCE_CODE = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Internal Reference Id' of 'Internal Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_REFERENCE__INTERNAL_REFERENCE_ID = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Medical Instructions Template Id' of 'Patient Medical Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Medical Instructions Class Code' of 'Patient Medical Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Medical Instructions Code' of 'Patient Medical Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_CODE = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Medical Instructions Status Code' of 'Patient Medical Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Medical Instructions Text' of 'Patient Medical Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_MEDICAL_INSTRUCTIONS__PATIENT_MEDICAL_INSTRUCTIONS_TEXT = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Entry Template Id' of 'Supply Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ENTRY__SUPPLY_ENTRY_TEMPLATE_ID = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Entry Quantity' of 'Supply Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ENTRY__SUPPLY_ENTRY_QUANTITY = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Entry Repeat Number' of 'Supply Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ENTRY__SUPPLY_ENTRY_REPEAT_NUMBER = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Fullfillment Instructions Template Id' of 'Medication Fullfillment Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_FULLFILLMENT_INSTRUCTIONS__MEDICATION_FULLFILLMENT_INSTRUCTIONS_TEMPLATE_ID = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Fullfillment Instructions Code' of 'Medication Fullfillment Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_FULLFILLMENT_INSTRUCTIONS__MEDICATION_FULLFILLMENT_INSTRUCTIONS_CODE = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Fullfillment Instructions Status Code' of 'Medication Fullfillment Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_FULLFILLMENT_INSTRUCTIONS__MEDICATION_FULLFILLMENT_INSTRUCTIONS_STATUS_CODE = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Fullfillment Instructions Text' of 'Medication Fullfillment Instructions'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_FULLFILLMENT_INSTRUCTIONS__MEDICATION_FULLFILLMENT_INSTRUCTIONS_TEXT = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Medications Section Template Id' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__IHE_MEDICATIONS_SECTION_TEMPLATE_ID = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Medications Section Medication' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__IHE_MEDICATIONS_SECTION_MEDICATION = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Intolerance Concern Template Id' of 'Allergy Intolerance Concern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_INTOLERANCE_CONCERN__ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Intolerance Concern Allergy Intolerance' of 'Allergy Intolerance Concern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_INTOLERANCE_CONCERN__ALLERGY_INTOLERANCE_CONCERN_ALLERGY_INTOLERANCE = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Intolerance Template Id' of 'Allergy Intolerance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_TEMPLATE_ID = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Intolerance Value' of 'Allergy Intolerance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_VALUE = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Intolerance Problem Entry Reaction Observation Container' of 'Allergy Intolerance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Intolerance Severity' of 'Allergy Intolerance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_SEVERITY = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Intolerance Problem Status Observation' of 'Allergy Intolerance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Intolerance Comment' of 'Allergy Intolerance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_COMMENT = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Code' of 'Allergy Intolerance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_INTOLERANCE__PROBLEM_ENTRY_CODE = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergies Reactions Section Template Id' of 'Allergies Reactions Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGIES_REACTIONS_SECTION__ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergies Reactions Section Allergy Intolerance Concern' of 'Allergies Reactions Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGIES_REACTIONS_SECTION__ALLERGIES_REACTIONS_SECTION_ALLERGY_INTOLERANCE_CONCERN = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Normal Dose No Subordinate Substance Administration' of 'Normal Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NORMAL_DOSE__NORMAL_DOSE_NO_SUBORDINATE_SUBSTANCE_ADMINISTRATION = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Normal Dose Template Id' of 'Normal Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NORMAL_DOSE__NORMAL_DOSE_TEMPLATE_ID = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tapered Dose Tapered Dosing Substance Administration' of 'Tapered Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TAPERED_DOSE__TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tapered Dose Template Id' of 'Tapered Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TAPERED_DOSE__TAPERED_DOSE_TEMPLATE_ID = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Split Dose Split Dosing Substance Administration' of 'Split Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SPLIT_DOSE__SPLIT_DOSE_SPLIT_DOSING_SUBSTANCE_ADMINISTRATION = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Split Dose Template Id' of 'Split Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SPLIT_DOSE__SPLIT_DOSE_TEMPLATE_ID = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Conditional Dose Conditional Dosing Substance Administration' of 'Conditional Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITIONAL_DOSE__CONDITIONAL_DOSE_CONDITIONAL_DOSING_SUBSTANCE_ADMINISTRATION = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Conditional Dose Template Id' of 'Conditional Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITIONAL_DOSE__CONDITIONAL_DOSE_TEMPLATE_ID = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Combination Medication Substance Administration' of 'Combination Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMBINATION_MEDICATION__COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Combination Medication Template Id' of 'Combination Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMBINATION_MEDICATION__COMBINATION_MEDICATION_TEMPLATE_ID = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Vital Signs Section Template Id' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__IHE_VITAL_SIGNS_SECTION_TEMPLATE_ID = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Vital Signs Section Template Id' of 'Coded Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_VITAL_SIGNS_SECTION__CODED_VITAL_SIGNS_SECTION_TEMPLATE_ID = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Vital Signs Section Vital Signs Organizer' of 'Coded Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_VITAL_SIGNS_SECTION__CODED_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Vital Signs Organizer Require Results Organizer Template ID' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Vital Signs Organizer Template Id' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Vital Signs Organizer Class Code' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_CLASS_CODE = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Vital Signs Organizer Effective Time' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Vital Signs Organizer Id' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_ID = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Vital Signs Organizer Vital Sign Observation' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Code' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__RESULT_ORGANIZER_CODE = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Status Code' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__RESULT_ORGANIZER_STATUS_CODE = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Observation Template Id' of 'Vital Sign Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN_OBSERVATION__VITAL_SIGN_OBSERVATION_TEMPLATE_ID = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Observation Interpretation Code' of 'Vital Sign Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN_OBSERVATION__VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Observation Method Code' of 'Vital Sign Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN_OBSERVATION__VITAL_SIGN_OBSERVATION_METHOD_CODE = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Observation Target Site Code' of 'Vital Sign Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN_OBSERVATION__VITAL_SIGN_OBSERVATION_TARGET_SITE_CODE = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Observation Value' of 'Vital Sign Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN_OBSERVATION__VITAL_SIGN_OBSERVATION_VALUE = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code' of 'Vital Sign Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN_OBSERVATION__RESULT_OBSERVATION_CODE = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Simple Observation Template Id' of 'Simple Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIMPLE_OBSERVATION__SIMPLE_OBSERVATION_TEMPLATE_ID = 125;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Simple Observation Id' of 'Simple Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIMPLE_OBSERVATION__SIMPLE_OBSERVATION_ID = 126;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Simple Observation Status Code' of 'Simple Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIMPLE_OBSERVATION__SIMPLE_OBSERVATION_STATUS_CODE = 127;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Payers Section Template Id' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__IHE_PAYERS_SECTION_TEMPLATE_ID = 128;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Payers Section Coverage Entry' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__IHE_PAYERS_SECTION_COVERAGE_ENTRY = 129;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Entry Template Id' of 'Coverage Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ENTRY__COVERAGE_ENTRY_TEMPLATE_ID = 130;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History Of Past Illness Section Template Id' of 'History Of Past Illness Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PAST_ILLNESS_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID = 131;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History Of Past Illness Section Code' of 'History Of Past Illness Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PAST_ILLNESS_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_CODE = 132;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chief Complaint Section Template Id' of 'Chief Complaint Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_TEMPLATE_ID = 133;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chief Complaint Section Code' of 'Chief Complaint Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_CODE = 134;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Referral Section Template Id' of 'Reason For Referral Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID = 135;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Referral Section Code' of 'Reason For Referral Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_CODE = 136;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History Of Present Illness Template Id' of 'History Of Present Illness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PRESENT_ILLNESS__HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID = 137;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History Of Present Illness Code' of 'History Of Present Illness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PRESENT_ILLNESS__HISTORY_OF_PRESENT_ILLNESS_CODE = 138;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Surgeries Section Template Id' of 'Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SURGERIES_SECTION__SURGERIES_SECTION_TEMPLATE_ID = 139;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Surgeries Section Template Id' of 'Coded Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_SURGERIES_SECTION__CODED_SURGERIES_SECTION_TEMPLATE_ID = 140;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Surgeries Section External Reference' of 'Coded Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_SURGERIES_SECTION__CODED_SURGERIES_SECTION_EXTERNAL_REFERENCE = 141;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Surgeries Section Procedure Entry Procedure Activity Procedure' of 'Coded Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_SURGERIES_SECTION__CODED_SURGERIES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE = 142;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Reference Has No Code' of 'External Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_HAS_NO_CODE = 143;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Reference Has Reference' of 'External Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_HAS_REFERENCE = 144;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Reference Has Reference External Document' of 'External Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT = 145;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Reference Has Reference External Document ID' of 'External Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_ID = 146;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Reference Has Reference External Document Text' of 'External Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_TEXT = 147;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Reference Template Id' of 'External Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_TEMPLATE_ID = 148;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Reference Class Code' of 'External Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_CLASS_CODE = 149;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Reference Mood Code' of 'External Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_MOOD_CODE = 150;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Reference Id' of 'External Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_ID = 151;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Reference Text' of 'External Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_TEXT = 152;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Entry Procedure Activity Procedure Mood Code' of 'Procedure Entry Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE = 153;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Entry Procedure Activity Procedure Has Text Reference' of 'Procedure Entry Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE = 154;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Entry Procedure Activity Procedure Priority Code' of 'Procedure Entry Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PRIORITY_CODE = 155;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Entry Procedure Activity Procedure Has Inversion Ind For Encounter' of 'Procedure Entry Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_INVERSION_IND_FOR_ENCOUNTER = 156;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Entry Procedure Activity Procedure Template Id' of 'Procedure Entry Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID = 157;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Entry Procedure Activity Procedure Class Code' of 'Procedure Entry Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE = 158;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Entry Procedure Activity Procedure Text' of 'Procedure Entry Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT = 159;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Entry Procedure Activity Procedure Approach Site Code' of 'Procedure Entry Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE = 160;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Entry Procedure Activity Procedure Internal Reference' of 'Procedure Entry Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE = 161;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Entry Procedure Activity Procedure Internal Reference Reason' of 'Procedure Entry Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON = 162;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Admission Diagnosis Section Template Id' of 'Hospital Admission Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID = 163;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Admission Diagnosis Section Code' of 'Hospital Admission Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE = 164;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Diagnosis Section Template Id' of 'Discharge Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_DIAGNOSIS_SECTION__DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID = 165;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Diagnosis Section Code' of 'Discharge Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_DIAGNOSIS_SECTION__DISCHARGE_DIAGNOSIS_SECTION_CODE = 166;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Admission Medication History Section Template Id' of 'Admission Medication History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADMISSION_MEDICATION_HISTORY_SECTION__ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID = 167;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Admission Medication History Section Code' of 'Admission Medication History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADMISSION_MEDICATION_HISTORY_SECTION__ADMISSION_MEDICATION_HISTORY_SECTION_CODE = 168;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Discharge Medications Section Template Id' of 'Hospital Discharge Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID = 169;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Discharge Medications Section Code' of 'Hospital Discharge Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE = 170;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Advance Directives Section Template Id' of 'Coded Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_ADVANCE_DIRECTIVES_SECTION__CODED_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID = 171;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Advance Directives Section Template Id' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__IHE_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID = 172;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Physical Exam Narrative Section Template Id' of 'Physical Exam Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYSICAL_EXAM_NARRATIVE_SECTION__PHYSICAL_EXAM_NARRATIVE_SECTION_TEMPLATE_ID = 173;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Physical Exam Narrative Section Code' of 'Physical Exam Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYSICAL_EXAM_NARRATIVE_SECTION__PHYSICAL_EXAM_NARRATIVE_SECTION_CODE = 174;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Physical Exam Section Template Id' of 'Physical Exam Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_TEMPLATE_ID = 175;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Review Of Systems Section Template Id' of 'Review Of Systems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REVIEW_OF_SYSTEMS_SECTION__REVIEW_OF_SYSTEMS_SECTION_TEMPLATE_ID = 176;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Review Of Systems Section Code' of 'Review Of Systems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REVIEW_OF_SYSTEMS_SECTION__REVIEW_OF_SYSTEMS_SECTION_CODE = 177;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Course Section Template Id' of 'Hospital Course Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_COURSE_SECTION__HOSPITAL_COURSE_SECTION_TEMPLATE_ID = 178;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Course Section Code' of 'Hospital Course Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_COURSE_SECTION__HOSPITAL_COURSE_SECTION_CODE = 179;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Results Section Template Id' of 'Coded Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_TEMPLATE_ID = 180;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Results Section Code' of 'Coded Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_CODE = 181;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Results Section External Reference' of 'Coded Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_EXTERNAL_REFERENCE = 182;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Results Section Simple Observation' of 'Coded Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_SIMPLE_OBSERVATION = 183;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment And Plan Section Template Id' of 'Assessment And Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 184;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment And Plan Section Code' of 'Assessment And Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_CODE = 185;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Care Plan Section Template Id' of 'Care Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CARE_PLAN_SECTION__CARE_PLAN_SECTION_TEMPLATE_ID = 186;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family Medical History Section Template Id' of 'Family Medical History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_MEDICAL_HISTORY_SECTION__FAMILY_MEDICAL_HISTORY_SECTION_TEMPLATE_ID = 187;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Social History Section Template Id' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__IHE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 188;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter History Section Template Id' of 'Encounter History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_HISTORY_SECTION__ENCOUNTER_HISTORY_SECTION_TEMPLATE_ID = 189;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter History Section Encounter Entry' of 'Encounter History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_HISTORY_SECTION__ENCOUNTER_HISTORY_SECTION_ENCOUNTER_ENTRY = 190;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Entry Template Id' of 'Encounter Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_ENTRY__ENCOUNTER_ENTRY_TEMPLATE_ID = 191;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Entry Class Code' of 'Encounter Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_ENTRY__ENCOUNTER_ENTRY_CLASS_CODE = 192;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Entry Code' of 'Encounter Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_ENTRY__ENCOUNTER_ENTRY_CODE = 193;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Entry Id' of 'Encounter Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_ENTRY__ENCOUNTER_ENTRY_ID = 194;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Entry Text' of 'Encounter Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_ENTRY__ENCOUNTER_ENTRY_TEXT = 195;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Devices Section Template Id' of 'Medical Devices Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_DEVICES_SECTION__MEDICAL_DEVICES_SECTION_TEMPLATE_ID = 196;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Language Communication Template Id' of 'Language Communication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANGUAGE_COMMUNICATION__IHE_LANGUAGE_COMMUNICATION_TEMPLATE_ID = 197;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Summary Problem Concern Entry' of 'Medical Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_SUMMARY__MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY = 198;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Summary Allergy Concern Entry' of 'Medical Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_SUMMARY__MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY = 199;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Summary Medications' of 'Medical Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_SUMMARY__MEDICAL_SUMMARY_MEDICATIONS = 200;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Summary Template Id' of 'Medical Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_SUMMARY__MEDICAL_SUMMARY_TEMPLATE_ID = 201;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Code' of 'Medical Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_SUMMARY__GENERAL_HEADER_CONSTRAINTS_CODE = 202;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Template Id' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_TEMPLATE_ID = 203;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Active Problems Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ACTIVE_PROBLEMS_SECTION = 204;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Code' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__GENERAL_HEADER_CONSTRAINTS_CODE = 205;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Healthcare Providers Pharmacies Template Id' of 'Healthcare Providers Pharmacies'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTHCARE_PROVIDERS_PHARMACIES__HEALTHCARE_PROVIDERS_PHARMACIES_TEMPLATE_ID = 206;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Observation Request Entry Template Id' of 'Observation Request Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBSERVATION_REQUEST_ENTRY__OBSERVATION_REQUEST_ENTRY_TEMPLATE_ID = 207;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Entry Template Id' of 'Product Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT_ENTRY__PRODUCT_ENTRY_TEMPLATE_ID = 208;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Entry Plan Of Care Activity Procedure Template Id' of 'Procedure Entry Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID = 209;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Template Id' of 'Payer Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYER_ENTRY__POLICY_ACTIVITY_TEMPLATE_ID = 210;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHR Extract Template Id' of 'PHR Extract'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHR_EXTRACT__PHR_EXTRACT_TEMPLATE_ID = 211;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHR Update Template Id' of 'PHR Update'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHR_UPDATE__PHR_UPDATE_TEMPLATE_ID = 212;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Template Id' of 'Encounter Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_ACTIVITY__ENCOUNTERS_ACTIVITY_TEMPLATE_ID = 213;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Plan Of Care Mood Code Value' of 'Encounter Plan Of Care'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_PLAN_OF_CARE__ENCOUNTER_PLAN_OF_CARE_MOOD_CODE_VALUE = 214;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Encounter Template Id' of 'Encounter Plan Of Care'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_PLAN_OF_CARE__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID = 215;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Intake Output Section Template Id' of 'Intake Output Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTAKE_OUTPUT_SECTION__INTAKE_OUTPUT_SECTION_TEMPLATE_ID = 216;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy History Section Template Id' of 'Pregnancy History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_HISTORY_SECTION__PREGNANCY_HISTORY_SECTION_TEMPLATE_ID = 217;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy History Section Code' of 'Pregnancy History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_HISTORY_SECTION__PREGNANCY_HISTORY_SECTION_CODE = 218;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy History Section Pregnancy Observation' of 'Pregnancy History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_HISTORY_SECTION__PREGNANCY_HISTORY_SECTION_PREGNANCY_OBSERVATION = 219;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Code' of 'Pregnancy Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_CODE = 220;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Interpretation Code' of 'Pregnancy Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_INTERPRETATION_CODE = 221;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Method Code' of 'Pregnancy Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_METHOD_CODE = 222;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Repeat Number' of 'Pregnancy Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_REPEAT_NUMBER = 223;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Target Site Code' of 'Pregnancy Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_TARGET_SITE_CODE = 224;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Value' of 'Pregnancy Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_VALUE = 225;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Simple Observation Template Id' of 'Pregnancy Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREGNANCY_OBSERVATION__SIMPLE_OBSERVATION_TEMPLATE_ID = 226;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Contact Guardian Template Id' of 'Patient Contact Guardian'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_CONTACT_GUARDIAN__PATIENT_CONTACT_GUARDIAN_TEMPLATE_ID = 227;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Contact Guardian Addr' of 'Patient Contact Guardian'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_CONTACT_GUARDIAN__PATIENT_CONTACT_GUARDIAN_ADDR = 228;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Contact Guardian Class Code' of 'Patient Contact Guardian'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_CONTACT_GUARDIAN__PATIENT_CONTACT_GUARDIAN_CLASS_CODE = 229;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Contact Guardian Code' of 'Patient Contact Guardian'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_CONTACT_GUARDIAN__PATIENT_CONTACT_GUARDIAN_CODE = 230;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Contact Guardian Telecom' of 'Patient Contact Guardian'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_CONTACT_GUARDIAN__PATIENT_CONTACT_GUARDIAN_TELECOM = 231;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Contact Participant Template Id' of 'Patient Contact Participant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_CONTACT_PARTICIPANT__PATIENT_CONTACT_PARTICIPANT_TEMPLATE_ID = 232;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Contact Participant Time' of 'Patient Contact Participant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_CONTACT_PARTICIPANT__PATIENT_CONTACT_PARTICIPANT_TIME = 233;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Contact Participant Type Code' of 'Patient Contact Participant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_CONTACT_PARTICIPANT__PATIENT_CONTACT_PARTICIPANT_TYPE_CODE = 234;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Type Id Fixed' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_TYPE_ID_FIXED = 235;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Has One Record Target' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET = 236;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Has Assigned Author' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR = 237;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Patient Role Id' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_PATIENT_ROLE_ID = 238;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Has Patient Role Address' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS = 239;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Has Patient Name' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_PATIENT_NAME = 240;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Has Patient Gender Code' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_PATIENT_GENDER_CODE = 241;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Has Patient Birth Year' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR = 242;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Has Original Author' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_ORIGINAL_AUTHOR = 243;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Has Scanning Device' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_SCANNING_DEVICE = 244;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Has Scan Data Enterer' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_SCAN_DATA_ENTERER = 245;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Has Represented Custodian Organization Name' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME = 246;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Has Represented Custodian Organization Addr' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR = 247;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Legal Authenticator Assigned Entity Id' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID = 248;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Has Non XML Body' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_NON_XML_BODY = 249;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Has Non XML Body Binary Text' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT = 250;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Has Non XML Body Text Media Type' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE = 251;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Has Non XML Body Text Representation' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION = 252;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Template Id' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_TEMPLATE_ID = 253;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Code' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_CODE = 254;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Confidentiality Code' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_CONFIDENTIALITY_CODE = 255;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Effective Time' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_EFFECTIVE_TIME = 256;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Id' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_ID = 257;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Language Code' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_LANGUAGE_CODE = 258;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Title' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_TITLE = 259;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Type Id' of 'Scanned Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNED_DOCUMENT__SCANNED_DOCUMENT_TYPE_ID = 260;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scan Original Author Has Assigned Author Id' of 'Scan Original Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCAN_ORIGINAL_AUTHOR__SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_ID = 261;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scan Original Author Has Assigned Author Represented Organization Id' of 'Scan Original Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCAN_ORIGINAL_AUTHOR__SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID = 262;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scan Original Author Template Id' of 'Scan Original Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCAN_ORIGINAL_AUTHOR__SCAN_ORIGINAL_AUTHOR_TEMPLATE_ID = 263;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanning Device Time Equals Document Effective Time' of 'Scanning Device'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNING_DEVICE__SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME = 264;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanning Device Has Assigned Author Id' of 'Scanning Device'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNING_DEVICE__SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID = 265;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanning Device Has Assigned Authoring Device Code' of 'Scanning Device'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNING_DEVICE__SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE = 266;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanning Device Has Device Manufacturer Model Name' of 'Scanning Device'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNING_DEVICE__SCANNING_DEVICE_HAS_DEVICE_MANUFACTURER_MODEL_NAME = 267;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanning Device Has Device Software Name' of 'Scanning Device'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNING_DEVICE__SCANNING_DEVICE_HAS_DEVICE_SOFTWARE_NAME = 268;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanning Device Has Assigned Author Represented Organization Id' of 'Scanning Device'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNING_DEVICE__SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID = 269;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanning Device Template Id' of 'Scanning Device'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCANNING_DEVICE__SCANNING_DEVICE_TEMPLATE_ID = 270;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scan Data Enterer Time Equals Document Effective Time' of 'Scan Data Enterer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCAN_DATA_ENTERER__SCAN_DATA_ENTERER_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME = 271;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scan Data Enterer Has Assigned Entity Id' of 'Scan Data Enterer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCAN_DATA_ENTERER__SCAN_DATA_ENTERER_HAS_ASSIGNED_ENTITY_ID = 272;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scan Data Enterer Template Id' of 'Scan Data Enterer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCAN_DATA_ENTERER__SCAN_DATA_ENTERER_TEMPLATE_ID = 273;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scan Data Enterer Time' of 'Scan Data Enterer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCAN_DATA_ENTERER__SCAN_DATA_ENTERER_TIME = 274;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 274;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDAValidator cdaValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CCDValidator ccdValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDTValidator cdtValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHEValidator() {
		super();
		cdaValidator = CDAValidator.INSTANCE;
		ccdValidator = CCDValidator.INSTANCE;
		cdtValidator = CDTValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return IHEPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case IHEPackage.IMMUNIZATIONS_SECTION:
				return validateImmunizationsSection((ImmunizationsSection) value, diagnostics, context);
			case IHEPackage.IMMUNIZATION:
				return validateImmunization((Immunization) value, diagnostics, context);
			case IHEPackage.MEDICATIONS_ADMINISTERED_SECTION:
				return validateMedicationsAdministeredSection(
					(MedicationsAdministeredSection) value, diagnostics, context);
			case IHEPackage.CONCERN_ENTRY:
				return validateConcernEntry((ConcernEntry) value, diagnostics, context);
			case IHEPackage.MEDICAL_DOCUMENT:
				return validateMedicalDocument((MedicalDocument) value, diagnostics, context);
			case IHEPackage.ACTIVE_PROBLEMS_SECTION:
				return validateActiveProblemsSection((ActiveProblemsSection) value, diagnostics, context);
			case IHEPackage.PROBLEM_CONCERN_ENTRY:
				return validateProblemConcernEntry((ProblemConcernEntry) value, diagnostics, context);
			case IHEPackage.PROBLEM_ENTRY:
				return validateProblemEntry((ProblemEntry) value, diagnostics, context);
			case IHEPackage.SEVERITY:
				return validateSeverity((Severity) value, diagnostics, context);
			case IHEPackage.PROBLEM_STATUS_OBSERVATION:
				return validateProblemStatusObservation((ProblemStatusObservation) value, diagnostics, context);
			case IHEPackage.HEALTH_STATUS_OBSERVATION:
				return validateHealthStatusObservation((HealthStatusObservation) value, diagnostics, context);
			case IHEPackage.COMMENT:
				return validateComment((Comment) value, diagnostics, context);
			case IHEPackage.MEDICATION:
				return validateMedication((Medication) value, diagnostics, context);
			case IHEPackage.INTERNAL_REFERENCE:
				return validateInternalReference((InternalReference) value, diagnostics, context);
			case IHEPackage.PATIENT_MEDICAL_INSTRUCTIONS:
				return validatePatientMedicalInstructions((PatientMedicalInstructions) value, diagnostics, context);
			case IHEPackage.SUPPLY_ENTRY:
				return validateSupplyEntry((SupplyEntry) value, diagnostics, context);
			case IHEPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS:
				return validateMedicationFullfillmentInstructions(
					(MedicationFullfillmentInstructions) value, diagnostics, context);
			case IHEPackage.MEDICATIONS_SECTION:
				return validateMedicationsSection((MedicationsSection) value, diagnostics, context);
			case IHEPackage.ALLERGY_INTOLERANCE_CONCERN:
				return validateAllergyIntoleranceConcern((AllergyIntoleranceConcern) value, diagnostics, context);
			case IHEPackage.ALLERGY_INTOLERANCE:
				return validateAllergyIntolerance((AllergyIntolerance) value, diagnostics, context);
			case IHEPackage.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER:
				return validateProblemEntryReactionObservationContainer(
					(ProblemEntryReactionObservationContainer) value, diagnostics, context);
			case IHEPackage.ALLERGIES_REACTIONS_SECTION:
				return validateAllergiesReactionsSection((AllergiesReactionsSection) value, diagnostics, context);
			case IHEPackage.NORMAL_DOSE:
				return validateNormalDose((NormalDose) value, diagnostics, context);
			case IHEPackage.TAPERED_DOSE:
				return validateTaperedDose((TaperedDose) value, diagnostics, context);
			case IHEPackage.SPLIT_DOSE:
				return validateSplitDose((SplitDose) value, diagnostics, context);
			case IHEPackage.CONDITIONAL_DOSE:
				return validateConditionalDose((ConditionalDose) value, diagnostics, context);
			case IHEPackage.COMBINATION_MEDICATION:
				return validateCombinationMedication((CombinationMedication) value, diagnostics, context);
			case IHEPackage.VITAL_SIGNS_SECTION:
				return validateVitalSignsSection((VitalSignsSection) value, diagnostics, context);
			case IHEPackage.CODED_VITAL_SIGNS_SECTION:
				return validateCodedVitalSignsSection((CodedVitalSignsSection) value, diagnostics, context);
			case IHEPackage.VITAL_SIGNS_ORGANIZER:
				return validateVitalSignsOrganizer((VitalSignsOrganizer) value, diagnostics, context);
			case IHEPackage.VITAL_SIGN_OBSERVATION:
				return validateVitalSignObservation((VitalSignObservation) value, diagnostics, context);
			case IHEPackage.SIMPLE_OBSERVATION:
				return validateSimpleObservation((SimpleObservation) value, diagnostics, context);
			case IHEPackage.PAYERS_SECTION:
				return validatePayersSection((PayersSection) value, diagnostics, context);
			case IHEPackage.COVERAGE_ENTRY:
				return validateCoverageEntry((CoverageEntry) value, diagnostics, context);
			case IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION:
				return validateHistoryOfPastIllnessSection((HistoryOfPastIllnessSection) value, diagnostics, context);
			case IHEPackage.CHIEF_COMPLAINT_SECTION:
				return validateChiefComplaintSection((ChiefComplaintSection) value, diagnostics, context);
			case IHEPackage.REASON_FOR_REFERRAL_SECTION:
				return validateReasonForReferralSection((ReasonForReferralSection) value, diagnostics, context);
			case IHEPackage.HISTORY_OF_PRESENT_ILLNESS:
				return validateHistoryOfPresentIllness((HistoryOfPresentIllness) value, diagnostics, context);
			case IHEPackage.SURGERIES_SECTION:
				return validateSurgeriesSection((SurgeriesSection) value, diagnostics, context);
			case IHEPackage.CODED_SURGERIES_SECTION:
				return validateCodedSurgeriesSection((CodedSurgeriesSection) value, diagnostics, context);
			case IHEPackage.EXTERNAL_REFERENCE:
				return validateExternalReference((ExternalReference) value, diagnostics, context);
			case IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE:
				return validateProcedureEntryProcedureActivityProcedure(
					(ProcedureEntryProcedureActivityProcedure) value, diagnostics, context);
			case IHEPackage.PROCEDURE_ENTRY:
				return validateProcedureEntry((ProcedureEntry) value, diagnostics, context);
			case IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION:
				return validateHospitalAdmissionDiagnosisSection(
					(HospitalAdmissionDiagnosisSection) value, diagnostics, context);
			case IHEPackage.DISCHARGE_DIAGNOSIS_SECTION:
				return validateDischargeDiagnosisSection((DischargeDiagnosisSection) value, diagnostics, context);
			case IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION:
				return validateAdmissionMedicationHistorySection(
					(AdmissionMedicationHistorySection) value, diagnostics, context);
			case IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION:
				return validateHospitalDischargeMedicationsSection(
					(HospitalDischargeMedicationsSection) value, diagnostics, context);
			case IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION:
				return validateCodedAdvanceDirectivesSection(
					(CodedAdvanceDirectivesSection) value, diagnostics, context);
			case IHEPackage.ADVANCE_DIRECTIVES_SECTION:
				return validateAdvanceDirectivesSection((AdvanceDirectivesSection) value, diagnostics, context);
			case IHEPackage.PHYSICAL_EXAM_NARRATIVE_SECTION:
				return validatePhysicalExamNarrativeSection((PhysicalExamNarrativeSection) value, diagnostics, context);
			case IHEPackage.PHYSICAL_EXAM_SECTION:
				return validatePhysicalExamSection((PhysicalExamSection) value, diagnostics, context);
			case IHEPackage.REVIEW_OF_SYSTEMS_SECTION:
				return validateReviewOfSystemsSection((ReviewOfSystemsSection) value, diagnostics, context);
			case IHEPackage.HOSPITAL_COURSE_SECTION:
				return validateHospitalCourseSection((HospitalCourseSection) value, diagnostics, context);
			case IHEPackage.CODED_RESULTS_SECTION:
				return validateCodedResultsSection((CodedResultsSection) value, diagnostics, context);
			case IHEPackage.ASSESSMENT_AND_PLAN_SECTION:
				return validateAssessmentAndPlanSection((AssessmentAndPlanSection) value, diagnostics, context);
			case IHEPackage.CARE_PLAN_SECTION:
				return validateCarePlanSection((CarePlanSection) value, diagnostics, context);
			case IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION:
				return validateFamilyMedicalHistorySection((FamilyMedicalHistorySection) value, diagnostics, context);
			case IHEPackage.SOCIAL_HISTORY_SECTION:
				return validateSocialHistorySection((SocialHistorySection) value, diagnostics, context);
			case IHEPackage.ENCOUNTER_HISTORY_SECTION:
				return validateEncounterHistorySection((EncounterHistorySection) value, diagnostics, context);
			case IHEPackage.ENCOUNTER_ENTRY:
				return validateEncounterEntry((EncounterEntry) value, diagnostics, context);
			case IHEPackage.MEDICAL_DEVICES_SECTION:
				return validateMedicalDevicesSection((MedicalDevicesSection) value, diagnostics, context);
			case IHEPackage.LANGUAGE_COMMUNICATION:
				return validateLanguageCommunication((LanguageCommunication) value, diagnostics, context);
			case IHEPackage.MEDICAL_SUMMARY:
				return validateMedicalSummary((MedicalSummary) value, diagnostics, context);
			case IHEPackage.DISCHARGE_SUMMARY:
				return validateDischargeSummary((DischargeSummary) value, diagnostics, context);
			case IHEPackage.HEALTHCARE_PROVIDERS_PHARMACIES:
				return validateHealthcareProvidersPharmacies(
					(HealthcareProvidersPharmacies) value, diagnostics, context);
			case IHEPackage.OBSERVATION_REQUEST_ENTRY:
				return validateObservationRequestEntry((ObservationRequestEntry) value, diagnostics, context);
			case IHEPackage.PRODUCT_ENTRY:
				return validateProductEntry((ProductEntry) value, diagnostics, context);
			case IHEPackage.PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE:
				return validateProcedureEntryPlanOfCareActivityProcedure(
					(ProcedureEntryPlanOfCareActivityProcedure) value, diagnostics, context);
			case IHEPackage.PAYER_ENTRY:
				return validatePayerEntry((PayerEntry) value, diagnostics, context);
			case IHEPackage.PHR_EXTRACT:
				return validatePHRExtract((PHRExtract) value, diagnostics, context);
			case IHEPackage.PHR_UPDATE:
				return validatePHRUpdate((PHRUpdate) value, diagnostics, context);
			case IHEPackage.ENCOUNTER_ACTIVITY:
				return validateEncounterActivity((EncounterActivity) value, diagnostics, context);
			case IHEPackage.ENCOUNTER_PLAN_OF_CARE:
				return validateEncounterPlanOfCare((EncounterPlanOfCare) value, diagnostics, context);
			case IHEPackage.INTAKE_OUTPUT_SECTION:
				return validateIntakeOutputSection((IntakeOutputSection) value, diagnostics, context);
			case IHEPackage.PREGNANCY_HISTORY_SECTION:
				return validatePregnancyHistorySection((PregnancyHistorySection) value, diagnostics, context);
			case IHEPackage.PREGNANCY_OBSERVATION:
				return validatePregnancyObservation((PregnancyObservation) value, diagnostics, context);
			case IHEPackage.PATIENT_CONTACT:
				return validatePatientContact((PatientContact) value, diagnostics, context);
			case IHEPackage.PATIENT_CONTACT_GUARDIAN:
				return validatePatientContactGuardian((PatientContactGuardian) value, diagnostics, context);
			case IHEPackage.PATIENT_CONTACT_PARTICIPANT:
				return validatePatientContactParticipant((PatientContactParticipant) value, diagnostics, context);
			case IHEPackage.SCANNED_DOCUMENT:
				return validateScannedDocument((ScannedDocument) value, diagnostics, context);
			case IHEPackage.SCAN_ORIGINAL_AUTHOR:
				return validateScanOriginalAuthor((ScanOriginalAuthor) value, diagnostics, context);
			case IHEPackage.SCANNING_DEVICE:
				return validateScanningDevice((ScanningDevice) value, diagnostics, context);
			case IHEPackage.SCAN_DATA_ENTERER:
				return validateScanDataEnterer((ScanDataEnterer) value, diagnostics, context);
			case IHEPackage.IHE_REGISTRY_DELEGATE:
				return validateIHERegistryDelegate((IHERegistryDelegate) value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(immunizationsSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionHasMedicationOrSupplyActivity(
				immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateImmunizationsSection_validateMedicationsSectionTemplateId(
				immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateImmunizationsSection_validateMedicationsSectionCode(
				immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionTitle(
				immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionText(
				immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionMedicationActivity(
				immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionSupplyActivity(
				immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionTitle(
				immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionText(
				immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateImmunizationsSection_validateIHEImmunizationsSectionTemplateId(
				immunizationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateImmunizationsSection_validateIHEImmunizationsSectionImmunization(
				immunizationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHEImmunizationsSectionTemplateId constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateIHEImmunizationsSectionTemplateId(
			ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateIHEImmunizationsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateIHEImmunizationsSectionImmunization constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateIHEImmunizationsSectionImmunization(
			ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateIHEImmunizationsSectionImmunization(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(immunization, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(
				immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateImmunization_validateImmunizationComments(immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateImmunization_validateImmunizationTemplateId(immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateImmunization_validateImmunizationCode(immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateImmunization_validateImmunizationStatusCode(immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateImmunization_validateImmunizationMoodCode(immunization, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateImmunization_validateImmunizationEffectiveTime(immunization, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateImmunizationComments constraint of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization_validateImmunizationComments(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunization.validateImmunizationComments(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationTemplateId constraint of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization_validateImmunizationTemplateId(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunization.validateImmunizationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationCode constraint of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization_validateImmunizationCode(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunization.validateImmunizationCode(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationStatusCode constraint of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization_validateImmunizationStatusCode(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunization.validateImmunizationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationMoodCode constraint of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization_validateImmunizationMoodCode(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunization.validateImmunizationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationEffectiveTime constraint of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization_validateImmunizationEffectiveTime(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunization.validateImmunizationEffectiveTime(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsAdministeredSection(
			MedicationsAdministeredSection medicationsAdministeredSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationsAdministeredSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
				medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
				medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionTemplateId(
				medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionCode(
				medicationsAdministeredSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicationsAdministeredSectionTemplateId constraint of '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionTemplateId(
			MedicationsAdministeredSection medicationsAdministeredSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationsAdministeredSection.validateMedicationsAdministeredSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsAdministeredSectionCode constraint of '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionCode(
			MedicationsAdministeredSection medicationsAdministeredSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationsAdministeredSection.validateMedicationsAdministeredSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcernEntry(ConcernEntry concernEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(concernEntry, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActEntryRelationshipRequired(
				concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActSubjectOfTarget(
				concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActContainsProblemObservation(
				concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActContainsAlertObservation(
				concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActContainsPatientAwareness(
				concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActTemplateId(concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActClassCode(concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActMoodCode(concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActId(concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActCodeNullFlavor(
				concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActEffectiveTime(
				concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActEpisodeObservation(
				concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConcernEntry_validateConcernEntryEffectiveTimeLowHigh(concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConcernEntry_validateConcernEntryHasRelatedObservations(
				concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConcernEntry_validateConcernEntryRelatedObservationsTypeCode(
				concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConcernEntry_validateConcernEntryTemplateId(concernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConcernEntry_validateConcernEntryEffectiveTime(concernEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConcernEntryEffectiveTimeLowHigh constraint of '<em>Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcernEntry_validateConcernEntryEffectiveTimeLowHigh(ConcernEntry concernEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return concernEntry.validateConcernEntryEffectiveTimeLowHigh(diagnostics, context);
	}

	/**
	 * Validates the validateConcernEntryHasRelatedObservations constraint of '<em>Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcernEntry_validateConcernEntryHasRelatedObservations(ConcernEntry concernEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return concernEntry.validateConcernEntryHasRelatedObservations(diagnostics, context);
	}

	/**
	 * Validates the validateConcernEntryRelatedObservationsTypeCode constraint of '<em>Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcernEntry_validateConcernEntryRelatedObservationsTypeCode(ConcernEntry concernEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return concernEntry.validateConcernEntryRelatedObservationsTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validateConcernEntryTemplateId constraint of '<em>Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcernEntry_validateConcernEntryTemplateId(ConcernEntry concernEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return concernEntry.validateConcernEntryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateConcernEntryEffectiveTime constraint of '<em>Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcernEntry_validateConcernEntryEffectiveTime(ConcernEntry concernEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return concernEntry.validateConcernEntryEffectiveTime(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalDocument(MedicalDocument medicalDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicalDocument, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateClassCode(medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(
				medicalDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalDocument_validateMedicalDocumentTemplateId(medicalDocument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicalDocumentTemplateId constraint of '<em>Medical Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalDocument_validateMedicalDocumentTemplateId(MedicalDocument medicalDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalDocument.validateMedicalDocumentTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActiveProblemsSection(ActiveProblemsSection activeProblemsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activeProblemsSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemSection_validateProblemSectionTemplateId(
				activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemSection_validateProblemSectionCode(
				activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemSection_validateProblemSectionTitle(
				activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemSection_validateProblemSectionText(
				activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemSection_validateProblemSectionProblemAct(
				activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateActiveProblemsSection_validateActiveProblemsSectionTemplateId(
				activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateActiveProblemsSection_validateActiveProblemsSectionProblemConcernEntry(
				activeProblemsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateActiveProblemsSectionTemplateId constraint of '<em>Active Problems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActiveProblemsSection_validateActiveProblemsSectionTemplateId(
			ActiveProblemsSection activeProblemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activeProblemsSection.validateActiveProblemsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateActiveProblemsSectionProblemConcernEntry constraint of '<em>Active Problems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActiveProblemsSection_validateActiveProblemsSectionProblemConcernEntry(
			ActiveProblemsSection activeProblemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activeProblemsSection.validateActiveProblemsSectionProblemConcernEntry(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernEntry(ProblemConcernEntry problemConcernEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemConcernEntry, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActEntryRelationshipRequired(
				problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActSubjectOfTarget(
				problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActContainsProblemObservation(
				problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActContainsAlertObservation(
				problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActContainsPatientAwareness(
				problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActTemplateId(
				problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActClassCode(
				problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActMoodCode(
				problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActId(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActCodeNullFlavor(
				problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActEffectiveTime(
				problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActEpisodeObservation(
				problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConcernEntry_validateConcernEntryEffectiveTimeLowHigh(
				problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConcernEntry_validateConcernEntryHasRelatedObservations(
				problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConcernEntry_validateConcernEntryRelatedObservationsTypeCode(
				problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConcernEntry_validateConcernEntryTemplateId(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConcernEntry_validateConcernEntryEffectiveTime(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemConcernEntry_validateProblemConcernEntryTemplateId(
				problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemConcernEntry_validateProblemConcernEntryProblemEntry(
				problemConcernEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProblemConcernEntryTemplateId constraint of '<em>Problem Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernEntry_validateProblemConcernEntryTemplateId(
			ProblemConcernEntry problemConcernEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemConcernEntry.validateProblemConcernEntryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemConcernEntryProblemEntry constraint of '<em>Problem Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernEntry_validateProblemConcernEntryProblemEntry(
			ProblemConcernEntry problemConcernEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemConcernEntry.validateProblemConcernEntryProblemEntry(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry(ProblemEntry problemEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemEntry, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(
				problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(
				problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationTemplateId(
				problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(
				problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(
				problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(
				problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(
				problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(
				problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(
				problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryHasTextReference(problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryCommentInversionInd(problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryTemplateId(problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryCode(problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryEffectiveTime(problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryId(problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryText(problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryValue(problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntrySeverity(problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryProblemStatusObservation(
				problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryHealthStatusObservation(
				problemEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryComment(problemEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProblemEntryHasTextReference constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_validateProblemEntryHasTextReference(ProblemEntry problemEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.validateProblemEntryHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntryCommentInversionInd constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_validateProblemEntryCommentInversionInd(ProblemEntry problemEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.validateProblemEntryCommentInversionInd(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntryTemplateId constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_validateProblemEntryTemplateId(ProblemEntry problemEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.validateProblemEntryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntryCode constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_validateProblemEntryCode(ProblemEntry problemEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.validateProblemEntryCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntryEffectiveTime constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_validateProblemEntryEffectiveTime(ProblemEntry problemEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.validateProblemEntryEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntryId constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_validateProblemEntryId(ProblemEntry problemEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return problemEntry.validateProblemEntryId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntryText constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_validateProblemEntryText(ProblemEntry problemEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.validateProblemEntryText(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntryValue constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_validateProblemEntryValue(ProblemEntry problemEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.validateProblemEntryValue(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntrySeverity constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_validateProblemEntrySeverity(ProblemEntry problemEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.validateProblemEntrySeverity(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntryProblemStatusObservation constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_validateProblemEntryProblemStatusObservation(ProblemEntry problemEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.validateProblemEntryProblemStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntryHealthStatusObservation constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_validateProblemEntryHealthStatusObservation(ProblemEntry problemEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.validateProblemEntryHealthStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntryComment constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_validateProblemEntryComment(ProblemEntry problemEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.validateProblemEntryComment(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity(Severity severity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(severity, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(severity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(severity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(severity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(severity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(severity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(severity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(severity, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSeverityObservation_validateSeverityObservationTemplateId(
				severity, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSeverityObservation_validateSeverityObservationClassCode(
				severity, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSeverityObservation_validateSeverityObservationMoodCode(
				severity, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSeverityObservation_validateSeverityObservationCode(
				severity, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSeverityObservation_validateSeverityObservationStatusCode(
				severity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSeverity_validateSeverityObservationValue(severity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSeverity_validateSeverityHasTextReference(severity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSeverity_validateSeverityTemplateId(severity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSeverity_validateSeverityText(severity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSeverityHasTextReference constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityHasTextReference(Severity severity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return severity.validateSeverityHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityTemplateId constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityTemplateId(Severity severity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return severity.validateSeverityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityText constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityText(Severity severity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return severity.validateSeverityText(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityObservationValue constraint of '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity_validateSeverityObservationValue(Severity severity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return severity.validateSeverityObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation(ProblemStatusObservation problemStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemStatusObservation, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateStatusObservation_validateStatusObservationNoAdditionalParticipants(
				problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemStatusObservation_validateStatusObservationTemplateId(
				problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateStatusObservation_validateStatusObservationClassCode(
				problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateStatusObservation_validateStatusObservationMoodCode(
				problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateStatusObservation_validateStatusObservationCode(
				problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateStatusObservation_validateStatusObservationStatusCode(
				problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemStatusObservation_validateStatusObservationValue(
				problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemStatusObservation_validateIHEProblemStatusObservationHasTextReference(
				problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemStatusObservation_validateIHEProblemStatusObservationTemplateId(
				problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemStatusObservation_validateIHEProblemStatusObservationText(
				problemStatusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHEProblemStatusObservationHasTextReference constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateIHEProblemStatusObservationHasTextReference(
			ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateIHEProblemStatusObservationHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateIHEProblemStatusObservationTemplateId constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateIHEProblemStatusObservationTemplateId(
			ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateIHEProblemStatusObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateIHEProblemStatusObservationText constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateIHEProblemStatusObservationText(
			ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateIHEProblemStatusObservationText(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationValue constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateStatusObservationValue(
			ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatusObservation.validateStatusObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation(HealthStatusObservation healthStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(healthStatusObservation, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateStatusObservation_validateStatusObservationNoAdditionalParticipants(
				healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemHealthStatusObservation_validateStatusObservationTemplateId(
				healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateStatusObservation_validateStatusObservationClassCode(
				healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateStatusObservation_validateStatusObservationMoodCode(
				healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemHealthStatusObservation_validateStatusObservationCode(
				healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateStatusObservation_validateStatusObservationStatusCode(
				healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHealthStatusObservation_validateStatusObservationValue(
				healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHealthStatusObservation_validateHealthStatusObservationHasTextReference(
				healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHealthStatusObservation_validateHealthStatusObservationTemplateId(
				healthStatusObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHealthStatusObservation_validateHealthStatusObservationText(
				healthStatusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHealthStatusObservationHasTextReference constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateHealthStatusObservationHasTextReference(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateHealthStatusObservationHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateHealthStatusObservationTemplateId constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateHealthStatusObservationTemplateId(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateHealthStatusObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHealthStatusObservationText constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateHealthStatusObservationText(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateHealthStatusObservationText(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationValue constraint of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservation_validateStatusObservationValue(
			HealthStatusObservation healthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthStatusObservation.validateStatusObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(comment, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_validateCommentTemplateId(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateComment_validateCommentClassCode(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateComment_validateCommentMoodCode(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateComment_validateCommentCode(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_validateIHECommentHasTextReference(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_validateIHECommentEffectiveTimeWhenAuthorPresent(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_validateIHECommentHasAuthorId(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_validateIHECommentHasAuthorOrganization(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_validateIHECommentStatusCode(comment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComment_validateIHECommentText(comment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHECommentHasTextReference constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateIHECommentHasTextReference(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return comment.validateIHECommentHasTextReference(diagnostics, context);
	}

	/**
	 * Validates the validateIHECommentEffectiveTimeWhenAuthorPresent constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateIHECommentEffectiveTimeWhenAuthorPresent(Comment comment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comment.validateIHECommentEffectiveTimeWhenAuthorPresent(diagnostics, context);
	}

	/**
	 * Validates the validateIHECommentHasAuthorId constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateIHECommentHasAuthorId(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return comment.validateIHECommentHasAuthorId(diagnostics, context);
	}

	/**
	 * Validates the validateIHECommentHasAuthorOrganization constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateIHECommentHasAuthorOrganization(Comment comment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comment.validateIHECommentHasAuthorOrganization(diagnostics, context);
	}

	/**
	 * Validates the validateIHECommentStatusCode constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateIHECommentStatusCode(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return comment.validateIHECommentStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateIHECommentText constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateIHECommentText(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return comment.validateIHECommentText(diagnostics, context);
	}

	/**
	 * Validates the validateCommentTemplateId constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentTemplateId(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return comment.validateCommentTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medication, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(
				medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasDosing(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationDosingRelationship(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasDescriptionNoMedNotKnown(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationReasonClassMood(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasProductEntry(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasIntructionsInversion(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationProductStrength(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationProductName(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationPreconditionReference(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasSupplyEntryInversion(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasFillNumber(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationTemplateId(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationApproachSiteCode(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationDoseQuantity(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationRateQuantity(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationCode(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationStatusCode(medication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationEffectiveTime(medication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicationHasDosing constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationHasDosing(Medication medication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medication.validateMedicationHasDosing(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationDosingRelationship constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationDosingRelationship(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationDosingRelationship(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationHasDescriptionNoMedNotKnown constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationHasDescriptionNoMedNotKnown(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationHasDescriptionNoMedNotKnown(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationReasonClassMood constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationReasonClassMood(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationReasonClassMood(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationHasProductEntry constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationHasProductEntry(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationHasProductEntry(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationHasIntructionsInversion constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationHasIntructionsInversion(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationHasIntructionsInversion(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationProductStrength constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationProductStrength(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationProductStrength(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationProductName constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationProductName(Medication medication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medication.validateMedicationProductName(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationPreconditionReference constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationPreconditionReference(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationPreconditionReference(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationHasSupplyEntryInversion constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationHasSupplyEntryInversion(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationHasSupplyEntryInversion(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationHasFillNumber constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationHasFillNumber(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationHasFillNumber(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationTemplateId constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationTemplateId(Medication medication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medication.validateMedicationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationApproachSiteCode constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationApproachSiteCode(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationApproachSiteCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationDoseQuantity constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationDoseQuantity(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationDoseQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationRateQuantity constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationRateQuantity(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationRateQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationCode constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationCode(Medication medication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medication.validateMedicationCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationStatusCode constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationStatusCode(Medication medication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medication.validateMedicationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationEffectiveTime constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationEffectiveTime(Medication medication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationEffectiveTime(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalReference(InternalReference internalReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalReference, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(internalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(internalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(internalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(internalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(internalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(internalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(internalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInternalReference_validateInternalReferenceTemplateId(
				internalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInternalReference_validateInternalReferenceCode(internalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInternalReference_validateInternalReferenceId(internalReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInternalReferenceTemplateId constraint of '<em>Internal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalReference_validateInternalReferenceTemplateId(InternalReference internalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalReference.validateInternalReferenceTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateInternalReferenceCode constraint of '<em>Internal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalReference_validateInternalReferenceCode(InternalReference internalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalReference.validateInternalReferenceCode(diagnostics, context);
	}

	/**
	 * Validates the validateInternalReferenceId constraint of '<em>Internal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalReference_validateInternalReferenceId(InternalReference internalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalReference.validateInternalReferenceId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructions(PatientMedicalInstructions patientMedicalInstructions,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(patientMedicalInstructions, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(patientMedicalInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(patientMedicalInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(patientMedicalInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(patientMedicalInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(patientMedicalInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(patientMedicalInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(patientMedicalInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePatientInstruction_validatePatientInstructionTemplateId(
				patientMedicalInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePatientInstruction_validatePatientInstructionMoodCode(
				patientMedicalInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePatientMedicalInstructions_validatePatientMedicalInstructionsTemplateId(
				patientMedicalInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePatientMedicalInstructions_validatePatientMedicalInstructionsClassCode(
				patientMedicalInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePatientMedicalInstructions_validatePatientMedicalInstructionsCode(
				patientMedicalInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePatientMedicalInstructions_validatePatientMedicalInstructionsStatusCode(
				patientMedicalInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePatientMedicalInstructions_validatePatientMedicalInstructionsText(
				patientMedicalInstructions, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePatientMedicalInstructionsTemplateId constraint of '<em>Patient Medical Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructions_validatePatientMedicalInstructionsTemplateId(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patientMedicalInstructions.validatePatientMedicalInstructionsTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePatientMedicalInstructionsClassCode constraint of '<em>Patient Medical Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructions_validatePatientMedicalInstructionsClassCode(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patientMedicalInstructions.validatePatientMedicalInstructionsClassCode(diagnostics, context);
	}

	/**
	 * Validates the validatePatientMedicalInstructionsCode constraint of '<em>Patient Medical Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructions_validatePatientMedicalInstructionsCode(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patientMedicalInstructions.validatePatientMedicalInstructionsCode(diagnostics, context);
	}

	/**
	 * Validates the validatePatientMedicalInstructionsStatusCode constraint of '<em>Patient Medical Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructions_validatePatientMedicalInstructionsStatusCode(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patientMedicalInstructions.validatePatientMedicalInstructionsStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validatePatientMedicalInstructionsText constraint of '<em>Patient Medical Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructions_validatePatientMedicalInstructionsText(
			PatientMedicalInstructions patientMedicalInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patientMedicalInstructions.validatePatientMedicalInstructionsText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyEntry(SupplyEntry supplyEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supplyEntry, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSupply_validateClassCode(supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityMoodCode(
				supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityHasAuthor(
				supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityHasPerformer(
				supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityHasParticipantLocation(
				supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityInformationSource(
				supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityHasProduct(
				supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityTemplateId(
				supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityId(supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityStatusCode(
				supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityEffectiveTime(
				supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityQuantity(
				supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityRepeatNumber(
				supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityMedicationStatusObservation(
				supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityFulfillmentInstruction(
				supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSupplyActivity_validateSupplyActivityProductInstance(
				supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSupplyEntry_validateSupplyEntryTemplateId(supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSupplyEntry_validateSupplyEntryQuantity(supplyEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSupplyEntry_validateSupplyEntryRepeatNumber(supplyEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSupplyEntryTemplateId constraint of '<em>Supply Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyEntry_validateSupplyEntryTemplateId(SupplyEntry supplyEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyEntry.validateSupplyEntryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyEntryQuantity constraint of '<em>Supply Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyEntry_validateSupplyEntryQuantity(SupplyEntry supplyEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyEntry.validateSupplyEntryQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyEntryRepeatNumber constraint of '<em>Supply Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyEntry_validateSupplyEntryRepeatNumber(SupplyEntry supplyEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyEntry.validateSupplyEntryRepeatNumber(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFullfillmentInstructions(
			MedicationFullfillmentInstructions medicationFullfillmentInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationFullfillmentInstructions, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(medicationFullfillmentInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(medicationFullfillmentInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(medicationFullfillmentInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(medicationFullfillmentInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(medicationFullfillmentInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(medicationFullfillmentInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(medicationFullfillmentInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateFulfillmentInstruction_validateFulfillmentInstructionTemplateId(
				medicationFullfillmentInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateFulfillmentInstruction_validateFulfillmentInstructionMoodCode(
				medicationFullfillmentInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsTemplateId(
				medicationFullfillmentInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsCode(
				medicationFullfillmentInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsStatusCode(
				medicationFullfillmentInstructions, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsText(
				medicationFullfillmentInstructions, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicationFullfillmentInstructionsTemplateId constraint of '<em>Medication Fullfillment Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsTemplateId(
			MedicationFullfillmentInstructions medicationFullfillmentInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationFullfillmentInstructions.validateMedicationFullfillmentInstructionsTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateMedicationFullfillmentInstructionsCode constraint of '<em>Medication Fullfillment Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsCode(
			MedicationFullfillmentInstructions medicationFullfillmentInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationFullfillmentInstructions.validateMedicationFullfillmentInstructionsCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationFullfillmentInstructionsStatusCode constraint of '<em>Medication Fullfillment Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsStatusCode(
			MedicationFullfillmentInstructions medicationFullfillmentInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationFullfillmentInstructions.validateMedicationFullfillmentInstructionsStatusCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateMedicationFullfillmentInstructionsText constraint of '<em>Medication Fullfillment Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFullfillmentInstructions_validateMedicationFullfillmentInstructionsText(
			MedicationFullfillmentInstructions medicationFullfillmentInstructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return medicationFullfillmentInstructions.validateMedicationFullfillmentInstructionsText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection(MedicationsSection medicationsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationsSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionHasMedicationOrSupplyActivity(
				medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionTemplateId(
				medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionCode(
				medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionTitle(
				medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionText(
				medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionMedicationActivity(
				medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionSupplyActivity(
				medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicationsSection_validateIHEMedicationsSectionTemplateId(
				medicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicationsSection_validateIHEMedicationsSectionMedication(
				medicationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHEMedicationsSectionTemplateId constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateIHEMedicationsSectionTemplateId(
			MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateIHEMedicationsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateIHEMedicationsSectionMedication constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateIHEMedicationsSectionMedication(
			MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateIHEMedicationsSectionMedication(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceConcern(AllergyIntoleranceConcern allergyIntoleranceConcern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allergyIntoleranceConcern, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActEntryRelationshipRequired(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActSubjectOfTarget(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActContainsProblemObservation(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActContainsAlertObservation(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActContainsPatientAwareness(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActTemplateId(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActClassCode(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActMoodCode(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActId(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActCodeNullFlavor(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActEffectiveTime(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemAct_validateProblemActEpisodeObservation(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConcernEntry_validateConcernEntryEffectiveTimeLowHigh(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConcernEntry_validateConcernEntryHasRelatedObservations(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConcernEntry_validateConcernEntryRelatedObservationsTypeCode(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConcernEntry_validateConcernEntryTemplateId(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConcernEntry_validateConcernEntryEffectiveTime(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAllergyIntoleranceConcern_validateAllergyIntoleranceConcernTemplateId(
				allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAllergyIntoleranceConcern_validateAllergyIntoleranceConcernAllergyIntolerance(
				allergyIntoleranceConcern, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAllergyIntoleranceConcernTemplateId constraint of '<em>Allergy Intolerance Concern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceConcern_validateAllergyIntoleranceConcernTemplateId(
			AllergyIntoleranceConcern allergyIntoleranceConcern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return allergyIntoleranceConcern.validateAllergyIntoleranceConcernTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyIntoleranceConcernAllergyIntolerance constraint of '<em>Allergy Intolerance Concern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceConcern_validateAllergyIntoleranceConcernAllergyIntolerance(
			AllergyIntoleranceConcern allergyIntoleranceConcern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return allergyIntoleranceConcern.validateAllergyIntoleranceConcernAllergyIntolerance(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntolerance(AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allergyIntolerance, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationTemplateId(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryHasTextReference(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryCommentInversionInd(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryTemplateId(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAllergyIntolerance_validateProblemEntryCode(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryEffectiveTime(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryId(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryText(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryValue(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntrySeverity(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryProblemStatusObservation(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryHealthStatusObservation(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryComment(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAllergyIntolerance_validateAllergyIntoleranceTemplateId(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAllergyIntolerance_validateAllergyIntoleranceValue(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAllergyIntolerance_validateAllergyIntoleranceProblemEntryReactionObservationContainer(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAllergyIntolerance_validateAllergyIntoleranceSeverity(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAllergyIntolerance_validateAllergyIntoleranceProblemStatusObservation(
				allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAllergyIntolerance_validateAllergyIntoleranceComment(
				allergyIntolerance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAllergyIntoleranceTemplateId constraint of '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntolerance_validateAllergyIntoleranceTemplateId(
			AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyIntolerance.validateAllergyIntoleranceTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyIntoleranceValue constraint of '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntolerance_validateAllergyIntoleranceValue(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyIntolerance.validateAllergyIntoleranceValue(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyIntoleranceProblemEntryReactionObservationContainer constraint of '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntolerance_validateAllergyIntoleranceProblemEntryReactionObservationContainer(
			AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyIntolerance.validateAllergyIntoleranceProblemEntryReactionObservationContainer(
			diagnostics, context);
	}

	/**
	 * Validates the validateAllergyIntoleranceSeverity constraint of '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntolerance_validateAllergyIntoleranceSeverity(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyIntolerance.validateAllergyIntoleranceSeverity(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyIntoleranceProblemStatusObservation constraint of '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntolerance_validateAllergyIntoleranceProblemStatusObservation(
			AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyIntolerance.validateAllergyIntoleranceProblemStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateAllergyIntoleranceComment constraint of '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntolerance_validateAllergyIntoleranceComment(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyIntolerance.validateAllergyIntoleranceComment(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntryCode constraint of '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntolerance_validateProblemEntryCode(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyIntolerance.validateProblemEntryCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryReactionObservationContainer(
			ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemEntryReactionObservationContainer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
			problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationTemplateId(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryHasTextReference(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryCommentInversionInd(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryTemplateId(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryCode(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryEffectiveTime(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryId(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryText(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryValue(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntrySeverity(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryProblemStatusObservation(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryHealthStatusObservation(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProblemEntry_validateProblemEntryComment(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateReactionObservation_validateReactionObservationTemplateId(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateReactionObservation_validateReactionObservationClassCode(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateReactionObservation_validateReactionObservationMoodCode(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateReactionObservation_validateReactionObservationStatusCode(
				problemEntryReactionObservationContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateReactionObservation_validateReactionObservationSeverityObservation(
				problemEntryReactionObservationContainer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesReactionsSection(AllergiesReactionsSection allergiesReactionsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allergiesReactionsSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateAlertsSection_validateAlertsSectionTemplateId(
				allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateAlertsSection_validateAlertsSectionCode(
				allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateAlertsSection_validateAlertsSectionTitle(
				allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateAlertsSection_validateAlertsSectionText(
				allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateAlertsSection_validateAlertsSectionProblemAct(
				allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAllergiesReactionsSection_validateAllergiesReactionsSectionTemplateId(
				allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAllergiesReactionsSection_validateAllergiesReactionsSectionAllergyIntoleranceConcern(
				allergiesReactionsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAllergiesReactionsSectionTemplateId constraint of '<em>Allergies Reactions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesReactionsSection_validateAllergiesReactionsSectionTemplateId(
			AllergiesReactionsSection allergiesReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return allergiesReactionsSection.validateAllergiesReactionsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAllergiesReactionsSectionAllergyIntoleranceConcern constraint of '<em>Allergies Reactions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesReactionsSection_validateAllergiesReactionsSectionAllergyIntoleranceConcern(
			AllergiesReactionsSection allergiesReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return allergiesReactionsSection.validateAllergiesReactionsSectionAllergyIntoleranceConcern(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalDose(NormalDose normalDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(normalDose, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasDosing(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationDosingRelationship(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasDescriptionNoMedNotKnown(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationReasonClassMood(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasProductEntry(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasIntructionsInversion(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationProductStrength(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationProductName(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationPreconditionReference(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasSupplyEntryInversion(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasFillNumber(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationTemplateId(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationApproachSiteCode(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationDoseQuantity(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationRateQuantity(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationCode(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationStatusCode(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationEffectiveTime(normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNormalDose_validateNormalDoseNoSubordinateSubstanceAdministration(
				normalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNormalDose_validateNormalDoseTemplateId(normalDose, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNormalDoseNoSubordinateSubstanceAdministration constraint of '<em>Normal Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalDose_validateNormalDoseNoSubordinateSubstanceAdministration(NormalDose normalDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return normalDose.validateNormalDoseNoSubordinateSubstanceAdministration(diagnostics, context);
	}

	/**
	 * Validates the validateNormalDoseTemplateId constraint of '<em>Normal Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalDose_validateNormalDoseTemplateId(NormalDose normalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return normalDose.validateNormalDoseTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaperedDose(TaperedDose taperedDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(taperedDose, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasDosing(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationDosingRelationship(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasDescriptionNoMedNotKnown(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationReasonClassMood(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasProductEntry(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasIntructionsInversion(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationProductStrength(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationProductName(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationPreconditionReference(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasSupplyEntryInversion(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasFillNumber(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationTemplateId(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationApproachSiteCode(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationDoseQuantity(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationRateQuantity(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationCode(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationStatusCode(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationEffectiveTime(taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTaperedDose_validateTaperedDoseTaperedDosingSubstanceAdministration(
				taperedDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTaperedDose_validateTaperedDoseTemplateId(taperedDose, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTaperedDoseTaperedDosingSubstanceAdministration constraint of '<em>Tapered Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaperedDose_validateTaperedDoseTaperedDosingSubstanceAdministration(TaperedDose taperedDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return taperedDose.validateTaperedDoseTaperedDosingSubstanceAdministration(diagnostics, context);
	}

	/**
	 * Validates the validateTaperedDoseTemplateId constraint of '<em>Tapered Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaperedDose_validateTaperedDoseTemplateId(TaperedDose taperedDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return taperedDose.validateTaperedDoseTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplitDose(SplitDose splitDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(splitDose, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasDosing(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationDosingRelationship(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasDescriptionNoMedNotKnown(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationReasonClassMood(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasProductEntry(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasIntructionsInversion(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationProductStrength(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationProductName(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationPreconditionReference(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasSupplyEntryInversion(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasFillNumber(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationTemplateId(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationApproachSiteCode(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationDoseQuantity(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationRateQuantity(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationCode(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationStatusCode(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationEffectiveTime(splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSplitDose_validateSplitDoseSplitDosingSubstanceAdministration(
				splitDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSplitDose_validateSplitDoseTemplateId(splitDose, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSplitDoseSplitDosingSubstanceAdministration constraint of '<em>Split Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplitDose_validateSplitDoseSplitDosingSubstanceAdministration(SplitDose splitDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return splitDose.validateSplitDoseSplitDosingSubstanceAdministration(diagnostics, context);
	}

	/**
	 * Validates the validateSplitDoseTemplateId constraint of '<em>Split Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplitDose_validateSplitDoseTemplateId(SplitDose splitDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return splitDose.validateSplitDoseTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDose(ConditionalDose conditionalDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conditionalDose, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasDosing(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationDosingRelationship(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasDescriptionNoMedNotKnown(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationReasonClassMood(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasProductEntry(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasIntructionsInversion(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationProductStrength(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationProductName(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationPreconditionReference(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasSupplyEntryInversion(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasFillNumber(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationTemplateId(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationApproachSiteCode(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationDoseQuantity(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationRateQuantity(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationCode(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationStatusCode(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationEffectiveTime(conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConditionalDose_validateConditionalDoseConditionalDosingSubstanceAdministration(
				conditionalDose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConditionalDose_validateConditionalDoseTemplateId(conditionalDose, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConditionalDoseConditionalDosingSubstanceAdministration constraint of '<em>Conditional Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDose_validateConditionalDoseConditionalDosingSubstanceAdministration(
			ConditionalDose conditionalDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionalDose.validateConditionalDoseConditionalDosingSubstanceAdministration(diagnostics, context);
	}

	/**
	 * Validates the validateConditionalDoseTemplateId constraint of '<em>Conditional Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDose_validateConditionalDoseTemplateId(ConditionalDose conditionalDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionalDose.validateConditionalDoseTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationMedication(CombinationMedication combinationMedication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(combinationMedication, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasDosing(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationDosingRelationship(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasDescriptionNoMedNotKnown(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationReasonClassMood(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasProductEntry(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasIntructionsInversion(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationProductStrength(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationProductName(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationPreconditionReference(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasSupplyEntryInversion(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationHasFillNumber(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationTemplateId(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationApproachSiteCode(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationDoseQuantity(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationRateQuantity(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationCode(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationStatusCode(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedication_validateMedicationEffectiveTime(combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCombinationMedication_validateCombinationMedicationSubstanceAdministration(
				combinationMedication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCombinationMedication_validateCombinationMedicationTemplateId(
				combinationMedication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCombinationMedicationSubstanceAdministration constraint of '<em>Combination Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationMedication_validateCombinationMedicationSubstanceAdministration(
			CombinationMedication combinationMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return combinationMedication.validateCombinationMedicationSubstanceAdministration(diagnostics, context);
	}

	/**
	 * Validates the validateCombinationMedicationTemplateId constraint of '<em>Combination Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationMedication_validateCombinationMedicationTemplateId(
			CombinationMedication combinationMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return combinationMedication.validateCombinationMedicationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vitalSignsSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionTemplateId(
				vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionCode(
				vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionTitle(
				vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionText(
				vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionVitalSignsOrganizer(
				vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVitalSignsSection_validateIHEVitalSignsSectionTemplateId(
				vitalSignsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHEVitalSignsSectionTemplateId constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateIHEVitalSignsSectionTemplateId(
			VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateIHEVitalSignsSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedVitalSignsSection(CodedVitalSignsSection codedVitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(codedVitalSignsSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionTemplateId(
				codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionCode(
				codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionTitle(
				codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionText(
				codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionVitalSignsOrganizer(
				codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVitalSignsSection_validateIHEVitalSignsSectionTemplateId(
				codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCodedVitalSignsSection_validateCodedVitalSignsSectionTemplateId(
				codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCodedVitalSignsSection_validateCodedVitalSignsSectionVitalSignsOrganizer(
				codedVitalSignsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCodedVitalSignsSectionTemplateId constraint of '<em>Coded Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedVitalSignsSection_validateCodedVitalSignsSectionTemplateId(
			CodedVitalSignsSection codedVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedVitalSignsSection.validateCodedVitalSignsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCodedVitalSignsSectionVitalSignsOrganizer constraint of '<em>Coded Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedVitalSignsSection_validateCodedVitalSignsSectionVitalSignsOrganizer(
			CodedVitalSignsSection codedVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedVitalSignsSection.validateCodedVitalSignsSectionVitalSignsOrganizer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vitalSignsOrganizer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(
				vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(
				vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateVitalSignsOrganizer_validateResultOrganizerTemplateId(
				vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(
				vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(
				vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVitalSignsOrganizer_validateResultOrganizerCode(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVitalSignsOrganizer_validateResultOrganizerStatusCode(
				vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(
				vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateVitalSignsOrganizer_validateVitalSignsOrganizerInformationSource(
				vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID(
				vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerTemplateId(
				vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerClassCode(
				vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerEffectiveTime(
				vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerId(
				vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerVitalSignObservation(
				vitalSignsOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID(
			VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID(diagnostics, context);
	}

	/**
	 * Validates the validateIHEVitalSignsOrganizerTemplateId constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerTemplateId(
			VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateIHEVitalSignsOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateIHEVitalSignsOrganizerClassCode constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerClassCode(
			VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateIHEVitalSignsOrganizerClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateIHEVitalSignsOrganizerEffectiveTime constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerEffectiveTime(
			VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateIHEVitalSignsOrganizerEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateIHEVitalSignsOrganizerId constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerId(
			VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateIHEVitalSignsOrganizerId(diagnostics, context);
	}

	/**
	 * Validates the validateIHEVitalSignsOrganizerVitalSignObservation constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerVitalSignObservation(
			VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateIHEVitalSignsOrganizerVitalSignObservation(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerCode constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateResultOrganizerCode(VitalSignsOrganizer vitalSignsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateResultOrganizerCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerStatusCode constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateResultOrganizerStatusCode(
			VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateResultOrganizerStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation(VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vitalSignObservation, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateResultObservation_validateResultObservationTemplateId(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateResultObservation_validateResultObservationId(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateResultObservation_validateResultObservationStatusCode(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVitalSignObservation_validateResultObservationCode(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateResultObservation_validateResultObservationValue(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSimpleObservation_validateSimpleObservationTemplateId(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSimpleObservation_validateSimpleObservationId(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSimpleObservation_validateSimpleObservationStatusCode(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVitalSignObservation_validateVitalSignObservationTemplateId(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVitalSignObservation_validateVitalSignObservationInterpretationCode(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVitalSignObservation_validateVitalSignObservationMethodCode(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVitalSignObservation_validateVitalSignObservationTargetSiteCode(
				vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVitalSignObservation_validateVitalSignObservationValue(
				vitalSignObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVitalSignObservationTemplateId constraint of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation_validateVitalSignObservationTemplateId(
			VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignObservation.validateVitalSignObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignObservationInterpretationCode constraint of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation_validateVitalSignObservationInterpretationCode(
			VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignObservation.validateVitalSignObservationInterpretationCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignObservationMethodCode constraint of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation_validateVitalSignObservationMethodCode(
			VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignObservation.validateVitalSignObservationMethodCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignObservationTargetSiteCode constraint of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation_validateVitalSignObservationTargetSiteCode(
			VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignObservation.validateVitalSignObservationTargetSiteCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignObservationValue constraint of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation_validateVitalSignObservationValue(
			VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignObservation.validateVitalSignObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationCode constraint of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation_validateResultObservationCode(
			VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignObservation.validateResultObservationCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleObservation(SimpleObservation simpleObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(simpleObservation, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(simpleObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(simpleObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(simpleObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(simpleObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(simpleObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(simpleObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(simpleObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSimpleObservation_validateSimpleObservationTemplateId(
				simpleObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSimpleObservation_validateSimpleObservationId(simpleObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSimpleObservation_validateSimpleObservationStatusCode(
				simpleObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSimpleObservationTemplateId constraint of '<em>Simple Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleObservation_validateSimpleObservationTemplateId(SimpleObservation simpleObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return simpleObservation.validateSimpleObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSimpleObservationId constraint of '<em>Simple Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleObservation_validateSimpleObservationId(SimpleObservation simpleObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return simpleObservation.validateSimpleObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateSimpleObservationStatusCode constraint of '<em>Simple Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleObservation_validateSimpleObservationStatusCode(SimpleObservation simpleObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return simpleObservation.validateSimpleObservationStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection(PayersSection payersSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(payersSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(payersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(payersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(payersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(payersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(payersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(payersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(payersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(payersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(payersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePayersSection_validatePayersSectionTemplateId(
				payersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePayersSection_validatePayersSectionCode(payersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePayersSection_validatePayersSectionTitle(payersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePayersSection_validatePayersSectionText(payersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePayersSection_validatePayersSectionCoverageActivity(
				payersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePayersSection_validateIHEPayersSectionTemplateId(payersSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePayersSection_validateIHEPayersSectionCoverageEntry(payersSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHEPayersSectionTemplateId constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validateIHEPayersSectionTemplateId(PayersSection payersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validateIHEPayersSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateIHEPayersSectionCoverageEntry constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validateIHEPayersSectionCoverageEntry(PayersSection payersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validateIHEPayersSectionCoverageEntry(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageEntry(CoverageEntry coverageEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coverageEntry, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(coverageEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(coverageEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(coverageEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(coverageEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(coverageEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(coverageEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(coverageEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivityInformationSource(
				coverageEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivitySequenceNumber(
				coverageEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivityTemplateId(
				coverageEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivityClassCode(
				coverageEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivityMoodCode(
				coverageEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivityId(
				coverageEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivityStatusCode(
				coverageEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivityCode(
				coverageEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateCoverageActivity_validateCoverageActivityPolicyActivity(
				coverageEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCoverageEntry_validateCoverageEntryTemplateId(coverageEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCoverageEntryTemplateId constraint of '<em>Coverage Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageEntry_validateCoverageEntryTemplateId(CoverageEntry coverageEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageEntry.validateCoverageEntryTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPastIllnessSection(HistoryOfPastIllnessSection historyOfPastIllnessSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(historyOfPastIllnessSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHistoryOfPastIllnessSection_validateHistoryOfPastIllnessSectionTemplateId(
				historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHistoryOfPastIllnessSection_validateHistoryOfPastIllnessSectionCode(
				historyOfPastIllnessSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHistoryOfPastIllnessSectionTemplateId constraint of '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPastIllnessSection_validateHistoryOfPastIllnessSectionTemplateId(
			HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return historyOfPastIllnessSection.validateHistoryOfPastIllnessSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryOfPastIllnessSectionCode constraint of '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPastIllnessSection_validateHistoryOfPastIllnessSectionCode(
			HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return historyOfPastIllnessSection.validateHistoryOfPastIllnessSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSection(ChiefComplaintSection chiefComplaintSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(chiefComplaintSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateChiefComplaintSection_validateChiefComplaintSectionTemplateId(
				chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateChiefComplaintSection_validateChiefComplaintSectionCode(
				chiefComplaintSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateChiefComplaintSectionTemplateId constraint of '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSection_validateChiefComplaintSectionTemplateId(
			ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chiefComplaintSection.validateChiefComplaintSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateChiefComplaintSectionCode constraint of '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSection_validateChiefComplaintSectionCode(
			ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chiefComplaintSection.validateChiefComplaintSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection(ReasonForReferralSection reasonForReferralSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reasonForReferralSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateReasonForReferralSection_validateReasonForReferralSectionTemplateId(
				reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateReasonForReferralSection_validateReasonForReferralSectionCode(
				reasonForReferralSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateReasonForReferralSectionTemplateId constraint of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection_validateReasonForReferralSectionTemplateId(
			ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reasonForReferralSection.validateReasonForReferralSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateReasonForReferralSectionCode constraint of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection_validateReasonForReferralSectionCode(
			ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reasonForReferralSection.validateReasonForReferralSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllness(HistoryOfPresentIllness historyOfPresentIllness,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(historyOfPresentIllness, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessTemplateId(
				historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessCode(
				historyOfPresentIllness, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHistoryOfPresentIllnessTemplateId constraint of '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessTemplateId(
			HistoryOfPresentIllness historyOfPresentIllness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyOfPresentIllness.validateHistoryOfPresentIllnessTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryOfPresentIllnessCode constraint of '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessCode(
			HistoryOfPresentIllness historyOfPresentIllness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyOfPresentIllness.validateHistoryOfPresentIllnessCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesSection(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(surgeriesSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProceduresSection_validateProceduresSectionTemplateId(
				surgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProceduresSection_validateProceduresSectionCode(
				surgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProceduresSection_validateProceduresSectionTitle(
				surgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProceduresSection_validateProceduresSectionText(
				surgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSurgeriesSection_validateSurgeriesSectionTemplateId(
				surgeriesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSurgeriesSectionTemplateId constraint of '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesSection_validateSurgeriesSectionTemplateId(SurgeriesSection surgeriesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return surgeriesSection.validateSurgeriesSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedSurgeriesSection(CodedSurgeriesSection codedSurgeriesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(codedSurgeriesSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProceduresSection_validateProceduresSectionTemplateId(
				codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProceduresSection_validateProceduresSectionCode(
				codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProceduresSection_validateProceduresSectionTitle(
				codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProceduresSection_validateProceduresSectionText(
				codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSurgeriesSection_validateSurgeriesSectionTemplateId(
				codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCodedSurgeriesSection_validateCodedSurgeriesSectionTemplateId(
				codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCodedSurgeriesSection_validateCodedSurgeriesSectionExternalReference(
				codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCodedSurgeriesSection_validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure(
				codedSurgeriesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCodedSurgeriesSectionTemplateId constraint of '<em>Coded Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedSurgeriesSection_validateCodedSurgeriesSectionTemplateId(
			CodedSurgeriesSection codedSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedSurgeriesSection.validateCodedSurgeriesSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCodedSurgeriesSectionExternalReference constraint of '<em>Coded Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedSurgeriesSection_validateCodedSurgeriesSectionExternalReference(
			CodedSurgeriesSection codedSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedSurgeriesSection.validateCodedSurgeriesSectionExternalReference(diagnostics, context);
	}

	/**
	 * Validates the validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure constraint of '<em>Coded Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedSurgeriesSection_validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure(
			CodedSurgeriesSection codedSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedSurgeriesSection.validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference(ExternalReference externalReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalReference, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(externalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(externalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(externalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(externalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(externalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(externalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(externalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateExternalReference_validateExternalReferenceHasNoCode(
				externalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateExternalReference_validateExternalReferenceHasReference(
				externalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateExternalReference_validateExternalReferenceHasReferenceExternalDocument(
				externalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateExternalReference_validateExternalReferenceHasReferenceExternalDocumentID(
				externalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateExternalReference_validateExternalReferenceHasReferenceExternalDocumentText(
				externalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateExternalReference_validateExternalReferenceTemplateId(
				externalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateExternalReference_validateExternalReferenceClassCode(
				externalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateExternalReference_validateExternalReferenceMoodCode(
				externalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateExternalReference_validateExternalReferenceId(externalReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateExternalReference_validateExternalReferenceText(externalReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateExternalReferenceHasNoCode constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_validateExternalReferenceHasNoCode(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReference.validateExternalReferenceHasNoCode(diagnostics, context);
	}

	/**
	 * Validates the validateExternalReferenceHasReference constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_validateExternalReferenceHasReference(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReference.validateExternalReferenceHasReference(diagnostics, context);
	}

	/**
	 * Validates the validateExternalReferenceHasReferenceExternalDocument constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_validateExternalReferenceHasReferenceExternalDocument(
			ExternalReference externalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReference.validateExternalReferenceHasReferenceExternalDocument(diagnostics, context);
	}

	/**
	 * Validates the validateExternalReferenceHasReferenceExternalDocumentID constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_validateExternalReferenceHasReferenceExternalDocumentID(
			ExternalReference externalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReference.validateExternalReferenceHasReferenceExternalDocumentID(diagnostics, context);
	}

	/**
	 * Validates the validateExternalReferenceHasReferenceExternalDocumentText constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_validateExternalReferenceHasReferenceExternalDocumentText(
			ExternalReference externalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReference.validateExternalReferenceHasReferenceExternalDocumentText(diagnostics, context);
	}

	/**
	 * Validates the validateExternalReferenceTemplateId constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_validateExternalReferenceTemplateId(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReference.validateExternalReferenceTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateExternalReferenceClassCode constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_validateExternalReferenceClassCode(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReference.validateExternalReferenceClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateExternalReferenceMoodCode constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_validateExternalReferenceMoodCode(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReference.validateExternalReferenceMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateExternalReferenceId constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_validateExternalReferenceId(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReference.validateExternalReferenceId(diagnostics, context);
	}

	/**
	 * Validates the validateExternalReferenceText constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_validateExternalReferenceText(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReference.validateExternalReferenceText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedure(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(procedureEntryProcedureActivityProcedure, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
			procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureTemplateId(
				procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureMoodCode(
				procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureHasTextReference(
				procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedurePriorityCode(
				procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(
				procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureTemplateId(
				procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureClassCode(
				procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureText(
				procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureApproachSiteCode(
				procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureInternalReference(
				procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(
				procedureEntryProcedureActivityProcedure, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProcedureEntryProcedureActivityProcedureMoodCode constraint of '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureMoodCode(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureEntryProcedureActivityProcedure.validateProcedureEntryProcedureActivityProcedureMoodCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateProcedureEntryProcedureActivityProcedureHasTextReference constraint of '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureHasTextReference(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureEntryProcedureActivityProcedure.validateProcedureEntryProcedureActivityProcedureHasTextReference(
			diagnostics, context);
	}

	/**
	 * Validates the validateProcedureEntryProcedureActivityProcedurePriorityCode constraint of '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedurePriorityCode(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureEntryProcedureActivityProcedure.validateProcedureEntryProcedureActivityProcedurePriorityCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter constraint of '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureEntryProcedureActivityProcedure.validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(
			diagnostics, context);
	}

	/**
	 * Validates the validateProcedureEntryProcedureActivityProcedureTemplateId constraint of '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureTemplateId(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureEntryProcedureActivityProcedure.validateProcedureEntryProcedureActivityProcedureTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateProcedureEntryProcedureActivityProcedureClassCode constraint of '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureClassCode(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureEntryProcedureActivityProcedure.validateProcedureEntryProcedureActivityProcedureClassCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateProcedureEntryProcedureActivityProcedureText constraint of '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureText(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureEntryProcedureActivityProcedure.validateProcedureEntryProcedureActivityProcedureText(
			diagnostics, context);
	}

	/**
	 * Validates the validateProcedureEntryProcedureActivityProcedureApproachSiteCode constraint of '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureApproachSiteCode(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureEntryProcedureActivityProcedure.validateProcedureEntryProcedureActivityProcedureApproachSiteCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateProcedureEntryProcedureActivityProcedureInternalReference constraint of '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureInternalReference(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureEntryProcedureActivityProcedure.validateProcedureEntryProcedureActivityProcedureInternalReference(
			diagnostics, context);
	}

	/**
	 * Validates the validateProcedureEntryProcedureActivityProcedureInternalReferenceReason constraint of '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureEntryProcedureActivityProcedure.validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntry(ProcedureEntry procedureEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSection(
			HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hospitalAdmissionDiagnosisSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
				hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
				hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionTemplateId(
				hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionCode(
				hospitalAdmissionDiagnosisSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHospitalAdmissionDiagnosisSectionTemplateId constraint of '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionTemplateId(
			HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return hospitalAdmissionDiagnosisSection.validateHospitalAdmissionDiagnosisSectionTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateHospitalAdmissionDiagnosisSectionCode constraint of '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionCode(
			HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return hospitalAdmissionDiagnosisSection.validateHospitalAdmissionDiagnosisSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeDiagnosisSection(DischargeDiagnosisSection dischargeDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dischargeDiagnosisSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDischargeDiagnosisSection_validateDischargeDiagnosisSectionTemplateId(
				dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDischargeDiagnosisSection_validateDischargeDiagnosisSectionCode(
				dischargeDiagnosisSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDischargeDiagnosisSectionTemplateId constraint of '<em>Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeDiagnosisSection_validateDischargeDiagnosisSectionTemplateId(
			DischargeDiagnosisSection dischargeDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return dischargeDiagnosisSection.validateDischargeDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeDiagnosisSectionCode constraint of '<em>Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeDiagnosisSection_validateDischargeDiagnosisSectionCode(
			DischargeDiagnosisSection dischargeDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return dischargeDiagnosisSection.validateDischargeDiagnosisSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmissionMedicationHistorySection(
			AdmissionMedicationHistorySection admissionMedicationHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(admissionMedicationHistorySection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
				admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
				admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAdmissionMedicationHistorySection_validateAdmissionMedicationHistorySectionTemplateId(
				admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAdmissionMedicationHistorySection_validateAdmissionMedicationHistorySectionCode(
				admissionMedicationHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAdmissionMedicationHistorySectionTemplateId constraint of '<em>Admission Medication History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmissionMedicationHistorySection_validateAdmissionMedicationHistorySectionTemplateId(
			AdmissionMedicationHistorySection admissionMedicationHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return admissionMedicationHistorySection.validateAdmissionMedicationHistorySectionTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateAdmissionMedicationHistorySectionCode constraint of '<em>Admission Medication History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmissionMedicationHistorySection_validateAdmissionMedicationHistorySectionCode(
			AdmissionMedicationHistorySection admissionMedicationHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return admissionMedicationHistorySection.validateAdmissionMedicationHistorySectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSection(
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hospitalDischargeMedicationsSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
				hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(
				hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionTemplateId(
				hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionCode(
				hospitalDischargeMedicationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHospitalDischargeMedicationsSectionTemplateId constraint of '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionTemplateId(
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return hospitalDischargeMedicationsSection.validateHospitalDischargeMedicationsSectionTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateHospitalDischargeMedicationsSectionCode constraint of '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionCode(
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return hospitalDischargeMedicationsSection.validateHospitalDischargeMedicationsSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedAdvanceDirectivesSection(CodedAdvanceDirectivesSection codedAdvanceDirectivesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(codedAdvanceDirectivesSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(
				codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTemplateId(
				codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionCode(
				codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTitle(
				codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionAdvanceDirectiveObservation(
				codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAdvanceDirectivesSection_validateIHEAdvanceDirectivesSectionTemplateId(
				codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCodedAdvanceDirectivesSection_validateCodedAdvanceDirectivesSectionTemplateId(
				codedAdvanceDirectivesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCodedAdvanceDirectivesSectionTemplateId constraint of '<em>Coded Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedAdvanceDirectivesSection_validateCodedAdvanceDirectivesSectionTemplateId(
			CodedAdvanceDirectivesSection codedAdvanceDirectivesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return codedAdvanceDirectivesSection.validateCodedAdvanceDirectivesSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection(AdvanceDirectivesSection advanceDirectivesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(advanceDirectivesSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTemplateId(
				advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionCode(
				advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTitle(
				advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionAdvanceDirectiveObservation(
				advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAdvanceDirectivesSection_validateIHEAdvanceDirectivesSectionTemplateId(
				advanceDirectivesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHEAdvanceDirectivesSectionTemplateId constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_validateIHEAdvanceDirectivesSectionTemplateId(
			AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectivesSection.validateIHEAdvanceDirectivesSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamNarrativeSection(PhysicalExamNarrativeSection physicalExamNarrativeSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(physicalExamNarrativeSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionTemplateId(
				physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionCode(
				physicalExamNarrativeSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePhysicalExamNarrativeSectionTemplateId constraint of '<em>Physical Exam Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionTemplateId(
			PhysicalExamNarrativeSection physicalExamNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return physicalExamNarrativeSection.validatePhysicalExamNarrativeSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePhysicalExamNarrativeSectionCode constraint of '<em>Physical Exam Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionCode(
			PhysicalExamNarrativeSection physicalExamNarrativeSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return physicalExamNarrativeSection.validatePhysicalExamNarrativeSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection(PhysicalExamSection physicalExamSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(physicalExamSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionTemplateId(
				physicalExamSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionCode(
				physicalExamSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePhysicalExamSection_validatePhysicalExamSectionTemplateId(
				physicalExamSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePhysicalExamSectionTemplateId constraint of '<em>Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection_validatePhysicalExamSectionTemplateId(
			PhysicalExamSection physicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return physicalExamSection.validatePhysicalExamSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReviewOfSystemsSection(ReviewOfSystemsSection reviewOfSystemsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reviewOfSystemsSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateReviewOfSystemsSection_validateReviewOfSystemsSectionTemplateId(
				reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateReviewOfSystemsSection_validateReviewOfSystemsSectionCode(
				reviewOfSystemsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateReviewOfSystemsSectionTemplateId constraint of '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReviewOfSystemsSection_validateReviewOfSystemsSectionTemplateId(
			ReviewOfSystemsSection reviewOfSystemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reviewOfSystemsSection.validateReviewOfSystemsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateReviewOfSystemsSectionCode constraint of '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReviewOfSystemsSection_validateReviewOfSystemsSectionCode(
			ReviewOfSystemsSection reviewOfSystemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reviewOfSystemsSection.validateReviewOfSystemsSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalCourseSection(HospitalCourseSection hospitalCourseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hospitalCourseSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHospitalCourseSection_validateHospitalCourseSectionTemplateId(
				hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHospitalCourseSection_validateHospitalCourseSectionCode(
				hospitalCourseSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHospitalCourseSectionTemplateId constraint of '<em>Hospital Course Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalCourseSection_validateHospitalCourseSectionTemplateId(
			HospitalCourseSection hospitalCourseSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalCourseSection.validateHospitalCourseSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHospitalCourseSectionCode constraint of '<em>Hospital Course Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalCourseSection_validateHospitalCourseSectionCode(
			HospitalCourseSection hospitalCourseSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalCourseSection.validateHospitalCourseSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedResultsSection(CodedResultsSection codedResultsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(codedResultsSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCodedResultsSection_validateCodedResultsSectionTemplateId(
				codedResultsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCodedResultsSection_validateCodedResultsSectionCode(
				codedResultsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCodedResultsSection_validateCodedResultsSectionExternalReference(
				codedResultsSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCodedResultsSection_validateCodedResultsSectionSimpleObservation(
				codedResultsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCodedResultsSectionTemplateId constraint of '<em>Coded Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedResultsSection_validateCodedResultsSectionTemplateId(
			CodedResultsSection codedResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedResultsSection.validateCodedResultsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCodedResultsSectionCode constraint of '<em>Coded Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedResultsSection_validateCodedResultsSectionCode(CodedResultsSection codedResultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedResultsSection.validateCodedResultsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateCodedResultsSectionExternalReference constraint of '<em>Coded Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedResultsSection_validateCodedResultsSectionExternalReference(
			CodedResultsSection codedResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedResultsSection.validateCodedResultsSectionExternalReference(diagnostics, context);
	}

	/**
	 * Validates the validateCodedResultsSectionSimpleObservation constraint of '<em>Coded Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedResultsSection_validateCodedResultsSectionSimpleObservation(
			CodedResultsSection codedResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedResultsSection.validateCodedResultsSectionSimpleObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection(AssessmentAndPlanSection assessmentAndPlanSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assessmentAndPlanSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(
				assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(
				assessmentAndPlanSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAssessmentAndPlanSectionTemplateId constraint of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(
			AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentAndPlanSection.validateAssessmentAndPlanSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAssessmentAndPlanSectionCode constraint of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(
			AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentAndPlanSection.validateAssessmentAndPlanSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanSection(CarePlanSection carePlanSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(carePlanSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionTemplateId(
				carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionCode(
				carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionTitle(
				carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionText(
				carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityAct(
				carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityEncounter(
				carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityObservation(
				carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityProcedure(
				carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(
				carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySupply(
				carePlanSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCarePlanSection_validateCarePlanSectionTemplateId(carePlanSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCarePlanSectionTemplateId constraint of '<em>Care Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanSection_validateCarePlanSectionTemplateId(CarePlanSection carePlanSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return carePlanSection.validateCarePlanSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyMedicalHistorySection(FamilyMedicalHistorySection familyMedicalHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(familyMedicalHistorySection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateFamilyHistorySection_validateFamilyHistorySectionTemplateId(
				familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateFamilyHistorySection_validateFamilyHistorySectionCode(
				familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateFamilyHistorySection_validateFamilyHistorySectionTitle(
				familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFamilyMedicalHistorySection_validateFamilyMedicalHistorySectionTemplateId(
				familyMedicalHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateFamilyMedicalHistorySectionTemplateId constraint of '<em>Family Medical History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyMedicalHistorySection_validateFamilyMedicalHistorySectionTemplateId(
			FamilyMedicalHistorySection familyMedicalHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return familyMedicalHistorySection.validateFamilyMedicalHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(socialHistorySection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTemplateId(
				socialHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionCode(
				socialHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTitle(
				socialHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSocialHistorySection_validateIHESocialHistorySectionTemplateId(
				socialHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHESocialHistorySectionTemplateId constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateIHESocialHistorySectionTemplateId(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateIHESocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterHistorySection(EncounterHistorySection encounterHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encounterHistorySection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateEncountersSection_validateEncountersSectionTemplateId(
				encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateEncountersSection_validateEncountersSectionCode(
				encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateEncountersSection_validateEncountersSectionTitle(
				encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterHistorySection_validateEncounterHistorySectionTemplateId(
				encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterHistorySection_validateEncounterHistorySectionEncounterEntry(
				encounterHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEncounterHistorySectionTemplateId constraint of '<em>Encounter History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterHistorySection_validateEncounterHistorySectionTemplateId(
			EncounterHistorySection encounterHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterHistorySection.validateEncounterHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateEncounterHistorySectionEncounterEntry constraint of '<em>Encounter History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterHistorySection_validateEncounterHistorySectionEncounterEntry(
			EncounterHistorySection encounterHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterHistorySection.validateEncounterHistorySectionEncounterEntry(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterEntry(EncounterEntry encounterEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encounterEntry, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(encounterEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(encounterEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(encounterEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(encounterEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(encounterEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(encounterEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(encounterEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterEntry_validateEncounterEntryTemplateId(encounterEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterEntry_validateEncounterEntryClassCode(encounterEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterEntry_validateEncounterEntryCode(encounterEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterEntry_validateEncounterEntryId(encounterEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterEntry_validateEncounterEntryText(encounterEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEncounterEntryTemplateId constraint of '<em>Encounter Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterEntry_validateEncounterEntryTemplateId(EncounterEntry encounterEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterEntry.validateEncounterEntryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateEncounterEntryClassCode constraint of '<em>Encounter Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterEntry_validateEncounterEntryClassCode(EncounterEntry encounterEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterEntry.validateEncounterEntryClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateEncounterEntryCode constraint of '<em>Encounter Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterEntry_validateEncounterEntryCode(EncounterEntry encounterEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterEntry.validateEncounterEntryCode(diagnostics, context);
	}

	/**
	 * Validates the validateEncounterEntryId constraint of '<em>Encounter Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterEntry_validateEncounterEntryId(EncounterEntry encounterEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterEntry.validateEncounterEntryId(diagnostics, context);
	}

	/**
	 * Validates the validateEncounterEntryText constraint of '<em>Encounter Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterEntry_validateEncounterEntryText(EncounterEntry encounterEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterEntry.validateEncounterEntryText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalDevicesSection(MedicalDevicesSection medicalDevicesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicalDevicesSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionTemplateId(
				medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionCode(
				medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionTitle(
				medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalDevicesSection_validateMedicalDevicesSectionTemplateId(
				medicalDevicesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicalDevicesSectionTemplateId constraint of '<em>Medical Devices Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalDevicesSection_validateMedicalDevicesSectionTemplateId(
			MedicalDevicesSection medicalDevicesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalDevicesSection.validateMedicalDevicesSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageCommunication(LanguageCommunication languageCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(languageCommunication, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(languageCommunication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(languageCommunication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(languageCommunication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(languageCommunication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(languageCommunication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(languageCommunication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(languageCommunication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLanguageCommunication_validateIHELanguageCommunicationTemplateId(
				languageCommunication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHELanguageCommunicationTemplateId constraint of '<em>Language Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageCommunication_validateIHELanguageCommunicationTemplateId(
			LanguageCommunication languageCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return languageCommunication.validateIHELanguageCommunicationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSummary(MedicalSummary medicalSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicalSummary, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateClassCode(medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateGeneralHeaderConstraintsCode(medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalDocument_validateMedicalDocumentTemplateId(medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateMedicalSummaryProblemConcernEntry(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateMedicalSummaryAllergyConcernEntry(
				medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateMedicalSummaryMedications(medicalSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateMedicalSummaryTemplateId(medicalSummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicalSummaryProblemConcernEntry constraint of '<em>Medical Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSummary_validateMedicalSummaryProblemConcernEntry(MedicalSummary medicalSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalSummary.validateMedicalSummaryProblemConcernEntry(diagnostics, context);
	}

	/**
	 * Validates the validateMedicalSummaryAllergyConcernEntry constraint of '<em>Medical Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSummary_validateMedicalSummaryAllergyConcernEntry(MedicalSummary medicalSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalSummary.validateMedicalSummaryAllergyConcernEntry(diagnostics, context);
	}

	/**
	 * Validates the validateMedicalSummaryMedications constraint of '<em>Medical Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSummary_validateMedicalSummaryMedications(MedicalSummary medicalSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalSummary.validateMedicalSummaryMedications(diagnostics, context);
	}

	/**
	 * Validates the validateMedicalSummaryTemplateId constraint of '<em>Medical Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSummary_validateMedicalSummaryTemplateId(MedicalSummary medicalSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalSummary.validateMedicalSummaryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsCode constraint of '<em>Medical Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSummary_validateGeneralHeaderConstraintsCode(MedicalSummary medicalSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalSummary.validateGeneralHeaderConstraintsCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary(DischargeSummary dischargeSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dischargeSummary, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateClassCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDischargeSummary_validateGeneralHeaderConstraintsCode(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalDocument_validateMedicalDocumentTemplateId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateMedicalSummaryProblemConcernEntry(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateMedicalSummaryAllergyConcernEntry(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateMedicalSummaryMedications(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateMedicalSummaryTemplateId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDischargeSummary_validateDischargeSummaryTemplateId(
				dischargeSummary, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDischargeSummary_validateDischargeSummaryActiveProblemsSection(
				dischargeSummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDischargeSummaryTemplateId constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryTemplateId(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryActiveProblemsSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryActiveProblemsSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryActiveProblemsSection(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsCode constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateGeneralHeaderConstraintsCode(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateGeneralHeaderConstraintsCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareProvidersPharmacies(HealthcareProvidersPharmacies healthcareProvidersPharmacies,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(healthcareProvidersPharmacies, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(healthcareProvidersPharmacies, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(healthcareProvidersPharmacies, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(healthcareProvidersPharmacies, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(healthcareProvidersPharmacies, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(healthcareProvidersPharmacies, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(healthcareProvidersPharmacies, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(healthcareProvidersPharmacies, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHealthcareProvidersPharmacies_validateHealthcareProvidersPharmaciesTemplateId(
				healthcareProvidersPharmacies, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHealthcareProvidersPharmaciesTemplateId constraint of '<em>Healthcare Providers Pharmacies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareProvidersPharmacies_validateHealthcareProvidersPharmaciesTemplateId(
			HealthcareProvidersPharmacies healthcareProvidersPharmacies, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return healthcareProvidersPharmacies.validateHealthcareProvidersPharmaciesTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRequestEntry(ObservationRequestEntry observationRequestEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(observationRequestEntry, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationMoodCodeValue(
				observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationTemplateId(
				observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationId(
				observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationMoodCode(
				observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateObservationRequestEntry_validateObservationRequestEntryTemplateId(
				observationRequestEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateObservationRequestEntryTemplateId constraint of '<em>Observation Request Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRequestEntry_validateObservationRequestEntryTemplateId(
			ObservationRequestEntry observationRequestEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return observationRequestEntry.validateObservationRequestEntryTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductEntry(ProductEntry productEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(productEntry, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(productEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(productEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(productEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(productEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(productEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(productEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(productEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateManufacturedProduct_validateManufacturedDrugOrOtherMaterial(
				productEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateManufacturedProduct_validateClassCode(productEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProduct_validateProductHasMaterial(productEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProduct_validateProductHasMaterialCode(productEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProduct_validateProductHasMaterialCodeOriginalText(
				productEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProduct_validateProductHasMaterialName(productEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProduct_validateProductTemplateId(productEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateProduct_validateProductId(productEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProductEntry_validateProductEntryTemplateId(productEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProductEntryTemplateId constraint of '<em>Product Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductEntry_validateProductEntryTemplateId(ProductEntry productEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return productEntry.validateProductEntryTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryPlanOfCareActivityProcedure(
			ProcedureEntryPlanOfCareActivityProcedure procedureEntryPlanOfCareActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(procedureEntryPlanOfCareActivityProcedure, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(
			procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(
				procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureMoodCodeValue(
				procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureTemplateId(
				procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureId(
				procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureMoodCode(
				procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProcedureEntryPlanOfCareActivityProcedure_validateProcedureEntryPlanOfCareActivityProcedureTemplateId(
				procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProcedureEntryPlanOfCareActivityProcedureTemplateId constraint of '<em>Procedure Entry Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryPlanOfCareActivityProcedure_validateProcedureEntryPlanOfCareActivityProcedureTemplateId(
			ProcedureEntryPlanOfCareActivityProcedure procedureEntryPlanOfCareActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureEntryPlanOfCareActivityProcedure.validateProcedureEntryPlanOfCareActivityProcedureTemplateId(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntry(PayerEntry payerEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(payerEntry, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePolicyActivity_validatePolicyActivityPayerEntityIsRequired(
				payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePolicyActivity_validatePolicyActivityCoveredPartyIsRequired(
				payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePolicyActivity_validatePolicyActivityCoveredPartyTime(
				payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePolicyActivity_validatePolicyActivitySubscriberIsAllowed(
				payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePolicyActivity_validatePolicyActivitySubscriberTime(
				payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePolicyActivity_validatePolicyActivityEntryRelationshipREFR(
				payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePolicyActivity_validatePolicyActivityEntryRelationshipTarget(
				payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePayerEntry_validatePolicyActivityTemplateId(payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePolicyActivity_validatePolicyActivityClassCode(
				payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePolicyActivity_validatePolicyActivityMoodCode(
				payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePolicyActivity_validatePolicyActivityId(payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePolicyActivity_validatePolicyActivityStatusCode(
				payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePolicyActivity_validatePolicyActivityPayerEntity(
				payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePolicyActivity_validatePolicyActivityCoveredParty(
				payerEntry, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePolicyActivity_validatePolicyActivitySubscriber(
				payerEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePolicyActivityTemplateId constraint of '<em>Payer Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntry_validatePolicyActivityTemplateId(PayerEntry payerEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payerEntry.validatePolicyActivityTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePHRExtract(PHRExtract phrExtract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(phrExtract, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateClassCode(phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateGeneralHeaderConstraintsCode(phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(
				phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalDocument_validateMedicalDocumentTemplateId(phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateMedicalSummaryProblemConcernEntry(phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateMedicalSummaryAllergyConcernEntry(phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateMedicalSummaryMedications(phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateMedicalSummaryTemplateId(phrExtract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePHRExtract_validatePHRExtractTemplateId(phrExtract, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePHRExtractTemplateId constraint of '<em>PHR Extract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePHRExtract_validatePHRExtractTemplateId(PHRExtract phrExtract, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return phrExtract.validatePHRExtractTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePHRUpdate(PHRUpdate phrUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(phrUpdate, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateClassCode(phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateGeneralHeaderConstraintsCode(phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(
				phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalDocument_validateMedicalDocumentTemplateId(phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateMedicalSummaryProblemConcernEntry(phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateMedicalSummaryAllergyConcernEntry(phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateMedicalSummaryMedications(phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMedicalSummary_validateMedicalSummaryTemplateId(phrUpdate, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePHRUpdate_validatePHRUpdateTemplateId(phrUpdate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePHRUpdateTemplateId constraint of '<em>PHR Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePHRUpdate_validatePHRUpdateTemplateId(PHRUpdate phrUpdate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return phrUpdate.validatePHRUpdateTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivity(EncounterActivity encounterActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encounterActivity, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(encounterActivity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(encounterActivity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(encounterActivity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(encounterActivity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(encounterActivity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(encounterActivity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(encounterActivity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterEntry_validateEncounterEntryTemplateId(encounterActivity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterEntry_validateEncounterEntryClassCode(encounterActivity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterEntry_validateEncounterEntryCode(encounterActivity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterEntry_validateEncounterEntryId(encounterActivity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterEntry_validateEncounterEntryText(encounterActivity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterActivity_validateEncountersActivityTemplateId(
				encounterActivity, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateEncountersActivity_validateEncountersActivityClassCode(
				encounterActivity, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateEncountersActivity_validateEncountersActivityMoodCode(
				encounterActivity, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateEncountersActivity_validateEncountersActivityId(
				encounterActivity, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validateEncountersActivity_validateEncountersActivityEffectiveTime(
				encounterActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEncountersActivityTemplateId constraint of '<em>Encounter Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivity_validateEncountersActivityTemplateId(EncounterActivity encounterActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterActivity.validateEncountersActivityTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterPlanOfCare(EncounterPlanOfCare encounterPlanOfCare, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encounterPlanOfCare, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(encounterPlanOfCare, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(encounterPlanOfCare, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(encounterPlanOfCare, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(encounterPlanOfCare, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(encounterPlanOfCare, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(encounterPlanOfCare, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(encounterPlanOfCare, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterEntry_validateEncounterEntryTemplateId(encounterPlanOfCare, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterEntry_validateEncounterEntryClassCode(encounterPlanOfCare, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterEntry_validateEncounterEntryCode(encounterPlanOfCare, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterEntry_validateEncounterEntryId(encounterPlanOfCare, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterEntry_validateEncounterEntryText(encounterPlanOfCare, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterMoodCodeValue(
				encounterPlanOfCare, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterPlanOfCare_validatePlanOfCareActivityEncounterTemplateId(
				encounterPlanOfCare, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterId(
				encounterPlanOfCare, diagnostics, context);
		if (result || diagnostics != null)
			result &= ccdValidator.validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterMoodCode(
				encounterPlanOfCare, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEncounterPlanOfCare_validateEncounterPlanOfCareMoodCodeValue(
				encounterPlanOfCare, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEncounterPlanOfCareMoodCodeValue constraint of '<em>Encounter Plan Of Care</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterPlanOfCare_validateEncounterPlanOfCareMoodCodeValue(
			EncounterPlanOfCare encounterPlanOfCare, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterPlanOfCare.validateEncounterPlanOfCareMoodCodeValue(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityEncounterTemplateId constraint of '<em>Encounter Plan Of Care</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterPlanOfCare_validatePlanOfCareActivityEncounterTemplateId(
			EncounterPlanOfCare encounterPlanOfCare, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterPlanOfCare.validatePlanOfCareActivityEncounterTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntakeOutputSection(IntakeOutputSection intakeOutputSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(intakeOutputSection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(intakeOutputSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(intakeOutputSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(intakeOutputSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(intakeOutputSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(intakeOutputSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(intakeOutputSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(intakeOutputSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(intakeOutputSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(intakeOutputSection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntakeOutputSection_validateIntakeOutputSectionTemplateId(
				intakeOutputSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIntakeOutputSectionTemplateId constraint of '<em>Intake Output Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntakeOutputSection_validateIntakeOutputSectionTemplateId(
			IntakeOutputSection intakeOutputSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return intakeOutputSection.validateIntakeOutputSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyHistorySection(PregnancyHistorySection pregnancyHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pregnancyHistorySection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(pregnancyHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(pregnancyHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(pregnancyHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(pregnancyHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(pregnancyHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(pregnancyHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(pregnancyHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateClassCode(pregnancyHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateSection_validateMoodCode(pregnancyHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePregnancyHistorySection_validatePregnancyHistorySectionTemplateId(
				pregnancyHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePregnancyHistorySection_validatePregnancyHistorySectionCode(
				pregnancyHistorySection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePregnancyHistorySection_validatePregnancyHistorySectionPregnancyObservation(
				pregnancyHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePregnancyHistorySectionTemplateId constraint of '<em>Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyHistorySection_validatePregnancyHistorySectionTemplateId(
			PregnancyHistorySection pregnancyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyHistorySection.validatePregnancyHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePregnancyHistorySectionCode constraint of '<em>Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyHistorySection_validatePregnancyHistorySectionCode(
			PregnancyHistorySection pregnancyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyHistorySection.validatePregnancyHistorySectionCode(diagnostics, context);
	}

	/**
	 * Validates the validatePregnancyHistorySectionPregnancyObservation constraint of '<em>Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyHistorySection_validatePregnancyHistorySectionPregnancyObservation(
			PregnancyHistorySection pregnancyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyHistorySection.validatePregnancyHistorySectionPregnancyObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservation(PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pregnancyObservation, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(pregnancyObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(pregnancyObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(pregnancyObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(pregnancyObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(pregnancyObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(pregnancyObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(pregnancyObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePregnancyObservation_validateSimpleObservationTemplateId(
				pregnancyObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSimpleObservation_validateSimpleObservationId(pregnancyObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSimpleObservation_validateSimpleObservationStatusCode(
				pregnancyObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePregnancyObservation_validatePregnancyObservationCode(
				pregnancyObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePregnancyObservation_validatePregnancyObservationInterpretationCode(
				pregnancyObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePregnancyObservation_validatePregnancyObservationMethodCode(
				pregnancyObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePregnancyObservation_validatePregnancyObservationRepeatNumber(
				pregnancyObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePregnancyObservation_validatePregnancyObservationTargetSiteCode(
				pregnancyObservation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePregnancyObservation_validatePregnancyObservationValue(
				pregnancyObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePregnancyObservationCode constraint of '<em>Pregnancy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservation_validatePregnancyObservationCode(
			PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyObservation.validatePregnancyObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validatePregnancyObservationInterpretationCode constraint of '<em>Pregnancy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservation_validatePregnancyObservationInterpretationCode(
			PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyObservation.validatePregnancyObservationInterpretationCode(diagnostics, context);
	}

	/**
	 * Validates the validatePregnancyObservationMethodCode constraint of '<em>Pregnancy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservation_validatePregnancyObservationMethodCode(
			PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyObservation.validatePregnancyObservationMethodCode(diagnostics, context);
	}

	/**
	 * Validates the validatePregnancyObservationRepeatNumber constraint of '<em>Pregnancy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservation_validatePregnancyObservationRepeatNumber(
			PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyObservation.validatePregnancyObservationRepeatNumber(diagnostics, context);
	}

	/**
	 * Validates the validatePregnancyObservationTargetSiteCode constraint of '<em>Pregnancy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservation_validatePregnancyObservationTargetSiteCode(
			PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyObservation.validatePregnancyObservationTargetSiteCode(diagnostics, context);
	}

	/**
	 * Validates the validatePregnancyObservationValue constraint of '<em>Pregnancy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservation_validatePregnancyObservationValue(
			PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyObservation.validatePregnancyObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateSimpleObservationTemplateId constraint of '<em>Pregnancy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservation_validateSimpleObservationTemplateId(
			PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pregnancyObservation.validateSimpleObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContact(PatientContact patientContact, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactGuardian(PatientContactGuardian patientContactGuardian,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(patientContactGuardian, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(patientContactGuardian, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(patientContactGuardian, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(patientContactGuardian, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(patientContactGuardian, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(patientContactGuardian, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(patientContactGuardian, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(patientContactGuardian, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateGuardian_validateGuardianChoice(patientContactGuardian, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateGuardian_validateClassCode(patientContactGuardian, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePatientContactGuardian_validatePatientContactGuardianTemplateId(
				patientContactGuardian, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePatientContactGuardian_validatePatientContactGuardianAddr(
				patientContactGuardian, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePatientContactGuardian_validatePatientContactGuardianClassCode(
				patientContactGuardian, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePatientContactGuardian_validatePatientContactGuardianCode(
				patientContactGuardian, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePatientContactGuardian_validatePatientContactGuardianTelecom(
				patientContactGuardian, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePatientContactGuardianTemplateId constraint of '<em>Patient Contact Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactGuardian_validatePatientContactGuardianTemplateId(
			PatientContactGuardian patientContactGuardian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientContactGuardian.validatePatientContactGuardianTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePatientContactGuardianAddr constraint of '<em>Patient Contact Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactGuardian_validatePatientContactGuardianAddr(
			PatientContactGuardian patientContactGuardian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientContactGuardian.validatePatientContactGuardianAddr(diagnostics, context);
	}

	/**
	 * Validates the validatePatientContactGuardianClassCode constraint of '<em>Patient Contact Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactGuardian_validatePatientContactGuardianClassCode(
			PatientContactGuardian patientContactGuardian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientContactGuardian.validatePatientContactGuardianClassCode(diagnostics, context);
	}

	/**
	 * Validates the validatePatientContactGuardianCode constraint of '<em>Patient Contact Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactGuardian_validatePatientContactGuardianCode(
			PatientContactGuardian patientContactGuardian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientContactGuardian.validatePatientContactGuardianCode(diagnostics, context);
	}

	/**
	 * Validates the validatePatientContactGuardianTelecom constraint of '<em>Patient Contact Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactGuardian_validatePatientContactGuardianTelecom(
			PatientContactGuardian patientContactGuardian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientContactGuardian.validatePatientContactGuardianTelecom(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactParticipant(PatientContactParticipant patientContactParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(patientContactParticipant, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(patientContactParticipant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(patientContactParticipant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(patientContactParticipant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(patientContactParticipant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(patientContactParticipant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(patientContactParticipant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(patientContactParticipant, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateParticipant1_validateContextControlCode(
				patientContactParticipant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePatientContactParticipant_validatePatientContactParticipantTemplateId(
				patientContactParticipant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePatientContactParticipant_validatePatientContactParticipantTime(
				patientContactParticipant, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePatientContactParticipant_validatePatientContactParticipantTypeCode(
				patientContactParticipant, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePatientContactParticipantTemplateId constraint of '<em>Patient Contact Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactParticipant_validatePatientContactParticipantTemplateId(
			PatientContactParticipant patientContactParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patientContactParticipant.validatePatientContactParticipantTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePatientContactParticipantTime constraint of '<em>Patient Contact Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactParticipant_validatePatientContactParticipantTime(
			PatientContactParticipant patientContactParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patientContactParticipant.validatePatientContactParticipantTime(diagnostics, context);
	}

	/**
	 * Validates the validatePatientContactParticipantTypeCode constraint of '<em>Patient Contact Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContactParticipant_validatePatientContactParticipantTypeCode(
			PatientContactParticipant patientContactParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patientContactParticipant.validatePatientContactParticipantTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument(ScannedDocument scannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scannedDocument, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateClassCode(scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentTypeIdFixed(scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentHasOneRecordTarget(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentHasAssignedAuthor(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentPatientRoleId(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentHasPatientRoleAddress(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentHasPatientName(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentHasPatientGenderCode(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentHasPatientBirthYear(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentHasOriginalAuthor(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentHasScanningDevice(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentHasScanDataEnterer(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentHasRepresentedCustodianOrganizationName(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentHasRepresentedCustodianOrganizationAddr(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentLegalAuthenticatorAssignedEntityId(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentHasNonXMLBody(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentHasNonXMLBodyBinaryText(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentHasNonXMLBodyTextMediaType(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentHasNonXMLBodyTextRepresentation(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentTemplateId(scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentCode(scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentConfidentialityCode(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentEffectiveTime(
				scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentId(scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentLanguageCode(scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentTitle(scannedDocument, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScannedDocument_validateScannedDocumentTypeId(scannedDocument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateScannedDocumentTypeIdFixed constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentTypeIdFixed(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentTypeIdFixed(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentHasOneRecordTarget constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentHasOneRecordTarget(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentHasOneRecordTarget(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentHasAssignedAuthor constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentHasAssignedAuthor(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentHasAssignedAuthor(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentPatientRoleId constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentPatientRoleId(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentPatientRoleId(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentHasPatientRoleAddress constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentHasPatientRoleAddress(
			ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentHasPatientRoleAddress(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentHasPatientName constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentHasPatientName(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentHasPatientName(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentHasPatientGenderCode constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentHasPatientGenderCode(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentHasPatientGenderCode(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentHasPatientBirthYear constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentHasPatientBirthYear(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentHasPatientBirthYear(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentHasOriginalAuthor constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentHasOriginalAuthor(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentHasOriginalAuthor(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentHasScanningDevice constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentHasScanningDevice(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentHasScanningDevice(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentHasScanDataEnterer constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentHasScanDataEnterer(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentHasScanDataEnterer(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentHasRepresentedCustodianOrganizationName constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentHasRepresentedCustodianOrganizationName(
			ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentHasRepresentedCustodianOrganizationName(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentHasRepresentedCustodianOrganizationAddr constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentHasRepresentedCustodianOrganizationAddr(
			ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentHasRepresentedCustodianOrganizationAddr(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentLegalAuthenticatorAssignedEntityId constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentLegalAuthenticatorAssignedEntityId(
			ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentLegalAuthenticatorAssignedEntityId(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentHasNonXMLBody constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentHasNonXMLBody(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentHasNonXMLBody(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentHasNonXMLBodyBinaryText constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentHasNonXMLBodyBinaryText(
			ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentHasNonXMLBodyBinaryText(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentHasNonXMLBodyTextMediaType constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentHasNonXMLBodyTextMediaType(
			ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentHasNonXMLBodyTextMediaType(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentHasNonXMLBodyTextRepresentation constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentHasNonXMLBodyTextRepresentation(
			ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentHasNonXMLBodyTextRepresentation(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentTemplateId constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentTemplateId(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentCode constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentCode(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentCode(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentConfidentialityCode constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentConfidentialityCode(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentConfidentialityCode(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentEffectiveTime constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentEffectiveTime(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentId constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentId(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentId(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentLanguageCode constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentLanguageCode(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentTitle constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentTitle(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentTitle(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentTypeId constraint of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocument_validateScannedDocumentTypeId(ScannedDocument scannedDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scannedDocument.validateScannedDocumentTypeId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanOriginalAuthor(ScanOriginalAuthor scanOriginalAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scanOriginalAuthor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(scanOriginalAuthor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(scanOriginalAuthor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(scanOriginalAuthor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(scanOriginalAuthor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(scanOriginalAuthor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(scanOriginalAuthor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(scanOriginalAuthor, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateAuthor_validateTypeCode(scanOriginalAuthor, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateAuthor_validateContextControlCode(scanOriginalAuthor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScanOriginalAuthor_validateScanOriginalAuthorHasAssignedAuthorId(
				scanOriginalAuthor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScanOriginalAuthor_validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(
				scanOriginalAuthor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScanOriginalAuthor_validateScanOriginalAuthorTemplateId(
				scanOriginalAuthor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateScanOriginalAuthorHasAssignedAuthorId constraint of '<em>Scan Original Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanOriginalAuthor_validateScanOriginalAuthorHasAssignedAuthorId(
			ScanOriginalAuthor scanOriginalAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scanOriginalAuthor.validateScanOriginalAuthorHasAssignedAuthorId(diagnostics, context);
	}

	/**
	 * Validates the validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId constraint of '<em>Scan Original Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanOriginalAuthor_validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(
			ScanOriginalAuthor scanOriginalAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scanOriginalAuthor.validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(
			diagnostics, context);
	}

	/**
	 * Validates the validateScanOriginalAuthorTemplateId constraint of '<em>Scan Original Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanOriginalAuthor_validateScanOriginalAuthorTemplateId(
			ScanOriginalAuthor scanOriginalAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scanOriginalAuthor.validateScanOriginalAuthorTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanningDevice(ScanningDevice scanningDevice, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scanningDevice, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(scanningDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(scanningDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(scanningDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(scanningDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(scanningDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(scanningDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(scanningDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateAuthor_validateTypeCode(scanningDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateAuthor_validateContextControlCode(scanningDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScanningDevice_validateScanningDeviceTimeEqualsDocumentEffectiveTime(
				scanningDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScanningDevice_validateScanningDeviceHasAssignedAuthorId(
				scanningDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScanningDevice_validateScanningDeviceHasAssignedAuthoringDeviceCode(
				scanningDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScanningDevice_validateScanningDeviceHasDeviceManufacturerModelName(
				scanningDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScanningDevice_validateScanningDeviceHasDeviceSoftwareName(
				scanningDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScanningDevice_validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(
				scanningDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScanningDevice_validateScanningDeviceTemplateId(scanningDevice, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateScanningDeviceTimeEqualsDocumentEffectiveTime constraint of '<em>Scanning Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanningDevice_validateScanningDeviceTimeEqualsDocumentEffectiveTime(
			ScanningDevice scanningDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scanningDevice.validateScanningDeviceTimeEqualsDocumentEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateScanningDeviceHasAssignedAuthorId constraint of '<em>Scanning Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanningDevice_validateScanningDeviceHasAssignedAuthorId(ScanningDevice scanningDevice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scanningDevice.validateScanningDeviceHasAssignedAuthorId(diagnostics, context);
	}

	/**
	 * Validates the validateScanningDeviceHasAssignedAuthoringDeviceCode constraint of '<em>Scanning Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanningDevice_validateScanningDeviceHasAssignedAuthoringDeviceCode(
			ScanningDevice scanningDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scanningDevice.validateScanningDeviceHasAssignedAuthoringDeviceCode(diagnostics, context);
	}

	/**
	 * Validates the validateScanningDeviceHasDeviceManufacturerModelName constraint of '<em>Scanning Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanningDevice_validateScanningDeviceHasDeviceManufacturerModelName(
			ScanningDevice scanningDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scanningDevice.validateScanningDeviceHasDeviceManufacturerModelName(diagnostics, context);
	}

	/**
	 * Validates the validateScanningDeviceHasDeviceSoftwareName constraint of '<em>Scanning Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanningDevice_validateScanningDeviceHasDeviceSoftwareName(ScanningDevice scanningDevice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scanningDevice.validateScanningDeviceHasDeviceSoftwareName(diagnostics, context);
	}

	/**
	 * Validates the validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId constraint of '<em>Scanning Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanningDevice_validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(
			ScanningDevice scanningDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scanningDevice.validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(diagnostics, context);
	}

	/**
	 * Validates the validateScanningDeviceTemplateId constraint of '<em>Scanning Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanningDevice_validateScanningDeviceTemplateId(ScanningDevice scanningDevice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scanningDevice.validateScanningDeviceTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanDataEnterer(ScanDataEnterer scanDataEnterer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scanDataEnterer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(scanDataEnterer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(scanDataEnterer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(scanDataEnterer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(scanDataEnterer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(scanDataEnterer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(scanDataEnterer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(scanDataEnterer, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateDataEnterer_validateTypeCode(scanDataEnterer, diagnostics, context);
		if (result || diagnostics != null)
			result &= cdaValidator.validateDataEnterer_validateContextControlCode(scanDataEnterer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScanDataEnterer_validateScanDataEntererTimeEqualsDocumentEffectiveTime(
				scanDataEnterer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScanDataEnterer_validateScanDataEntererHasAssignedEntityId(
				scanDataEnterer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScanDataEnterer_validateScanDataEntererTemplateId(scanDataEnterer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScanDataEnterer_validateScanDataEntererTime(scanDataEnterer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateScanDataEntererTimeEqualsDocumentEffectiveTime constraint of '<em>Scan Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanDataEnterer_validateScanDataEntererTimeEqualsDocumentEffectiveTime(
			ScanDataEnterer scanDataEnterer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scanDataEnterer.validateScanDataEntererTimeEqualsDocumentEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateScanDataEntererHasAssignedEntityId constraint of '<em>Scan Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanDataEnterer_validateScanDataEntererHasAssignedEntityId(ScanDataEnterer scanDataEnterer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scanDataEnterer.validateScanDataEntererHasAssignedEntityId(diagnostics, context);
	}

	/**
	 * Validates the validateScanDataEntererTemplateId constraint of '<em>Scan Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanDataEnterer_validateScanDataEntererTemplateId(ScanDataEnterer scanDataEnterer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scanDataEnterer.validateScanDataEntererTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateScanDataEntererTime constraint of '<em>Scan Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanDataEnterer_validateScanDataEntererTime(ScanDataEnterer scanDataEnterer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scanDataEnterer.validateScanDataEntererTime(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIHERegistryDelegate(IHERegistryDelegate iheRegistryDelegate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iheRegistryDelegate, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return IHEPlugin.INSTANCE;
	}

} // IHEValidator
