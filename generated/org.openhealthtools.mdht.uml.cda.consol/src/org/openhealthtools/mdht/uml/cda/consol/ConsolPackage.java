/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolFactory
 * @model kind="package"
 * @generated
 */
public interface ConsolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "consol";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/consol";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "consol";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConsolPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl <em>General Header Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getGeneralHeaderConstraints()
	 * @generated
	 */
	int GENERAL_HEADER_CONSTRAINTS = 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__REALM_CODE = CDAPackage.CLINICAL_DOCUMENT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__TYPE_ID = CDAPackage.CLINICAL_DOCUMENT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID = CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__ID = CDAPackage.CLINICAL_DOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__CODE = CDAPackage.CLINICAL_DOCUMENT__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__TITLE = CDAPackage.CLINICAL_DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME = CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE = CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE = CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__SET_ID = CDAPackage.CLINICAL_DOCUMENT__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER = CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__COPY_TIME = CDAPackage.CLINICAL_DOCUMENT__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET = CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__AUTHOR = CDAPackage.CLINICAL_DOCUMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER = CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__INFORMANT = CDAPackage.CLINICAL_DOCUMENT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__CUSTODIAN = CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT = CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__PARTICIPANT = CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF = CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF = CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT = CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION = CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF = CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__COMPONENT = CDAPackage.CLINICAL_DOCUMENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR = CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__CLASS_CODE = CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__MOOD_CODE = CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>General Header Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT = CDAPackage.CLINICAL_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AllergyDrugSensitivityImpl <em>Allergy Drug Sensitivity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AllergyDrugSensitivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAllergyDrugSensitivity()
	 * @generated
	 */
	int ALLERGY_DRUG_SENSITIVITY = 1;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__ID = CDAPackage.ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__CODE = CDAPackage.ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__TEXT = CDAPackage.ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Allergy Drug Sensitivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EpisodeObservationImpl <em>Episode Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EpisodeObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEpisodeObservation()
	 * @generated
	 */
	int EPISODE_OBSERVATION = 2;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Episode Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AllergyIntoleranceImpl <em>Allergy Intolerance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AllergyIntoleranceImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAllergyIntolerance()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE = 3;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Allergy Intolerance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProblemEntryReactionObservationContainerImpl <em>Problem Entry Reaction Observation Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ProblemEntryReactionObservationContainerImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getProblemEntryReactionObservationContainer()
	 * @generated
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Problem Entry Reaction Observation Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AgeObservationImpl <em>Age Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AgeObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAgeObservation()
	 * @generated
	 */
	int AGE_OBSERVATION = 5;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Age Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SeverityImpl <em>Severity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SeverityImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 6;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Severity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProblemStatusObservationImpl <em>Problem Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ProblemStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getProblemStatusObservation()
	 * @generated
	 */
	int PROBLEM_STATUS_OBSERVATION = 7;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Problem Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HealthStatusObservationImpl <em>Health Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HealthStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHealthStatusObservation()
	 * @generated
	 */
	int HEALTH_STATUS_OBSERVATION = 8;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Health Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.CommentImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 9;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ID = CDAPackage.ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CODE = CDAPackage.ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TEXT = CDAPackage.ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationImpl <em>Medication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedication()
	 * @generated
	 */
	int MEDICATION = 10;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__REALM_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__TYPE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__TEMPLATE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__ID = CDAPackage.SUBSTANCE_ADMINISTRATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__TEXT = CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__STATUS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__EFFECTIVE_TIME = CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__PRIORITY_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__REPEAT_NUMBER = CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__ROUTE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__APPROACH_SITE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__RATE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__MAX_DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__ADMINISTRATION_UNIT_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__SUBJECT = CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__SPECIMEN = CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CONSUMABLE = CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__PERFORMER = CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__AUTHOR = CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__INFORMANT = CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__PARTICIPANT = CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__ENTRY_RELATIONSHIP = CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__REFERENCE = CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__PRECONDITION = CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__NULL_FLAVOR = CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CLASS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__MOOD_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__NEGATION_IND = CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FEATURE_COUNT = CDAPackage.SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationTypeImpl <em>Medication Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationTypeImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationType()
	 * @generated
	 */
	int MEDICATION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationOrderInformationImpl <em>Medication Order Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationOrderInformationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationOrderInformation()
	 * @generated
	 */
	int MEDICATION_ORDER_INFORMATION = 12;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__REALM_CODE = CDAPackage.SUPPLY__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__TYPE_ID = CDAPackage.SUPPLY__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__TEMPLATE_ID = CDAPackage.SUPPLY__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__ID = CDAPackage.SUPPLY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__CODE = CDAPackage.SUPPLY__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__TEXT = CDAPackage.SUPPLY__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__STATUS_CODE = CDAPackage.SUPPLY__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__EFFECTIVE_TIME = CDAPackage.SUPPLY__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__PRIORITY_CODE = CDAPackage.SUPPLY__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__REPEAT_NUMBER = CDAPackage.SUPPLY__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Independent Ind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__INDEPENDENT_IND = CDAPackage.SUPPLY__INDEPENDENT_IND;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__QUANTITY = CDAPackage.SUPPLY__QUANTITY;

	/**
	 * The feature id for the '<em><b>Expected Use Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__EXPECTED_USE_TIME = CDAPackage.SUPPLY__EXPECTED_USE_TIME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__SUBJECT = CDAPackage.SUPPLY__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__SPECIMEN = CDAPackage.SUPPLY__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__PRODUCT = CDAPackage.SUPPLY__PRODUCT;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__PERFORMER = CDAPackage.SUPPLY__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__AUTHOR = CDAPackage.SUPPLY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__INFORMANT = CDAPackage.SUPPLY__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__PARTICIPANT = CDAPackage.SUPPLY__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__ENTRY_RELATIONSHIP = CDAPackage.SUPPLY__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__REFERENCE = CDAPackage.SUPPLY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__PRECONDITION = CDAPackage.SUPPLY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__NULL_FLAVOR = CDAPackage.SUPPLY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__CLASS_CODE = CDAPackage.SUPPLY__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__MOOD_CODE = CDAPackage.SUPPLY__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Medication Order Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION_FEATURE_COUNT = CDAPackage.SUPPLY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationStatusObservationImpl <em>Medication Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationStatusObservation()
	 * @generated
	 */
	int MEDICATION_STATUS_OBSERVATION = 13;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProductInstanceImpl <em>Product Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ProductInstanceImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getProductInstance()
	 * @generated
	 */
	int PRODUCT_INSTANCE = 14;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__REALM_CODE = CDAPackage.PARTICIPANT_ROLE__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__TYPE_ID = CDAPackage.PARTICIPANT_ROLE__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__TEMPLATE_ID = CDAPackage.PARTICIPANT_ROLE__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__ID = CDAPackage.PARTICIPANT_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__CODE = CDAPackage.PARTICIPANT_ROLE__CODE;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__ADDR = CDAPackage.PARTICIPANT_ROLE__ADDR;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__TELECOM = CDAPackage.PARTICIPANT_ROLE__TELECOM;

	/**
	 * The feature id for the '<em><b>Playing Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__PLAYING_DEVICE = CDAPackage.PARTICIPANT_ROLE__PLAYING_DEVICE;

	/**
	 * The feature id for the '<em><b>Playing Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__PLAYING_ENTITY = CDAPackage.PARTICIPANT_ROLE__PLAYING_ENTITY;

	/**
	 * The feature id for the '<em><b>Scoping Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__SCOPING_ENTITY = CDAPackage.PARTICIPANT_ROLE__SCOPING_ENTITY;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__NULL_FLAVOR = CDAPackage.PARTICIPANT_ROLE__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__CLASS_CODE = CDAPackage.PARTICIPANT_ROLE__CLASS_CODE;

	/**
	 * The number of structural features of the '<em>Product Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_FEATURE_COUNT = CDAPackage.PARTICIPANT_ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationFullfillmentInstructionsImpl <em>Medication Fullfillment Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationFullfillmentInstructionsImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationFullfillmentInstructions()
	 * @generated
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS = 15;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__ID = CDAPackage.ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__CODE = CDAPackage.ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__TEXT = CDAPackage.ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication Fullfillment Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationSeriesNumberObservationImpl <em>Medication Series Number Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationSeriesNumberObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationSeriesNumberObservation()
	 * @generated
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION = 16;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication Series Number Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.InternalReferenceImpl <em>Internal Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.InternalReferenceImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getInternalReference()
	 * @generated
	 */
	int INTERNAL_REFERENCE = 17;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__ID = CDAPackage.ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__CODE = CDAPackage.ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__TEXT = CDAPackage.ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Internal Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PatientMedicalInstructionsImpl <em>Patient Medical Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PatientMedicalInstructionsImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPatientMedicalInstructions()
	 * @generated
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS = 18;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__ID = CDAPackage.ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__CODE = CDAPackage.ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__TEXT = CDAPackage.ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Patient Medical Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConditionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 19;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ID = CDAPackage.ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CODE = CDAPackage.ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TEXT = CDAPackage.ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PatientSummaryImpl <em>Patient Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PatientSummaryImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPatientSummary()
	 * @generated
	 */
	int PATIENT_SUMMARY = 20;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__REALM_CODE = GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__TYPE_ID = GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__TEMPLATE_ID = GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__ID = GENERAL_HEADER_CONSTRAINTS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__CODE = GENERAL_HEADER_CONSTRAINTS__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__TITLE = GENERAL_HEADER_CONSTRAINTS__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__EFFECTIVE_TIME = GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__CONFIDENTIALITY_CODE = GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__LANGUAGE_CODE = GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__SET_ID = GENERAL_HEADER_CONSTRAINTS__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__VERSION_NUMBER = GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__COPY_TIME = GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__RECORD_TARGET = GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__AUTHOR = GENERAL_HEADER_CONSTRAINTS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__DATA_ENTERER = GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__INFORMANT = GENERAL_HEADER_CONSTRAINTS__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__CUSTODIAN = GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__INFORMATION_RECIPIENT = GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__LEGAL_AUTHENTICATOR = GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__AUTHENTICATOR = GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__PARTICIPANT = GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__IN_FULFILLMENT_OF = GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__DOCUMENTATION_OF = GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__RELATED_DOCUMENT = GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__AUTHORIZATION = GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__COMPONENT_OF = GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__COMPONENT = GENERAL_HEADER_CONSTRAINTS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__NULL_FLAVOR = GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__CLASS_CODE = GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__MOOD_CODE = GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Patient Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY_FEATURE_COUNT = GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectivesSectionImpl <em>Advance Directives Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectivesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAdvanceDirectivesSection()
	 * @generated
	 */
	int ADVANCE_DIRECTIVES_SECTION = 21;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Advance Directives Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectiveImpl <em>Advance Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectiveImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAdvanceDirective()
	 * @generated
	 */
	int ADVANCE_DIRECTIVE = 22;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Advance Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectiveStatusObservationImpl <em>Advance Directive Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectiveStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAdvanceDirectiveStatusObservation()
	 * @generated
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION = 23;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Advance Directive Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AllergiesReactionsSectionImpl <em>Allergies Reactions Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AllergiesReactionsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAllergiesReactionsSection()
	 * @generated
	 */
	int ALLERGIES_REACTIONS_SECTION = 24;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Allergies Reactions Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProblemListSectionImpl <em>Problem List Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ProblemListSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getProblemListSection()
	 * @generated
	 */
	int PROBLEM_LIST_SECTION = 25;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Problem List Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EncountersSectionImpl <em>Encounters Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EncountersSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEncountersSection()
	 * @generated
	 */
	int ENCOUNTERS_SECTION = 26;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Encounters Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EncounterImpl <em>Encounter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EncounterImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEncounter()
	 * @generated
	 */
	int ENCOUNTER = 27;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__REALM_CODE = CDAPackage.ENCOUNTER__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__TYPE_ID = CDAPackage.ENCOUNTER__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__TEMPLATE_ID = CDAPackage.ENCOUNTER__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__ID = CDAPackage.ENCOUNTER__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__CODE = CDAPackage.ENCOUNTER__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__TEXT = CDAPackage.ENCOUNTER__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__STATUS_CODE = CDAPackage.ENCOUNTER__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__EFFECTIVE_TIME = CDAPackage.ENCOUNTER__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__PRIORITY_CODE = CDAPackage.ENCOUNTER__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__SUBJECT = CDAPackage.ENCOUNTER__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__SPECIMEN = CDAPackage.ENCOUNTER__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__PERFORMER = CDAPackage.ENCOUNTER__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__AUTHOR = CDAPackage.ENCOUNTER__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__INFORMANT = CDAPackage.ENCOUNTER__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__PARTICIPANT = CDAPackage.ENCOUNTER__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__ENTRY_RELATIONSHIP = CDAPackage.ENCOUNTER__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__REFERENCE = CDAPackage.ENCOUNTER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__PRECONDITION = CDAPackage.ENCOUNTER__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__NULL_FLAVOR = CDAPackage.ENCOUNTER__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__CLASS_CODE = CDAPackage.ENCOUNTER__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__MOOD_CODE = CDAPackage.ENCOUNTER__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Encounter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_FEATURE_COUNT = CDAPackage.ENCOUNTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EncountersActivityImpl <em>Encounters Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EncountersActivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEncountersActivity()
	 * @generated
	 */
	int ENCOUNTERS_ACTIVITY = 28;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__REALM_CODE = CDAPackage.ENCOUNTER__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__TYPE_ID = CDAPackage.ENCOUNTER__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__TEMPLATE_ID = CDAPackage.ENCOUNTER__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__ID = CDAPackage.ENCOUNTER__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__CODE = CDAPackage.ENCOUNTER__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__TEXT = CDAPackage.ENCOUNTER__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__STATUS_CODE = CDAPackage.ENCOUNTER__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__EFFECTIVE_TIME = CDAPackage.ENCOUNTER__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__PRIORITY_CODE = CDAPackage.ENCOUNTER__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__SUBJECT = CDAPackage.ENCOUNTER__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__SPECIMEN = CDAPackage.ENCOUNTER__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__PERFORMER = CDAPackage.ENCOUNTER__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__AUTHOR = CDAPackage.ENCOUNTER__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__INFORMANT = CDAPackage.ENCOUNTER__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__PARTICIPANT = CDAPackage.ENCOUNTER__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__ENTRY_RELATIONSHIP = CDAPackage.ENCOUNTER__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__REFERENCE = CDAPackage.ENCOUNTER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__PRECONDITION = CDAPackage.ENCOUNTER__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__NULL_FLAVOR = CDAPackage.ENCOUNTER__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__CLASS_CODE = CDAPackage.ENCOUNTER__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__MOOD_CODE = CDAPackage.ENCOUNTER__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Encounters Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY_FEATURE_COUNT = CDAPackage.ENCOUNTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ImmunizationsSectionImpl <em>Immunizations Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ImmunizationsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getImmunizationsSection()
	 * @generated
	 */
	int IMMUNIZATIONS_SECTION = 29;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Immunizations Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ImmunizationImpl <em>Immunization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ImmunizationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getImmunization()
	 * @generated
	 */
	int IMMUNIZATION = 30;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__REALM_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__TYPE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__TEMPLATE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__ID = CDAPackage.SUBSTANCE_ADMINISTRATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__TEXT = CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__STATUS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__EFFECTIVE_TIME = CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__PRIORITY_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__REPEAT_NUMBER = CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__ROUTE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__APPROACH_SITE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__RATE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__MAX_DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__ADMINISTRATION_UNIT_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__SUBJECT = CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__SPECIMEN = CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__CONSUMABLE = CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__PERFORMER = CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__AUTHOR = CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__INFORMANT = CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__PARTICIPANT = CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__ENTRY_RELATIONSHIP = CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__REFERENCE = CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__PRECONDITION = CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__NULL_FLAVOR = CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__CLASS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__MOOD_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__NEGATION_IND = CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Immunization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION_FEATURE_COUNT = CDAPackage.SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PayersSectionImpl <em>Payers Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PayersSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPayersSection()
	 * @generated
	 */
	int PAYERS_SECTION = 31;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Payers Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.InsuranceProviderImpl <em>Insurance Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.InsuranceProviderImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getInsuranceProvider()
	 * @generated
	 */
	int INSURANCE_PROVIDER = 32;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__ID = CDAPackage.ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__CODE = CDAPackage.ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__TEXT = CDAPackage.ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Insurance Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PayerEntryImpl <em>Payer Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PayerEntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPayerEntry()
	 * @generated
	 */
	int PAYER_ENTRY = 33;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__ID = CDAPackage.ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__CODE = CDAPackage.ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__TEXT = CDAPackage.ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Payer Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationsSectionImpl <em>Medications Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationsSection()
	 * @generated
	 */
	int MEDICATIONS_SECTION = 34;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Medications Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareSectionImpl <em>Plan Of Care Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPlanOfCareSection()
	 * @generated
	 */
	int PLAN_OF_CARE_SECTION = 35;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Plan Of Care Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ProcedureImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 36;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__REALM_CODE = CDAPackage.PROCEDURE__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TYPE_ID = CDAPackage.PROCEDURE__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TEMPLATE_ID = CDAPackage.PROCEDURE__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ID = CDAPackage.PROCEDURE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CODE = CDAPackage.PROCEDURE__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TEXT = CDAPackage.PROCEDURE__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__STATUS_CODE = CDAPackage.PROCEDURE__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__EFFECTIVE_TIME = CDAPackage.PROCEDURE__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PRIORITY_CODE = CDAPackage.PROCEDURE__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__LANGUAGE_CODE = CDAPackage.PROCEDURE__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__METHOD_CODE = CDAPackage.PROCEDURE__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__APPROACH_SITE_CODE = CDAPackage.PROCEDURE__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TARGET_SITE_CODE = CDAPackage.PROCEDURE__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__SUBJECT = CDAPackage.PROCEDURE__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__SPECIMEN = CDAPackage.PROCEDURE__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PERFORMER = CDAPackage.PROCEDURE__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__AUTHOR = CDAPackage.PROCEDURE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__INFORMANT = CDAPackage.PROCEDURE__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PARTICIPANT = CDAPackage.PROCEDURE__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ENTRY_RELATIONSHIP = CDAPackage.PROCEDURE__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__REFERENCE = CDAPackage.PROCEDURE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PRECONDITION = CDAPackage.PROCEDURE__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NULL_FLAVOR = CDAPackage.PROCEDURE__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CLASS_CODE = CDAPackage.PROCEDURE__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__MOOD_CODE = CDAPackage.PROCEDURE__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NEGATION_IND = CDAPackage.PROCEDURE__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = CDAPackage.PROCEDURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityActImpl <em>Plan Of Care Activity Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityActImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPlanOfCareActivityAct()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT = 37;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__ID = CDAPackage.ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__CODE = CDAPackage.ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__TEXT = CDAPackage.ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Plan Of Care Activity Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityEncounterImpl <em>Plan Of Care Activity Encounter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityEncounterImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPlanOfCareActivityEncounter()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER = 38;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__REALM_CODE = CDAPackage.ENCOUNTER__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__TYPE_ID = CDAPackage.ENCOUNTER__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__TEMPLATE_ID = CDAPackage.ENCOUNTER__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__ID = CDAPackage.ENCOUNTER__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__CODE = CDAPackage.ENCOUNTER__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__TEXT = CDAPackage.ENCOUNTER__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__STATUS_CODE = CDAPackage.ENCOUNTER__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EFFECTIVE_TIME = CDAPackage.ENCOUNTER__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PRIORITY_CODE = CDAPackage.ENCOUNTER__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__SUBJECT = CDAPackage.ENCOUNTER__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__SPECIMEN = CDAPackage.ENCOUNTER__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PERFORMER = CDAPackage.ENCOUNTER__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__AUTHOR = CDAPackage.ENCOUNTER__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__INFORMANT = CDAPackage.ENCOUNTER__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PARTICIPANT = CDAPackage.ENCOUNTER__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__ENTRY_RELATIONSHIP = CDAPackage.ENCOUNTER__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__REFERENCE = CDAPackage.ENCOUNTER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PRECONDITION = CDAPackage.ENCOUNTER__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__NULL_FLAVOR = CDAPackage.ENCOUNTER__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__CLASS_CODE = CDAPackage.ENCOUNTER__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__MOOD_CODE = CDAPackage.ENCOUNTER__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Plan Of Care Activity Encounter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER_FEATURE_COUNT = CDAPackage.ENCOUNTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityObservationImpl <em>Plan Of Care Activity Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPlanOfCareActivityObservation()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION = 39;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Plan Of Care Activity Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityProcedureImpl <em>Plan Of Care Activity Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityProcedureImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPlanOfCareActivityProcedure()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE = 40;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__REALM_CODE = CDAPackage.PROCEDURE__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__TYPE_ID = CDAPackage.PROCEDURE__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__TEMPLATE_ID = CDAPackage.PROCEDURE__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__ID = CDAPackage.PROCEDURE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__CODE = CDAPackage.PROCEDURE__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__TEXT = CDAPackage.PROCEDURE__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__STATUS_CODE = CDAPackage.PROCEDURE__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__EFFECTIVE_TIME = CDAPackage.PROCEDURE__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__PRIORITY_CODE = CDAPackage.PROCEDURE__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__LANGUAGE_CODE = CDAPackage.PROCEDURE__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__METHOD_CODE = CDAPackage.PROCEDURE__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__APPROACH_SITE_CODE = CDAPackage.PROCEDURE__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__TARGET_SITE_CODE = CDAPackage.PROCEDURE__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__SUBJECT = CDAPackage.PROCEDURE__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__SPECIMEN = CDAPackage.PROCEDURE__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__PERFORMER = CDAPackage.PROCEDURE__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__AUTHOR = CDAPackage.PROCEDURE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__INFORMANT = CDAPackage.PROCEDURE__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__PARTICIPANT = CDAPackage.PROCEDURE__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__ENTRY_RELATIONSHIP = CDAPackage.PROCEDURE__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__REFERENCE = CDAPackage.PROCEDURE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__PRECONDITION = CDAPackage.PROCEDURE__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__NULL_FLAVOR = CDAPackage.PROCEDURE__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__CLASS_CODE = CDAPackage.PROCEDURE__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__MOOD_CODE = CDAPackage.PROCEDURE__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__NEGATION_IND = CDAPackage.PROCEDURE__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Plan Of Care Activity Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE_FEATURE_COUNT = CDAPackage.PROCEDURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivitySubstanceAdministrationImpl <em>Plan Of Care Activity Substance Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivitySubstanceAdministrationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPlanOfCareActivitySubstanceAdministration()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION = 41;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__REALM_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__TYPE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__ID = CDAPackage.SUBSTANCE_ADMINISTRATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__TEXT = CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__STATUS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME = CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER = CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__ROUTE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__SUBJECT = CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__SPECIMEN = CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__CONSUMABLE = CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__PERFORMER = CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__AUTHOR = CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__INFORMANT = CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__PARTICIPANT = CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP = CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__REFERENCE = CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__PRECONDITION = CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR = CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__CLASS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__MOOD_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__NEGATION_IND = CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Plan Of Care Activity Substance Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT = CDAPackage.SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivitySupplyImpl <em>Plan Of Care Activity Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivitySupplyImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPlanOfCareActivitySupply()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY = 42;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__REALM_CODE = CDAPackage.SUPPLY__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__TYPE_ID = CDAPackage.SUPPLY__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__TEMPLATE_ID = CDAPackage.SUPPLY__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__ID = CDAPackage.SUPPLY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__CODE = CDAPackage.SUPPLY__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__TEXT = CDAPackage.SUPPLY__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__STATUS_CODE = CDAPackage.SUPPLY__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__EFFECTIVE_TIME = CDAPackage.SUPPLY__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__PRIORITY_CODE = CDAPackage.SUPPLY__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__REPEAT_NUMBER = CDAPackage.SUPPLY__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Independent Ind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__INDEPENDENT_IND = CDAPackage.SUPPLY__INDEPENDENT_IND;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__QUANTITY = CDAPackage.SUPPLY__QUANTITY;

	/**
	 * The feature id for the '<em><b>Expected Use Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__EXPECTED_USE_TIME = CDAPackage.SUPPLY__EXPECTED_USE_TIME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__SUBJECT = CDAPackage.SUPPLY__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__SPECIMEN = CDAPackage.SUPPLY__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__PRODUCT = CDAPackage.SUPPLY__PRODUCT;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__PERFORMER = CDAPackage.SUPPLY__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__AUTHOR = CDAPackage.SUPPLY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__INFORMANT = CDAPackage.SUPPLY__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__PARTICIPANT = CDAPackage.SUPPLY__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__ENTRY_RELATIONSHIP = CDAPackage.SUPPLY__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__REFERENCE = CDAPackage.SUPPLY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__PRECONDITION = CDAPackage.SUPPLY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__NULL_FLAVOR = CDAPackage.SUPPLY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__CLASS_CODE = CDAPackage.SUPPLY__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__MOOD_CODE = CDAPackage.SUPPLY__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Plan Of Care Activity Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY_FEATURE_COUNT = CDAPackage.SUPPLY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PregnancyHistorySectionImpl <em>Pregnancy History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PregnancyHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPregnancyHistorySection()
	 * @generated
	 */
	int PREGNANCY_HISTORY_SECTION = 43;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Pregnancy History Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PregnancyObservationImpl <em>Pregnancy Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PregnancyObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPregnancyObservation()
	 * @generated
	 */
	int PREGNANCY_OBSERVATION = 44;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Pregnancy Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SurgeriesSectionImpl <em>Surgeries Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SurgeriesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSurgeriesSection()
	 * @generated
	 */
	int SURGERIES_SECTION = 45;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Surgeries Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ExternalReferenceImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getExternalReference()
	 * @generated
	 */
	int EXTERNAL_REFERENCE = 46;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__ID = CDAPackage.ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__CODE = CDAPackage.ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__TEXT = CDAPackage.ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProcedureEntryProcedureActivityProcedureImpl <em>Procedure Entry Procedure Activity Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ProcedureEntryProcedureActivityProcedureImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getProcedureEntryProcedureActivityProcedure()
	 * @generated
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE = 47;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__REALM_CODE = CDAPackage.PROCEDURE__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__TYPE_ID = CDAPackage.PROCEDURE__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__TEMPLATE_ID = CDAPackage.PROCEDURE__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__ID = CDAPackage.PROCEDURE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__CODE = CDAPackage.PROCEDURE__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__TEXT = CDAPackage.PROCEDURE__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__STATUS_CODE = CDAPackage.PROCEDURE__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__EFFECTIVE_TIME = CDAPackage.PROCEDURE__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PRIORITY_CODE = CDAPackage.PROCEDURE__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__LANGUAGE_CODE = CDAPackage.PROCEDURE__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__METHOD_CODE = CDAPackage.PROCEDURE__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__APPROACH_SITE_CODE = CDAPackage.PROCEDURE__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__TARGET_SITE_CODE = CDAPackage.PROCEDURE__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__SUBJECT = CDAPackage.PROCEDURE__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__SPECIMEN = CDAPackage.PROCEDURE__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PERFORMER = CDAPackage.PROCEDURE__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__AUTHOR = CDAPackage.PROCEDURE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__INFORMANT = CDAPackage.PROCEDURE__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PARTICIPANT = CDAPackage.PROCEDURE__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__ENTRY_RELATIONSHIP = CDAPackage.PROCEDURE__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__REFERENCE = CDAPackage.PROCEDURE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PRECONDITION = CDAPackage.PROCEDURE__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__NULL_FLAVOR = CDAPackage.PROCEDURE__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__CLASS_CODE = CDAPackage.PROCEDURE__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__MOOD_CODE = CDAPackage.PROCEDURE__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__NEGATION_IND = CDAPackage.PROCEDURE__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Procedure Entry Procedure Activity Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_FEATURE_COUNT = CDAPackage.PROCEDURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsSectionImpl <em>Vital Signs Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getVitalSignsSection()
	 * @generated
	 */
	int VITAL_SIGNS_SECTION = 48;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Vital Signs Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsOrganizerImpl <em>Vital Signs Organizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsOrganizerImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getVitalSignsOrganizer()
	 * @generated
	 */
	int VITAL_SIGNS_ORGANIZER = 49;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__REALM_CODE = CDAPackage.ORGANIZER__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__TYPE_ID = CDAPackage.ORGANIZER__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__TEMPLATE_ID = CDAPackage.ORGANIZER__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__ID = CDAPackage.ORGANIZER__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__CODE = CDAPackage.ORGANIZER__CODE;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__STATUS_CODE = CDAPackage.ORGANIZER__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__EFFECTIVE_TIME = CDAPackage.ORGANIZER__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__SUBJECT = CDAPackage.ORGANIZER__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__SPECIMEN = CDAPackage.ORGANIZER__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__PERFORMER = CDAPackage.ORGANIZER__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__AUTHOR = CDAPackage.ORGANIZER__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__INFORMANT = CDAPackage.ORGANIZER__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__PARTICIPANT = CDAPackage.ORGANIZER__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__REFERENCE = CDAPackage.ORGANIZER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__PRECONDITION = CDAPackage.ORGANIZER__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__COMPONENT = CDAPackage.ORGANIZER__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__NULL_FLAVOR = CDAPackage.ORGANIZER__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__CLASS_CODE = CDAPackage.ORGANIZER__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__MOOD_CODE = CDAPackage.ORGANIZER__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Vital Signs Organizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER_FEATURE_COUNT = CDAPackage.ORGANIZER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignImpl <em>Vital Sign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getVitalSign()
	 * @generated
	 */
	int VITAL_SIGN = 50;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Vital Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.DiagnosticResultsSectionImpl <em>Diagnostic Results Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.DiagnosticResultsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getDiagnosticResultsSection()
	 * @generated
	 */
	int DIAGNOSTIC_RESULTS_SECTION = 51;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Diagnostic Results Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ResultImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 52;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ResultOrganizerImpl <em>Result Organizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ResultOrganizerImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getResultOrganizer()
	 * @generated
	 */
	int RESULT_ORGANIZER = 53;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__REALM_CODE = CDAPackage.ORGANIZER__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__TYPE_ID = CDAPackage.ORGANIZER__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__TEMPLATE_ID = CDAPackage.ORGANIZER__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__ID = CDAPackage.ORGANIZER__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__CODE = CDAPackage.ORGANIZER__CODE;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__STATUS_CODE = CDAPackage.ORGANIZER__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__EFFECTIVE_TIME = CDAPackage.ORGANIZER__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__SUBJECT = CDAPackage.ORGANIZER__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__SPECIMEN = CDAPackage.ORGANIZER__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__PERFORMER = CDAPackage.ORGANIZER__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__AUTHOR = CDAPackage.ORGANIZER__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__INFORMANT = CDAPackage.ORGANIZER__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__PARTICIPANT = CDAPackage.ORGANIZER__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__REFERENCE = CDAPackage.ORGANIZER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__PRECONDITION = CDAPackage.ORGANIZER__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__COMPONENT = CDAPackage.ORGANIZER__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__NULL_FLAVOR = CDAPackage.ORGANIZER__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__CLASS_CODE = CDAPackage.ORGANIZER__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__MOOD_CODE = CDAPackage.ORGANIZER__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Result Organizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER_FEATURE_COUNT = CDAPackage.ORGANIZER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.FamilyHistorySectionImpl <em>Family History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.FamilyHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getFamilyHistorySection()
	 * @generated
	 */
	int FAMILY_HISTORY_SECTION = 54;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Family History Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.FamilyHistoryImpl <em>Family History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.FamilyHistoryImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getFamilyHistory()
	 * @generated
	 */
	int FAMILY_HISTORY = 55;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__REALM_CODE = CDAPackage.ORGANIZER__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__TYPE_ID = CDAPackage.ORGANIZER__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__TEMPLATE_ID = CDAPackage.ORGANIZER__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__ID = CDAPackage.ORGANIZER__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__CODE = CDAPackage.ORGANIZER__CODE;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__STATUS_CODE = CDAPackage.ORGANIZER__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__EFFECTIVE_TIME = CDAPackage.ORGANIZER__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__SUBJECT = CDAPackage.ORGANIZER__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__SPECIMEN = CDAPackage.ORGANIZER__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__PERFORMER = CDAPackage.ORGANIZER__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__AUTHOR = CDAPackage.ORGANIZER__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__INFORMANT = CDAPackage.ORGANIZER__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__PARTICIPANT = CDAPackage.ORGANIZER__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__REFERENCE = CDAPackage.ORGANIZER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__PRECONDITION = CDAPackage.ORGANIZER__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__COMPONENT = CDAPackage.ORGANIZER__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__NULL_FLAVOR = CDAPackage.ORGANIZER__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__CLASS_CODE = CDAPackage.ORGANIZER__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__MOOD_CODE = CDAPackage.ORGANIZER__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Family History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_FEATURE_COUNT = CDAPackage.ORGANIZER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.FamilyHistoryObservationImpl <em>Family History Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.FamilyHistoryObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getFamilyHistoryObservation()
	 * @generated
	 */
	int FAMILY_HISTORY_OBSERVATION = 56;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Family History Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SocialHistorySectionImpl <em>Social History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SocialHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSocialHistorySection()
	 * @generated
	 */
	int SOCIAL_HISTORY_SECTION = 57;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Social History Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SocialHistoryImpl <em>Social History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SocialHistoryImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSocialHistory()
	 * @generated
	 */
	int SOCIAL_HISTORY = 58;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Social History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SocialHistoryStatusObservationImpl <em>Social History Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SocialHistoryStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSocialHistoryStatusObservation()
	 * @generated
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION = 59;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Social History Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ResultsSectionImpl <em>Results Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ResultsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getResultsSection()
	 * @generated
	 */
	int RESULTS_SECTION = 60;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Results Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicalEquipmentSectionImpl <em>Medical Equipment Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicalEquipmentSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicalEquipmentSection()
	 * @generated
	 */
	int MEDICAL_EQUIPMENT_SECTION = 61;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Medical Equipment Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.FunctionalStatusSectionImpl <em>Functional Status Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.FunctionalStatusSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getFunctionalStatusSection()
	 * @generated
	 */
	int FUNCTIONAL_STATUS_SECTION = 62;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Functional Status Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PurposeSectionImpl <em>Purpose Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PurposeSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPurposeSection()
	 * @generated
	 */
	int PURPOSE_SECTION = 63;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Purpose Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PurposeActivityImpl <em>Purpose Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PurposeActivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPurposeActivity()
	 * @generated
	 */
	int PURPOSE_ACTIVITY = 64;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__ID = CDAPackage.ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__CODE = CDAPackage.ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__TEXT = CDAPackage.ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Purpose Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectiveVerificationImpl <em>Advance Directive Verification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectiveVerificationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAdvanceDirectiveVerification()
	 * @generated
	 */
	int ADVANCE_DIRECTIVE_VERIFICATION = 65;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_VERIFICATION__REALM_CODE = CDAPackage.PARTICIPANT2__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_VERIFICATION__TYPE_ID = CDAPackage.PARTICIPANT2__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_VERIFICATION__TEMPLATE_ID = CDAPackage.PARTICIPANT2__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_VERIFICATION__TIME = CDAPackage.PARTICIPANT2__TIME;

	/**
	 * The feature id for the '<em><b>Awareness Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_VERIFICATION__AWARENESS_CODE = CDAPackage.PARTICIPANT2__AWARENESS_CODE;

	/**
	 * The feature id for the '<em><b>Participant Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_VERIFICATION__PARTICIPANT_ROLE = CDAPackage.PARTICIPANT2__PARTICIPANT_ROLE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_VERIFICATION__NULL_FLAVOR = CDAPackage.PARTICIPANT2__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_VERIFICATION__TYPE_CODE = CDAPackage.PARTICIPANT2__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_VERIFICATION__CONTEXT_CONTROL_CODE = CDAPackage.PARTICIPANT2__CONTEXT_CONTROL_CODE;

	/**
	 * The number of structural features of the '<em>Advance Directive Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_VERIFICATION_FEATURE_COUNT = CDAPackage.PARTICIPANT2_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectiveReferenceImpl <em>Advance Directive Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectiveReferenceImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAdvanceDirectiveReference()
	 * @generated
	 */
	int ADVANCE_DIRECTIVE_REFERENCE = 66;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_REFERENCE__REALM_CODE = CDAPackage.REFERENCE__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_REFERENCE__TYPE_ID = CDAPackage.REFERENCE__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_REFERENCE__TEMPLATE_ID = CDAPackage.REFERENCE__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Seperatable Ind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_REFERENCE__SEPERATABLE_IND = CDAPackage.REFERENCE__SEPERATABLE_IND;

	/**
	 * The feature id for the '<em><b>External Act</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_REFERENCE__EXTERNAL_ACT = CDAPackage.REFERENCE__EXTERNAL_ACT;

	/**
	 * The feature id for the '<em><b>External Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_REFERENCE__EXTERNAL_OBSERVATION = CDAPackage.REFERENCE__EXTERNAL_OBSERVATION;

	/**
	 * The feature id for the '<em><b>External Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_REFERENCE__EXTERNAL_PROCEDURE = CDAPackage.REFERENCE__EXTERNAL_PROCEDURE;

	/**
	 * The feature id for the '<em><b>External Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_REFERENCE__EXTERNAL_DOCUMENT = CDAPackage.REFERENCE__EXTERNAL_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_REFERENCE__NULL_FLAVOR = CDAPackage.REFERENCE__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_REFERENCE__TYPE_CODE = CDAPackage.REFERENCE__TYPE_CODE;

	/**
	 * The number of structural features of the '<em>Advance Directive Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_REFERENCE_FEATURE_COUNT = CDAPackage.REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EncounterLocationImpl <em>Encounter Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EncounterLocationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEncounterLocation()
	 * @generated
	 */
	int ENCOUNTER_LOCATION = 67;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_LOCATION__REALM_CODE = CDAPackage.PARTICIPANT2__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_LOCATION__TYPE_ID = CDAPackage.PARTICIPANT2__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_LOCATION__TEMPLATE_ID = CDAPackage.PARTICIPANT2__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_LOCATION__TIME = CDAPackage.PARTICIPANT2__TIME;

	/**
	 * The feature id for the '<em><b>Awareness Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_LOCATION__AWARENESS_CODE = CDAPackage.PARTICIPANT2__AWARENESS_CODE;

	/**
	 * The feature id for the '<em><b>Participant Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_LOCATION__PARTICIPANT_ROLE = CDAPackage.PARTICIPANT2__PARTICIPANT_ROLE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_LOCATION__NULL_FLAVOR = CDAPackage.PARTICIPANT2__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_LOCATION__TYPE_CODE = CDAPackage.PARTICIPANT2__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_LOCATION__CONTEXT_CONTROL_CODE = CDAPackage.PARTICIPANT2__CONTEXT_CONTROL_CODE;

	/**
	 * The number of structural features of the '<em>Encounter Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_LOCATION_FEATURE_COUNT = CDAPackage.PARTICIPANT2_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PayerEntityImpl <em>Payer Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PayerEntityImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPayerEntity()
	 * @generated
	 */
	int PAYER_ENTITY = 68;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTITY__REALM_CODE = CDAPackage.ASSIGNED_ENTITY__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTITY__TYPE_ID = CDAPackage.ASSIGNED_ENTITY__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTITY__TEMPLATE_ID = CDAPackage.ASSIGNED_ENTITY__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTITY__ID = CDAPackage.ASSIGNED_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTITY__CODE = CDAPackage.ASSIGNED_ENTITY__CODE;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTITY__ADDR = CDAPackage.ASSIGNED_ENTITY__ADDR;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTITY__TELECOM = CDAPackage.ASSIGNED_ENTITY__TELECOM;

	/**
	 * The feature id for the '<em><b>Assigned Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTITY__ASSIGNED_PERSON = CDAPackage.ASSIGNED_ENTITY__ASSIGNED_PERSON;

	/**
	 * The feature id for the '<em><b>Represented Organization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTITY__REPRESENTED_ORGANIZATION = CDAPackage.ASSIGNED_ENTITY__REPRESENTED_ORGANIZATION;

	/**
	 * The feature id for the '<em><b>SDTC Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTITY__SDTC_PATIENT = CDAPackage.ASSIGNED_ENTITY__SDTC_PATIENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTITY__NULL_FLAVOR = CDAPackage.ASSIGNED_ENTITY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTITY__CLASS_CODE = CDAPackage.ASSIGNED_ENTITY__CLASS_CODE;

	/**
	 * The number of structural features of the '<em>Payer Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTITY_FEATURE_COUNT = CDAPackage.ASSIGNED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.CoveredPartyImpl <em>Covered Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.CoveredPartyImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getCoveredParty()
	 * @generated
	 */
	int COVERED_PARTY = 69;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_PARTY__REALM_CODE = CDAPackage.PARTICIPANT_ROLE__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_PARTY__TYPE_ID = CDAPackage.PARTICIPANT_ROLE__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_PARTY__TEMPLATE_ID = CDAPackage.PARTICIPANT_ROLE__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_PARTY__ID = CDAPackage.PARTICIPANT_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_PARTY__CODE = CDAPackage.PARTICIPANT_ROLE__CODE;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_PARTY__ADDR = CDAPackage.PARTICIPANT_ROLE__ADDR;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_PARTY__TELECOM = CDAPackage.PARTICIPANT_ROLE__TELECOM;

	/**
	 * The feature id for the '<em><b>Playing Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_PARTY__PLAYING_DEVICE = CDAPackage.PARTICIPANT_ROLE__PLAYING_DEVICE;

	/**
	 * The feature id for the '<em><b>Playing Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_PARTY__PLAYING_ENTITY = CDAPackage.PARTICIPANT_ROLE__PLAYING_ENTITY;

	/**
	 * The feature id for the '<em><b>Scoping Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_PARTY__SCOPING_ENTITY = CDAPackage.PARTICIPANT_ROLE__SCOPING_ENTITY;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_PARTY__NULL_FLAVOR = CDAPackage.PARTICIPANT_ROLE__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_PARTY__CLASS_CODE = CDAPackage.PARTICIPANT_ROLE__CLASS_CODE;

	/**
	 * The number of structural features of the '<em>Covered Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_PARTY_FEATURE_COUNT = CDAPackage.PARTICIPANT_ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PolicySubscriberImpl <em>Policy Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PolicySubscriberImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPolicySubscriber()
	 * @generated
	 */
	int POLICY_SUBSCRIBER = 70;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SUBSCRIBER__REALM_CODE = CDAPackage.PARTICIPANT_ROLE__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SUBSCRIBER__TYPE_ID = CDAPackage.PARTICIPANT_ROLE__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SUBSCRIBER__TEMPLATE_ID = CDAPackage.PARTICIPANT_ROLE__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SUBSCRIBER__ID = CDAPackage.PARTICIPANT_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SUBSCRIBER__CODE = CDAPackage.PARTICIPANT_ROLE__CODE;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SUBSCRIBER__ADDR = CDAPackage.PARTICIPANT_ROLE__ADDR;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SUBSCRIBER__TELECOM = CDAPackage.PARTICIPANT_ROLE__TELECOM;

	/**
	 * The feature id for the '<em><b>Playing Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SUBSCRIBER__PLAYING_DEVICE = CDAPackage.PARTICIPANT_ROLE__PLAYING_DEVICE;

	/**
	 * The feature id for the '<em><b>Playing Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SUBSCRIBER__PLAYING_ENTITY = CDAPackage.PARTICIPANT_ROLE__PLAYING_ENTITY;

	/**
	 * The feature id for the '<em><b>Scoping Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SUBSCRIBER__SCOPING_ENTITY = CDAPackage.PARTICIPANT_ROLE__SCOPING_ENTITY;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SUBSCRIBER__NULL_FLAVOR = CDAPackage.PARTICIPANT_ROLE__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SUBSCRIBER__CLASS_CODE = CDAPackage.PARTICIPANT_ROLE__CLASS_CODE;

	/**
	 * The number of structural features of the '<em>Policy Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SUBSCRIBER_FEATURE_COUNT = CDAPackage.PARTICIPANT_ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SupportImpl <em>Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SupportImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSupport()
	 * @generated
	 */
	int SUPPORT = 71;

	/**
	 * The number of structural features of the '<em>Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HistoryOfPastIllnessSectionImpl <em>History Of Past Illness Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HistoryOfPastIllnessSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHistoryOfPastIllnessSection()
	 * @generated
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION = 72;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>History Of Past Illness Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ChiefComplaintSectionImpl <em>Chief Complaint Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ChiefComplaintSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getChiefComplaintSection()
	 * @generated
	 */
	int CHIEF_COMPLAINT_SECTION = 73;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Chief Complaint Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ReasonForReferralSectionImpl <em>Reason For Referral Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ReasonForReferralSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getReasonForReferralSection()
	 * @generated
	 */
	int REASON_FOR_REFERRAL_SECTION = 74;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Reason For Referral Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HistoryOfPresentIllnessImpl <em>History Of Present Illness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HistoryOfPresentIllnessImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHistoryOfPresentIllness()
	 * @generated
	 */
	int HISTORY_OF_PRESENT_ILLNESS = 75;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>History Of Present Illness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HospitalAdmissionDiagnosisSectionImpl <em>Hospital Admission Diagnosis Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HospitalAdmissionDiagnosisSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHospitalAdmissionDiagnosisSection()
	 * @generated
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION = 76;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Hospital Admission Diagnosis Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.DischargeDiagnosisSectionImpl <em>Discharge Diagnosis Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.DischargeDiagnosisSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getDischargeDiagnosisSection()
	 * @generated
	 */
	int DISCHARGE_DIAGNOSIS_SECTION = 77;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Discharge Diagnosis Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AdmissionMedicationHistorySectionImpl <em>Admission Medication History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AdmissionMedicationHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAdmissionMedicationHistorySection()
	 * @generated
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION = 78;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Admission Medication History Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HospitalDischargeMedicationsSectionImpl <em>Hospital Discharge Medications Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HospitalDischargeMedicationsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHospitalDischargeMedicationsSection()
	 * @generated
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION = 79;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Hospital Discharge Medications Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationsAdministeredSectionImpl <em>Medications Administered Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationsAdministeredSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationsAdministeredSection()
	 * @generated
	 */
	int MEDICATIONS_ADMINISTERED_SECTION = 80;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Medications Administered Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PhysicalExamSectionImpl <em>Physical Exam Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PhysicalExamSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPhysicalExamSection()
	 * @generated
	 */
	int PHYSICAL_EXAM_SECTION = 81;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Physical Exam Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.GeneralAppearanceSectionImpl <em>General Appearance Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.GeneralAppearanceSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getGeneralAppearanceSection()
	 * @generated
	 */
	int GENERAL_APPEARANCE_SECTION = 82;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>General Appearance Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.VisibleImplantedMedicalDevicesSectionImpl <em>Visible Implanted Medical Devices Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.VisibleImplantedMedicalDevicesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getVisibleImplantedMedicalDevicesSection()
	 * @generated
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION = 83;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Visible Implanted Medical Devices Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.IntegumentarySystemSectionImpl <em>Integumentary System Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.IntegumentarySystemSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getIntegumentarySystemSection()
	 * @generated
	 */
	int INTEGUMENTARY_SYSTEM_SECTION = 84;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Integumentary System Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HeadSectionImpl <em>Head Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HeadSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHeadSection()
	 * @generated
	 */
	int HEAD_SECTION = 85;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Head Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EyesSectionImpl <em>Eyes Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EyesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEyesSection()
	 * @generated
	 */
	int EYES_SECTION = 86;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Eyes Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EarsNoseMouthThroatSectionImpl <em>Ears Nose Mouth Throat Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EarsNoseMouthThroatSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEarsNoseMouthThroatSection()
	 * @generated
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION = 87;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Ears Nose Mouth Throat Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EarsSectionImpl <em>Ears Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EarsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEarsSection()
	 * @generated
	 */
	int EARS_SECTION = 88;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Ears Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.NoseSectionImpl <em>Nose Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.NoseSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getNoseSection()
	 * @generated
	 */
	int NOSE_SECTION = 89;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Nose Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MouthThroatTeethSectionImpl <em>Mouth Throat Teeth Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MouthThroatTeethSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMouthThroatTeethSection()
	 * @generated
	 */
	int MOUTH_THROAT_TEETH_SECTION = 90;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Mouth Throat Teeth Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.NeckSectionImpl <em>Neck Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.NeckSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getNeckSection()
	 * @generated
	 */
	int NECK_SECTION = 91;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Neck Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EndocrineSystemSectionImpl <em>Endocrine System Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EndocrineSystemSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEndocrineSystemSection()
	 * @generated
	 */
	int ENDOCRINE_SYSTEM_SECTION = 92;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Endocrine System Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ThoraxLungsSectionImpl <em>Thorax Lungs Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ThoraxLungsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getThoraxLungsSection()
	 * @generated
	 */
	int THORAX_LUNGS_SECTION = 93;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Thorax Lungs Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ChestWallSectionImpl <em>Chest Wall Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ChestWallSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getChestWallSection()
	 * @generated
	 */
	int CHEST_WALL_SECTION = 94;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Chest Wall Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.BreastSectionImpl <em>Breast Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.BreastSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getBreastSection()
	 * @generated
	 */
	int BREAST_SECTION = 95;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Breast Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HeartSectionImpl <em>Heart Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HeartSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHeartSection()
	 * @generated
	 */
	int HEART_SECTION = 96;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Heart Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.RespiratorySystemSectionImpl <em>Respiratory System Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.RespiratorySystemSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getRespiratorySystemSection()
	 * @generated
	 */
	int RESPIRATORY_SYSTEM_SECTION = 97;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Respiratory System Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AbdomenSectionImpl <em>Abdomen Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AbdomenSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAbdomenSection()
	 * @generated
	 */
	int ABDOMEN_SECTION = 98;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Abdomen Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.LymphaticSectionImpl <em>Lymphatic Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.LymphaticSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getLymphaticSection()
	 * @generated
	 */
	int LYMPHATIC_SECTION = 99;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Lymphatic Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.VesselsSectionImpl <em>Vessels Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.VesselsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getVesselsSection()
	 * @generated
	 */
	int VESSELS_SECTION = 100;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Vessels Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MusculoskeletalSystemSectionImpl <em>Musculoskeletal System Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MusculoskeletalSystemSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMusculoskeletalSystemSection()
	 * @generated
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION = 101;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Musculoskeletal System Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.NeurologicSystemSectionImpl <em>Neurologic System Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.NeurologicSystemSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getNeurologicSystemSection()
	 * @generated
	 */
	int NEUROLOGIC_SYSTEM_SECTION = 102;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Neurologic System Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.GenitaliaSectionImpl <em>Genitalia Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.GenitaliaSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getGenitaliaSection()
	 * @generated
	 */
	int GENITALIA_SECTION = 103;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Genitalia Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.RectumSectionImpl <em>Rectum Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.RectumSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getRectumSection()
	 * @generated
	 */
	int RECTUM_SECTION = 104;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Rectum Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ExtremitiesSectionImpl <em>Extremities Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ExtremitiesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getExtremitiesSection()
	 * @generated
	 */
	int EXTREMITIES_SECTION = 105;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Extremities Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ReviewOfSystemsSectionImpl <em>Review Of Systems Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ReviewOfSystemsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getReviewOfSystemsSection()
	 * @generated
	 */
	int REVIEW_OF_SYSTEMS_SECTION = 106;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Review Of Systems Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HospitalCourseSectionImpl <em>Hospital Course Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HospitalCourseSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHospitalCourseSection()
	 * @generated
	 */
	int HOSPITAL_COURSE_SECTION = 107;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Hospital Course Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AssessmentAndPlanSectionImpl <em>Assessment And Plan Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AssessmentAndPlanSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAssessmentAndPlanSection()
	 * @generated
	 */
	int ASSESSMENT_AND_PLAN_SECTION = 108;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Assessment And Plan Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ConditionEntryImpl <em>Condition Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConditionEntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getConditionEntry()
	 * @generated
	 */
	int CONDITION_ENTRY = 109;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Condition Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.CauseOfDeathObservationImpl <em>Cause Of Death Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.CauseOfDeathObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getCauseOfDeathObservation()
	 * @generated
	 */
	int CAUSE_OF_DEATH_OBSERVATION = 110;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Cause Of Death Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.LanguageSpokenImpl <em>Language Spoken</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.LanguageSpokenImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getLanguageSpoken()
	 * @generated
	 */
	int LANGUAGE_SPOKEN = 111;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__REALM_CODE = CDAPackage.LANGUAGE_COMMUNICATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__TYPE_ID = CDAPackage.LANGUAGE_COMMUNICATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__TEMPLATE_ID = CDAPackage.LANGUAGE_COMMUNICATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__LANGUAGE_CODE = CDAPackage.LANGUAGE_COMMUNICATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Mode Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__MODE_CODE = CDAPackage.LANGUAGE_COMMUNICATION__MODE_CODE;

	/**
	 * The feature id for the '<em><b>Proficiency Level Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__PROFICIENCY_LEVEL_CODE = CDAPackage.LANGUAGE_COMMUNICATION__PROFICIENCY_LEVEL_CODE;

	/**
	 * The feature id for the '<em><b>Preference Ind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__PREFERENCE_IND = CDAPackage.LANGUAGE_COMMUNICATION__PREFERENCE_IND;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__NULL_FLAVOR = CDAPackage.LANGUAGE_COMMUNICATION__NULL_FLAVOR;

	/**
	 * The number of structural features of the '<em>Language Spoken</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN_FEATURE_COUNT = CDAPackage.LANGUAGE_COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HealthcareProviderImpl <em>Healthcare Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HealthcareProviderImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHealthcareProvider()
	 * @generated
	 */
	int HEALTHCARE_PROVIDER = 112;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__REALM_CODE = CDAPackage.PERFORMER1__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__TYPE_ID = CDAPackage.PERFORMER1__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__TEMPLATE_ID = CDAPackage.PERFORMER1__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Function Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__FUNCTION_CODE = CDAPackage.PERFORMER1__FUNCTION_CODE;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__TIME = CDAPackage.PERFORMER1__TIME;

	/**
	 * The feature id for the '<em><b>Assigned Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__ASSIGNED_ENTITY = CDAPackage.PERFORMER1__ASSIGNED_ENTITY;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__NULL_FLAVOR = CDAPackage.PERFORMER1__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__TYPE_CODE = CDAPackage.PERFORMER1__TYPE_CODE;

	/**
	 * The number of structural features of the '<em>Healthcare Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER_FEATURE_COUNT = CDAPackage.PERFORMER1_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationNormalDoseImpl <em>Medication Normal Dose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationNormalDoseImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationNormalDose()
	 * @generated
	 */
	int MEDICATION_NORMAL_DOSE = 113;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__REALM_CODE = MEDICATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__TYPE_ID = MEDICATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__TEMPLATE_ID = MEDICATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__ID = MEDICATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__CODE = MEDICATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__TEXT = MEDICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__STATUS_CODE = MEDICATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__EFFECTIVE_TIME = MEDICATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__PRIORITY_CODE = MEDICATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__REPEAT_NUMBER = MEDICATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__ROUTE_CODE = MEDICATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__APPROACH_SITE_CODE = MEDICATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__DOSE_QUANTITY = MEDICATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__RATE_QUANTITY = MEDICATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__MAX_DOSE_QUANTITY = MEDICATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__ADMINISTRATION_UNIT_CODE = MEDICATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__SUBJECT = MEDICATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__SPECIMEN = MEDICATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__CONSUMABLE = MEDICATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__PERFORMER = MEDICATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__AUTHOR = MEDICATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__INFORMANT = MEDICATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__PARTICIPANT = MEDICATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__ENTRY_RELATIONSHIP = MEDICATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__REFERENCE = MEDICATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__PRECONDITION = MEDICATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__NULL_FLAVOR = MEDICATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__CLASS_CODE = MEDICATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__MOOD_CODE = MEDICATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__NEGATION_IND = MEDICATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication Normal Dose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE_FEATURE_COUNT = MEDICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationSplitDoseImpl <em>Medication Split Dose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationSplitDoseImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationSplitDose()
	 * @generated
	 */
	int MEDICATION_SPLIT_DOSE = 114;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__REALM_CODE = MEDICATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__TYPE_ID = MEDICATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__TEMPLATE_ID = MEDICATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__ID = MEDICATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__CODE = MEDICATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__TEXT = MEDICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__STATUS_CODE = MEDICATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__EFFECTIVE_TIME = MEDICATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__PRIORITY_CODE = MEDICATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__REPEAT_NUMBER = MEDICATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__ROUTE_CODE = MEDICATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__APPROACH_SITE_CODE = MEDICATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__DOSE_QUANTITY = MEDICATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__RATE_QUANTITY = MEDICATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__MAX_DOSE_QUANTITY = MEDICATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__ADMINISTRATION_UNIT_CODE = MEDICATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__SUBJECT = MEDICATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__SPECIMEN = MEDICATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__CONSUMABLE = MEDICATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__PERFORMER = MEDICATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__AUTHOR = MEDICATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__INFORMANT = MEDICATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__PARTICIPANT = MEDICATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__ENTRY_RELATIONSHIP = MEDICATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__REFERENCE = MEDICATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__PRECONDITION = MEDICATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__NULL_FLAVOR = MEDICATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__CLASS_CODE = MEDICATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__MOOD_CODE = MEDICATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__NEGATION_IND = MEDICATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication Split Dose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE_FEATURE_COUNT = MEDICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationTaperedDoseImpl <em>Medication Tapered Dose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationTaperedDoseImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationTaperedDose()
	 * @generated
	 */
	int MEDICATION_TAPERED_DOSE = 115;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__REALM_CODE = MEDICATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__TYPE_ID = MEDICATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__TEMPLATE_ID = MEDICATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__ID = MEDICATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__CODE = MEDICATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__TEXT = MEDICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__STATUS_CODE = MEDICATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__EFFECTIVE_TIME = MEDICATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__PRIORITY_CODE = MEDICATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__REPEAT_NUMBER = MEDICATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__ROUTE_CODE = MEDICATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__APPROACH_SITE_CODE = MEDICATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__DOSE_QUANTITY = MEDICATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__RATE_QUANTITY = MEDICATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__MAX_DOSE_QUANTITY = MEDICATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__ADMINISTRATION_UNIT_CODE = MEDICATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__SUBJECT = MEDICATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__SPECIMEN = MEDICATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__CONSUMABLE = MEDICATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__PERFORMER = MEDICATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__AUTHOR = MEDICATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__INFORMANT = MEDICATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__PARTICIPANT = MEDICATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__ENTRY_RELATIONSHIP = MEDICATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__REFERENCE = MEDICATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__PRECONDITION = MEDICATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__NULL_FLAVOR = MEDICATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__CLASS_CODE = MEDICATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__MOOD_CODE = MEDICATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__NEGATION_IND = MEDICATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication Tapered Dose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE_FEATURE_COUNT = MEDICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationConditionalDoseImpl <em>Medication Conditional Dose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationConditionalDoseImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationConditionalDose()
	 * @generated
	 */
	int MEDICATION_CONDITIONAL_DOSE = 116;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__REALM_CODE = MEDICATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__TYPE_ID = MEDICATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__TEMPLATE_ID = MEDICATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__ID = MEDICATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__CODE = MEDICATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__TEXT = MEDICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__STATUS_CODE = MEDICATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__EFFECTIVE_TIME = MEDICATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__PRIORITY_CODE = MEDICATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__REPEAT_NUMBER = MEDICATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__ROUTE_CODE = MEDICATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__APPROACH_SITE_CODE = MEDICATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__DOSE_QUANTITY = MEDICATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__RATE_QUANTITY = MEDICATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__MAX_DOSE_QUANTITY = MEDICATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__ADMINISTRATION_UNIT_CODE = MEDICATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__SUBJECT = MEDICATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__SPECIMEN = MEDICATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__CONSUMABLE = MEDICATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__PERFORMER = MEDICATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__AUTHOR = MEDICATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__INFORMANT = MEDICATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__PARTICIPANT = MEDICATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__ENTRY_RELATIONSHIP = MEDICATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__REFERENCE = MEDICATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__PRECONDITION = MEDICATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__NULL_FLAVOR = MEDICATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__CLASS_CODE = MEDICATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__MOOD_CODE = MEDICATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__NEGATION_IND = MEDICATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication Conditional Dose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE_FEATURE_COUNT = MEDICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationCombinationMedicationImpl <em>Medication Combination Medication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationCombinationMedicationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationCombinationMedication()
	 * @generated
	 */
	int MEDICATION_COMBINATION_MEDICATION = 117;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__REALM_CODE = MEDICATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__TYPE_ID = MEDICATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__TEMPLATE_ID = MEDICATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__ID = MEDICATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__CODE = MEDICATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__TEXT = MEDICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__STATUS_CODE = MEDICATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__EFFECTIVE_TIME = MEDICATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__PRIORITY_CODE = MEDICATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__REPEAT_NUMBER = MEDICATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__ROUTE_CODE = MEDICATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__APPROACH_SITE_CODE = MEDICATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__DOSE_QUANTITY = MEDICATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__RATE_QUANTITY = MEDICATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__MAX_DOSE_QUANTITY = MEDICATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__ADMINISTRATION_UNIT_CODE = MEDICATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__SUBJECT = MEDICATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__SPECIMEN = MEDICATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__CONSUMABLE = MEDICATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__PERFORMER = MEDICATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__AUTHOR = MEDICATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__INFORMANT = MEDICATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__PARTICIPANT = MEDICATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__ENTRY_RELATIONSHIP = MEDICATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__REFERENCE = MEDICATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__PRECONDITION = MEDICATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__NULL_FLAVOR = MEDICATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__CLASS_CODE = MEDICATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__MOOD_CODE = MEDICATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__NEGATION_IND = MEDICATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Medication Combination Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION_FEATURE_COUNT = MEDICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SupportGuardianImpl <em>Support Guardian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SupportGuardianImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSupportGuardian()
	 * @generated
	 */
	int SUPPORT_GUARDIAN = 118;

	/**
	 * The number of structural features of the '<em>Support Guardian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_GUARDIAN_FEATURE_COUNT = SUPPORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SupportParticipantImpl <em>Support Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SupportParticipantImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSupportParticipant()
	 * @generated
	 */
	int SUPPORT_PARTICIPANT = 119;

	/**
	 * The number of structural features of the '<em>Support Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PARTICIPANT_FEATURE_COUNT = SUPPORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.UnstructuredDocumentImpl <em>Unstructured Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.UnstructuredDocumentImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getUnstructuredDocument()
	 * @generated
	 */
	int UNSTRUCTURED_DOCUMENT = 120;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__REALM_CODE = GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__TYPE_ID = GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__TEMPLATE_ID = GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__ID = GENERAL_HEADER_CONSTRAINTS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__CODE = GENERAL_HEADER_CONSTRAINTS__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__TITLE = GENERAL_HEADER_CONSTRAINTS__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__EFFECTIVE_TIME = GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__CONFIDENTIALITY_CODE = GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__LANGUAGE_CODE = GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__SET_ID = GENERAL_HEADER_CONSTRAINTS__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__VERSION_NUMBER = GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__COPY_TIME = GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__RECORD_TARGET = GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__AUTHOR = GENERAL_HEADER_CONSTRAINTS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__DATA_ENTERER = GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__INFORMANT = GENERAL_HEADER_CONSTRAINTS__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__CUSTODIAN = GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__INFORMATION_RECIPIENT = GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__LEGAL_AUTHENTICATOR = GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__AUTHENTICATOR = GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__PARTICIPANT = GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__IN_FULFILLMENT_OF = GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__DOCUMENTATION_OF = GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__RELATED_DOCUMENT = GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__AUTHORIZATION = GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__COMPONENT_OF = GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__COMPONENT = GENERAL_HEADER_CONSTRAINTS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__NULL_FLAVOR = GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__CLASS_CODE = GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__MOOD_CODE = GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Unstructured Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT_FEATURE_COUNT = GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ScanOriginalAuthorImpl <em>Scan Original Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ScanOriginalAuthorImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getScanOriginalAuthor()
	 * @generated
	 */
	int SCAN_ORIGINAL_AUTHOR = 121;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ORIGINAL_AUTHOR__REALM_CODE = CDAPackage.AUTHOR__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ORIGINAL_AUTHOR__TYPE_ID = CDAPackage.AUTHOR__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ORIGINAL_AUTHOR__TEMPLATE_ID = CDAPackage.AUTHOR__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Function Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ORIGINAL_AUTHOR__FUNCTION_CODE = CDAPackage.AUTHOR__FUNCTION_CODE;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ORIGINAL_AUTHOR__TIME = CDAPackage.AUTHOR__TIME;

	/**
	 * The feature id for the '<em><b>Assigned Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ORIGINAL_AUTHOR__ASSIGNED_AUTHOR = CDAPackage.AUTHOR__ASSIGNED_AUTHOR;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ORIGINAL_AUTHOR__NULL_FLAVOR = CDAPackage.AUTHOR__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ORIGINAL_AUTHOR__TYPE_CODE = CDAPackage.AUTHOR__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ORIGINAL_AUTHOR__CONTEXT_CONTROL_CODE = CDAPackage.AUTHOR__CONTEXT_CONTROL_CODE;

	/**
	 * The number of structural features of the '<em>Scan Original Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ORIGINAL_AUTHOR_FEATURE_COUNT = CDAPackage.AUTHOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ScanningDeviceImpl <em>Scanning Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ScanningDeviceImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getScanningDevice()
	 * @generated
	 */
	int SCANNING_DEVICE = 122;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNING_DEVICE__REALM_CODE = CDAPackage.AUTHOR__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNING_DEVICE__TYPE_ID = CDAPackage.AUTHOR__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNING_DEVICE__TEMPLATE_ID = CDAPackage.AUTHOR__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Function Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNING_DEVICE__FUNCTION_CODE = CDAPackage.AUTHOR__FUNCTION_CODE;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNING_DEVICE__TIME = CDAPackage.AUTHOR__TIME;

	/**
	 * The feature id for the '<em><b>Assigned Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNING_DEVICE__ASSIGNED_AUTHOR = CDAPackage.AUTHOR__ASSIGNED_AUTHOR;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNING_DEVICE__NULL_FLAVOR = CDAPackage.AUTHOR__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNING_DEVICE__TYPE_CODE = CDAPackage.AUTHOR__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNING_DEVICE__CONTEXT_CONTROL_CODE = CDAPackage.AUTHOR__CONTEXT_CONTROL_CODE;

	/**
	 * The number of structural features of the '<em>Scanning Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNING_DEVICE_FEATURE_COUNT = CDAPackage.AUTHOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ScanDataEntererImpl <em>Scan Data Enterer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ScanDataEntererImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getScanDataEnterer()
	 * @generated
	 */
	int SCAN_DATA_ENTERER = 123;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_DATA_ENTERER__REALM_CODE = CDAPackage.DATA_ENTERER__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_DATA_ENTERER__TYPE_ID = CDAPackage.DATA_ENTERER__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_DATA_ENTERER__TEMPLATE_ID = CDAPackage.DATA_ENTERER__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_DATA_ENTERER__TIME = CDAPackage.DATA_ENTERER__TIME;

	/**
	 * The feature id for the '<em><b>Assigned Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_DATA_ENTERER__ASSIGNED_ENTITY = CDAPackage.DATA_ENTERER__ASSIGNED_ENTITY;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_DATA_ENTERER__NULL_FLAVOR = CDAPackage.DATA_ENTERER__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_DATA_ENTERER__TYPE_CODE = CDAPackage.DATA_ENTERER__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Context Control Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_DATA_ENTERER__CONTEXT_CONTROL_CODE = CDAPackage.DATA_ENTERER__CONTEXT_CONTROL_CODE;

	/**
	 * The number of structural features of the '<em>Scan Data Enterer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_DATA_ENTERER_FEATURE_COUNT = CDAPackage.DATA_ENTERER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationInformationImpl <em>Medication Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationInformationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationInformation()
	 * @generated
	 */
	int MEDICATION_INFORMATION = 124;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__REALM_CODE = CDAPackage.MANUFACTURED_PRODUCT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__TYPE_ID = CDAPackage.MANUFACTURED_PRODUCT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__TEMPLATE_ID = CDAPackage.MANUFACTURED_PRODUCT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__ID = CDAPackage.MANUFACTURED_PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Manufactured Labeled Drug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__MANUFACTURED_LABELED_DRUG = CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_LABELED_DRUG;

	/**
	 * The feature id for the '<em><b>Manufactured Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__MANUFACTURED_MATERIAL = CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURED_MATERIAL;

	/**
	 * The feature id for the '<em><b>Manufacturer Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__MANUFACTURER_ORGANIZATION = CDAPackage.MANUFACTURED_PRODUCT__MANUFACTURER_ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__NULL_FLAVOR = CDAPackage.MANUFACTURED_PRODUCT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__CLASS_CODE = CDAPackage.MANUFACTURED_PRODUCT__CLASS_CODE;

	/**
	 * The number of structural features of the '<em>Medication Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION_FEATURE_COUNT = CDAPackage.MANUFACTURED_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.UnstructuredOrScannedDocumentImpl <em>Unstructured Or Scanned Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.UnstructuredOrScannedDocumentImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getUnstructuredOrScannedDocument()
	 * @generated
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT = 125;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__REALM_CODE = GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__TYPE_ID = GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__TEMPLATE_ID = GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__ID = GENERAL_HEADER_CONSTRAINTS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__CODE = GENERAL_HEADER_CONSTRAINTS__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__TITLE = GENERAL_HEADER_CONSTRAINTS__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__EFFECTIVE_TIME = GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__CONFIDENTIALITY_CODE = GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__LANGUAGE_CODE = GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__SET_ID = GENERAL_HEADER_CONSTRAINTS__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__VERSION_NUMBER = GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__COPY_TIME = GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__RECORD_TARGET = GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__AUTHOR = GENERAL_HEADER_CONSTRAINTS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__DATA_ENTERER = GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__INFORMANT = GENERAL_HEADER_CONSTRAINTS__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__CUSTODIAN = GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__INFORMATION_RECIPIENT = GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__LEGAL_AUTHENTICATOR = GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__AUTHENTICATOR = GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__PARTICIPANT = GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__IN_FULFILLMENT_OF = GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__DOCUMENTATION_OF = GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__RELATED_DOCUMENT = GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__AUTHORIZATION = GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__COMPONENT_OF = GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__COMPONENT = GENERAL_HEADER_CONSTRAINTS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__NULL_FLAVOR = GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__CLASS_CODE = GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__MOOD_CODE = GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Unstructured Or Scanned Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT_FEATURE_COUNT = GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ReferralSummaryImpl <em>Referral Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ReferralSummaryImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getReferralSummary()
	 * @generated
	 */
	int REFERRAL_SUMMARY = 126;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__REALM_CODE = GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__TYPE_ID = GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__TEMPLATE_ID = GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__ID = GENERAL_HEADER_CONSTRAINTS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__CODE = GENERAL_HEADER_CONSTRAINTS__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__TITLE = GENERAL_HEADER_CONSTRAINTS__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__EFFECTIVE_TIME = GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__CONFIDENTIALITY_CODE = GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__LANGUAGE_CODE = GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__SET_ID = GENERAL_HEADER_CONSTRAINTS__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__VERSION_NUMBER = GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__COPY_TIME = GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__RECORD_TARGET = GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__AUTHOR = GENERAL_HEADER_CONSTRAINTS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__DATA_ENTERER = GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__INFORMANT = GENERAL_HEADER_CONSTRAINTS__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__CUSTODIAN = GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__INFORMATION_RECIPIENT = GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__LEGAL_AUTHENTICATOR = GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__AUTHENTICATOR = GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__PARTICIPANT = GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__IN_FULFILLMENT_OF = GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__DOCUMENTATION_OF = GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__RELATED_DOCUMENT = GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__AUTHORIZATION = GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__COMPONENT_OF = GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__COMPONENT = GENERAL_HEADER_CONSTRAINTS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__NULL_FLAVOR = GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__CLASS_CODE = GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__MOOD_CODE = GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Referral Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY_FEATURE_COUNT = GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.DischargeSummaryImpl <em>Discharge Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.DischargeSummaryImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getDischargeSummary()
	 * @generated
	 */
	int DISCHARGE_SUMMARY = 127;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__REALM_CODE = GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__TYPE_ID = GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__TEMPLATE_ID = GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__ID = GENERAL_HEADER_CONSTRAINTS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__CODE = GENERAL_HEADER_CONSTRAINTS__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__TITLE = GENERAL_HEADER_CONSTRAINTS__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__EFFECTIVE_TIME = GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__CONFIDENTIALITY_CODE = GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__LANGUAGE_CODE = GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__SET_ID = GENERAL_HEADER_CONSTRAINTS__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__VERSION_NUMBER = GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__COPY_TIME = GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__RECORD_TARGET = GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__AUTHOR = GENERAL_HEADER_CONSTRAINTS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__DATA_ENTERER = GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__INFORMANT = GENERAL_HEADER_CONSTRAINTS__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__CUSTODIAN = GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__INFORMATION_RECIPIENT = GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__LEGAL_AUTHENTICATOR = GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__AUTHENTICATOR = GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__PARTICIPANT = GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__IN_FULFILLMENT_OF = GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__DOCUMENTATION_OF = GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__RELATED_DOCUMENT = GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__AUTHORIZATION = GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__COMPONENT_OF = GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__COMPONENT = GENERAL_HEADER_CONSTRAINTS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__NULL_FLAVOR = GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__CLASS_CODE = GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__MOOD_CODE = GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Discharge Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY_FEATURE_COUNT = GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.DischargeDietImpl <em>Discharge Diet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.DischargeDietImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getDischargeDiet()
	 * @generated
	 */
	int DISCHARGE_DIET = 128;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Discharge Diet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints <em>General Header Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Header Constraints</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints
	 * @generated
	 */
	EClass getGeneralHeaderConstraints();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity <em>Allergy Drug Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allergy Drug Sensitivity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity
	 * @generated
	 */
	EClass getAllergyDrugSensitivity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation <em>Episode Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Episode Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation
	 * @generated
	 */
	EClass getEpisodeObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergyIntolerance <em>Allergy Intolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allergy Intolerance</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergyIntolerance
	 * @generated
	 */
	EClass getAllergyIntolerance();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer <em>Problem Entry Reaction Observation Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Entry Reaction Observation Container</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer
	 * @generated
	 */
	EClass getProblemEntryReactionObservationContainer();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.AgeObservation <em>Age Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Age Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AgeObservation
	 * @generated
	 */
	EClass getAgeObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Severity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Severity
	 * @generated
	 */
	EClass getSeverity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation <em>Problem Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation
	 * @generated
	 */
	EClass getProblemStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation <em>Health Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation
	 * @generated
	 */
	EClass getHealthStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.Medication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Medication
	 * @generated
	 */
	EClass getMedication();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationType <em>Medication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationType
	 * @generated
	 */
	EClass getMedicationType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation <em>Medication Order Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Order Information</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation
	 * @generated
	 */
	EClass getMedicationOrderInformation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation <em>Medication Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation
	 * @generated
	 */
	EClass getMedicationStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance <em>Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Instance</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProductInstance
	 * @generated
	 */
	EClass getProductInstance();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFullfillmentInstructions <em>Medication Fullfillment Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Fullfillment Instructions</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationFullfillmentInstructions
	 * @generated
	 */
	EClass getMedicationFullfillmentInstructions();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation <em>Medication Series Number Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Series Number Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation
	 * @generated
	 */
	EClass getMedicationSeriesNumberObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.InternalReference <em>Internal Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.InternalReference
	 * @generated
	 */
	EClass getInternalReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions <em>Patient Medical Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Medical Instructions</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions
	 * @generated
	 */
	EClass getPatientMedicalInstructions();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary <em>Patient Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Summary</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PatientSummary
	 * @generated
	 */
	EClass getPatientSummary();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection <em>Advance Directives Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance Directives Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection
	 * @generated
	 */
	EClass getAdvanceDirectivesSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective <em>Advance Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance Directive</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective
	 * @generated
	 */
	EClass getAdvanceDirective();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveStatusObservation <em>Advance Directive Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance Directive Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveStatusObservation
	 * @generated
	 */
	EClass getAdvanceDirectiveStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesReactionsSection <em>Allergies Reactions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allergies Reactions Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergiesReactionsSection
	 * @generated
	 */
	EClass getAllergiesReactionsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemListSection <em>Problem List Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem List Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemListSection
	 * @generated
	 */
	EClass getProblemListSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection <em>Encounters Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encounters Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncountersSection
	 * @generated
	 */
	EClass getEncountersSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.Encounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encounter</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Encounter
	 * @generated
	 */
	EClass getEncounter();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivity <em>Encounters Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encounters Activity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncountersActivity
	 * @generated
	 */
	EClass getEncountersActivity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection <em>Immunizations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immunizations Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection
	 * @generated
	 */
	EClass getImmunizationsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.Immunization <em>Immunization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immunization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Immunization
	 * @generated
	 */
	EClass getImmunization();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection <em>Payers Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payers Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PayersSection
	 * @generated
	 */
	EClass getPayersSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider <em>Insurance Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insurance Provider</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider
	 * @generated
	 */
	EClass getInsuranceProvider();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry <em>Payer Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payer Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PayerEntry
	 * @generated
	 */
	EClass getPayerEntry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection <em>Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medications Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsSection
	 * @generated
	 */
	EClass getMedicationsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection <em>Plan Of Care Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection
	 * @generated
	 */
	EClass getPlanOfCareSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct <em>Plan Of Care Activity Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Act</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct
	 * @generated
	 */
	EClass getPlanOfCareActivityAct();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter <em>Plan Of Care Activity Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Encounter</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter
	 * @generated
	 */
	EClass getPlanOfCareActivityEncounter();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation <em>Plan Of Care Activity Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation
	 * @generated
	 */
	EClass getPlanOfCareActivityObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure <em>Plan Of Care Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Procedure</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure
	 * @generated
	 */
	EClass getPlanOfCareActivityProcedure();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration <em>Plan Of Care Activity Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Substance Administration</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration
	 * @generated
	 */
	EClass getPlanOfCareActivitySubstanceAdministration();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply <em>Plan Of Care Activity Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Supply</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply
	 * @generated
	 */
	EClass getPlanOfCareActivitySupply();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyHistorySection <em>Pregnancy History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pregnancy History Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PregnancyHistorySection
	 * @generated
	 */
	EClass getPregnancyHistorySection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation <em>Pregnancy Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pregnancy Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation
	 * @generated
	 */
	EClass getPregnancyObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection <em>Surgeries Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surgeries Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection
	 * @generated
	 */
	EClass getSurgeriesSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ExternalReference
	 * @generated
	 */
	EClass getExternalReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure <em>Procedure Entry Procedure Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure
	 * @generated
	 */
	EClass getProcedureEntryProcedureActivityProcedure();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection <em>Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vital Signs Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection
	 * @generated
	 */
	EClass getVitalSignsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer <em>Vital Signs Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vital Signs Organizer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer
	 * @generated
	 */
	EClass getVitalSignsOrganizer();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign <em>Vital Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vital Sign</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSign
	 * @generated
	 */
	EClass getVitalSign();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection <em>Diagnostic Results Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagnostic Results Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection
	 * @generated
	 */
	EClass getDiagnosticResultsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer <em>Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Organizer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer
	 * @generated
	 */
	EClass getResultOrganizer();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection <em>Family History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family History Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection
	 * @generated
	 */
	EClass getFamilyHistorySection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistory <em>Family History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family History</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FamilyHistory
	 * @generated
	 */
	EClass getFamilyHistory();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation <em>Family History Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family History Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation
	 * @generated
	 */
	EClass getFamilyHistoryObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection <em>Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social History Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection
	 * @generated
	 */
	EClass getSocialHistorySection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistory <em>Social History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social History</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SocialHistory
	 * @generated
	 */
	EClass getSocialHistory();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryStatusObservation <em>Social History Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social History Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SocialHistoryStatusObservation
	 * @generated
	 */
	EClass getSocialHistoryStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection <em>Results Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultsSection
	 * @generated
	 */
	EClass getResultsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection <em>Medical Equipment Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medical Equipment Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection
	 * @generated
	 */
	EClass getMedicalEquipmentSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection <em>Functional Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Status Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection
	 * @generated
	 */
	EClass getFunctionalStatusSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PurposeSection <em>Purpose Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purpose Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PurposeSection
	 * @generated
	 */
	EClass getPurposeSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PurposeActivity <em>Purpose Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purpose Activity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PurposeActivity
	 * @generated
	 */
	EClass getPurposeActivity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveVerification <em>Advance Directive Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance Directive Verification</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveVerification
	 * @generated
	 */
	EClass getAdvanceDirectiveVerification();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveReference <em>Advance Directive Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance Directive Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveReference
	 * @generated
	 */
	EClass getAdvanceDirectiveReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.EncounterLocation <em>Encounter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encounter Location</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncounterLocation
	 * @generated
	 */
	EClass getEncounterLocation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntity <em>Payer Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payer Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PayerEntity
	 * @generated
	 */
	EClass getPayerEntity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.CoveredParty <em>Covered Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Covered Party</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CoveredParty
	 * @generated
	 */
	EClass getCoveredParty();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PolicySubscriber <em>Policy Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Subscriber</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PolicySubscriber
	 * @generated
	 */
	EClass getPolicySubscriber();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.Support <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Support
	 * @generated
	 */
	EClass getSupport();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection <em>History Of Past Illness Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Of Past Illness Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection
	 * @generated
	 */
	EClass getHistoryOfPastIllnessSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection <em>Chief Complaint Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chief Complaint Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection
	 * @generated
	 */
	EClass getChiefComplaintSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection <em>Reason For Referral Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reason For Referral Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection
	 * @generated
	 */
	EClass getReasonForReferralSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllness <em>History Of Present Illness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Of Present Illness</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllness
	 * @generated
	 */
	EClass getHistoryOfPresentIllness();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection <em>Hospital Admission Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital Admission Diagnosis Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection
	 * @generated
	 */
	EClass getHospitalAdmissionDiagnosisSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection <em>Discharge Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discharge Diagnosis Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection
	 * @generated
	 */
	EClass getDischargeDiagnosisSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationHistorySection <em>Admission Medication History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admission Medication History Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationHistorySection
	 * @generated
	 */
	EClass getAdmissionMedicationHistorySection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection <em>Hospital Discharge Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital Discharge Medications Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection
	 * @generated
	 */
	EClass getHospitalDischargeMedicationsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection <em>Medications Administered Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medications Administered Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection
	 * @generated
	 */
	EClass getMedicationsAdministeredSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection <em>Physical Exam Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Exam Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection
	 * @generated
	 */
	EClass getPhysicalExamSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralAppearanceSection <em>General Appearance Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Appearance Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralAppearanceSection
	 * @generated
	 */
	EClass getGeneralAppearanceSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.VisibleImplantedMedicalDevicesSection <em>Visible Implanted Medical Devices Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visible Implanted Medical Devices Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VisibleImplantedMedicalDevicesSection
	 * @generated
	 */
	EClass getVisibleImplantedMedicalDevicesSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.IntegumentarySystemSection <em>Integumentary System Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integumentary System Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.IntegumentarySystemSection
	 * @generated
	 */
	EClass getIntegumentarySystemSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.HeadSection <em>Head Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HeadSection
	 * @generated
	 */
	EClass getHeadSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.EyesSection <em>Eyes Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eyes Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EyesSection
	 * @generated
	 */
	EClass getEyesSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.EarsNoseMouthThroatSection <em>Ears Nose Mouth Throat Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ears Nose Mouth Throat Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EarsNoseMouthThroatSection
	 * @generated
	 */
	EClass getEarsNoseMouthThroatSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.EarsSection <em>Ears Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ears Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EarsSection
	 * @generated
	 */
	EClass getEarsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.NoseSection <em>Nose Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nose Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.NoseSection
	 * @generated
	 */
	EClass getNoseSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.MouthThroatTeethSection <em>Mouth Throat Teeth Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mouth Throat Teeth Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MouthThroatTeethSection
	 * @generated
	 */
	EClass getMouthThroatTeethSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.NeckSection <em>Neck Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neck Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.NeckSection
	 * @generated
	 */
	EClass getNeckSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.EndocrineSystemSection <em>Endocrine System Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endocrine System Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EndocrineSystemSection
	 * @generated
	 */
	EClass getEndocrineSystemSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ThoraxLungsSection <em>Thorax Lungs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thorax Lungs Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ThoraxLungsSection
	 * @generated
	 */
	EClass getThoraxLungsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ChestWallSection <em>Chest Wall Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chest Wall Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ChestWallSection
	 * @generated
	 */
	EClass getChestWallSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.BreastSection <em>Breast Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breast Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.BreastSection
	 * @generated
	 */
	EClass getBreastSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.HeartSection <em>Heart Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heart Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HeartSection
	 * @generated
	 */
	EClass getHeartSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.RespiratorySystemSection <em>Respiratory System Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Respiratory System Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.RespiratorySystemSection
	 * @generated
	 */
	EClass getRespiratorySystemSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.AbdomenSection <em>Abdomen Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abdomen Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AbdomenSection
	 * @generated
	 */
	EClass getAbdomenSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.LymphaticSection <em>Lymphatic Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lymphatic Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.LymphaticSection
	 * @generated
	 */
	EClass getLymphaticSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.VesselsSection <em>Vessels Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vessels Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VesselsSection
	 * @generated
	 */
	EClass getVesselsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.MusculoskeletalSystemSection <em>Musculoskeletal System Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Musculoskeletal System Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MusculoskeletalSystemSection
	 * @generated
	 */
	EClass getMusculoskeletalSystemSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.NeurologicSystemSection <em>Neurologic System Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neurologic System Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.NeurologicSystemSection
	 * @generated
	 */
	EClass getNeurologicSystemSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.GenitaliaSection <em>Genitalia Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genitalia Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GenitaliaSection
	 * @generated
	 */
	EClass getGenitaliaSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.RectumSection <em>Rectum Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectum Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.RectumSection
	 * @generated
	 */
	EClass getRectumSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ExtremitiesSection <em>Extremities Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extremities Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ExtremitiesSection
	 * @generated
	 */
	EClass getExtremitiesSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection <em>Review Of Systems Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review Of Systems Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection
	 * @generated
	 */
	EClass getReviewOfSystemsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection <em>Hospital Course Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital Course Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection
	 * @generated
	 */
	EClass getHospitalCourseSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection <em>Assessment And Plan Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment And Plan Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection
	 * @generated
	 */
	EClass getAssessmentAndPlanSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry <em>Condition Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ConditionEntry
	 * @generated
	 */
	EClass getConditionEntry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation <em>Cause Of Death Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cause Of Death Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CauseOfDeathObservation
	 * @generated
	 */
	EClass getCauseOfDeathObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.LanguageSpoken <em>Language Spoken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Spoken</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.LanguageSpoken
	 * @generated
	 */
	EClass getLanguageSpoken();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.HealthcareProvider <em>Healthcare Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Healthcare Provider</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HealthcareProvider
	 * @generated
	 */
	EClass getHealthcareProvider();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationNormalDose <em>Medication Normal Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Normal Dose</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationNormalDose
	 * @generated
	 */
	EClass getMedicationNormalDose();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose <em>Medication Split Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Split Dose</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose
	 * @generated
	 */
	EClass getMedicationSplitDose();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationTaperedDose <em>Medication Tapered Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Tapered Dose</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationTaperedDose
	 * @generated
	 */
	EClass getMedicationTaperedDose();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose <em>Medication Conditional Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Conditional Dose</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose
	 * @generated
	 */
	EClass getMedicationConditionalDose();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication <em>Medication Combination Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Combination Medication</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication
	 * @generated
	 */
	EClass getMedicationCombinationMedication();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.SupportGuardian <em>Support Guardian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support Guardian</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SupportGuardian
	 * @generated
	 */
	EClass getSupportGuardian();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.SupportParticipant <em>Support Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support Participant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SupportParticipant
	 * @generated
	 */
	EClass getSupportParticipant();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument <em>Unstructured Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unstructured Document</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument
	 * @generated
	 */
	EClass getUnstructuredDocument();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ScanOriginalAuthor <em>Scan Original Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scan Original Author</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ScanOriginalAuthor
	 * @generated
	 */
	EClass getScanOriginalAuthor();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ScanningDevice <em>Scanning Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scanning Device</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ScanningDevice
	 * @generated
	 */
	EClass getScanningDevice();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ScanDataEnterer <em>Scan Data Enterer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scan Data Enterer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ScanDataEnterer
	 * @generated
	 */
	EClass getScanDataEnterer();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation <em>Medication Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Information</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationInformation
	 * @generated
	 */
	EClass getMedicationInformation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument <em>Unstructured Or Scanned Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unstructured Or Scanned Document</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument
	 * @generated
	 */
	EClass getUnstructuredOrScannedDocument();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ReferralSummary <em>Referral Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referral Summary</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReferralSummary
	 * @generated
	 */
	EClass getReferralSummary();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary <em>Discharge Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discharge Summary</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DischargeSummary
	 * @generated
	 */
	EClass getDischargeSummary();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDiet <em>Discharge Diet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discharge Diet</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DischargeDiet
	 * @generated
	 */
	EClass getDischargeDiet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConsolFactory getConsolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl <em>General Header Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getGeneralHeaderConstraints()
		 * @generated
		 */
		EClass GENERAL_HEADER_CONSTRAINTS = eINSTANCE.getGeneralHeaderConstraints();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AllergyDrugSensitivityImpl <em>Allergy Drug Sensitivity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AllergyDrugSensitivityImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAllergyDrugSensitivity()
		 * @generated
		 */
		EClass ALLERGY_DRUG_SENSITIVITY = eINSTANCE.getAllergyDrugSensitivity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EpisodeObservationImpl <em>Episode Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EpisodeObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEpisodeObservation()
		 * @generated
		 */
		EClass EPISODE_OBSERVATION = eINSTANCE.getEpisodeObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AllergyIntoleranceImpl <em>Allergy Intolerance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AllergyIntoleranceImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAllergyIntolerance()
		 * @generated
		 */
		EClass ALLERGY_INTOLERANCE = eINSTANCE.getAllergyIntolerance();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProblemEntryReactionObservationContainerImpl <em>Problem Entry Reaction Observation Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ProblemEntryReactionObservationContainerImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getProblemEntryReactionObservationContainer()
		 * @generated
		 */
		EClass PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER = eINSTANCE.getProblemEntryReactionObservationContainer();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AgeObservationImpl <em>Age Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AgeObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAgeObservation()
		 * @generated
		 */
		EClass AGE_OBSERVATION = eINSTANCE.getAgeObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SeverityImpl <em>Severity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SeverityImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSeverity()
		 * @generated
		 */
		EClass SEVERITY = eINSTANCE.getSeverity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProblemStatusObservationImpl <em>Problem Status Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ProblemStatusObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getProblemStatusObservation()
		 * @generated
		 */
		EClass PROBLEM_STATUS_OBSERVATION = eINSTANCE.getProblemStatusObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HealthStatusObservationImpl <em>Health Status Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HealthStatusObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHealthStatusObservation()
		 * @generated
		 */
		EClass HEALTH_STATUS_OBSERVATION = eINSTANCE.getHealthStatusObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.CommentImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationImpl <em>Medication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedication()
		 * @generated
		 */
		EClass MEDICATION = eINSTANCE.getMedication();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationTypeImpl <em>Medication Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationTypeImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationType()
		 * @generated
		 */
		EClass MEDICATION_TYPE = eINSTANCE.getMedicationType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationOrderInformationImpl <em>Medication Order Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationOrderInformationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationOrderInformation()
		 * @generated
		 */
		EClass MEDICATION_ORDER_INFORMATION = eINSTANCE.getMedicationOrderInformation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationStatusObservationImpl <em>Medication Status Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationStatusObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationStatusObservation()
		 * @generated
		 */
		EClass MEDICATION_STATUS_OBSERVATION = eINSTANCE.getMedicationStatusObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProductInstanceImpl <em>Product Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ProductInstanceImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getProductInstance()
		 * @generated
		 */
		EClass PRODUCT_INSTANCE = eINSTANCE.getProductInstance();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationFullfillmentInstructionsImpl <em>Medication Fullfillment Instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationFullfillmentInstructionsImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationFullfillmentInstructions()
		 * @generated
		 */
		EClass MEDICATION_FULLFILLMENT_INSTRUCTIONS = eINSTANCE.getMedicationFullfillmentInstructions();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationSeriesNumberObservationImpl <em>Medication Series Number Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationSeriesNumberObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationSeriesNumberObservation()
		 * @generated
		 */
		EClass MEDICATION_SERIES_NUMBER_OBSERVATION = eINSTANCE.getMedicationSeriesNumberObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.InternalReferenceImpl <em>Internal Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.InternalReferenceImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getInternalReference()
		 * @generated
		 */
		EClass INTERNAL_REFERENCE = eINSTANCE.getInternalReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PatientMedicalInstructionsImpl <em>Patient Medical Instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PatientMedicalInstructionsImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPatientMedicalInstructions()
		 * @generated
		 */
		EClass PATIENT_MEDICAL_INSTRUCTIONS = eINSTANCE.getPatientMedicalInstructions();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConditionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PatientSummaryImpl <em>Patient Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PatientSummaryImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPatientSummary()
		 * @generated
		 */
		EClass PATIENT_SUMMARY = eINSTANCE.getPatientSummary();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectivesSectionImpl <em>Advance Directives Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectivesSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAdvanceDirectivesSection()
		 * @generated
		 */
		EClass ADVANCE_DIRECTIVES_SECTION = eINSTANCE.getAdvanceDirectivesSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectiveImpl <em>Advance Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectiveImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAdvanceDirective()
		 * @generated
		 */
		EClass ADVANCE_DIRECTIVE = eINSTANCE.getAdvanceDirective();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectiveStatusObservationImpl <em>Advance Directive Status Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectiveStatusObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAdvanceDirectiveStatusObservation()
		 * @generated
		 */
		EClass ADVANCE_DIRECTIVE_STATUS_OBSERVATION = eINSTANCE.getAdvanceDirectiveStatusObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AllergiesReactionsSectionImpl <em>Allergies Reactions Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AllergiesReactionsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAllergiesReactionsSection()
		 * @generated
		 */
		EClass ALLERGIES_REACTIONS_SECTION = eINSTANCE.getAllergiesReactionsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProblemListSectionImpl <em>Problem List Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ProblemListSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getProblemListSection()
		 * @generated
		 */
		EClass PROBLEM_LIST_SECTION = eINSTANCE.getProblemListSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EncountersSectionImpl <em>Encounters Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EncountersSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEncountersSection()
		 * @generated
		 */
		EClass ENCOUNTERS_SECTION = eINSTANCE.getEncountersSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EncounterImpl <em>Encounter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EncounterImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEncounter()
		 * @generated
		 */
		EClass ENCOUNTER = eINSTANCE.getEncounter();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EncountersActivityImpl <em>Encounters Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EncountersActivityImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEncountersActivity()
		 * @generated
		 */
		EClass ENCOUNTERS_ACTIVITY = eINSTANCE.getEncountersActivity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ImmunizationsSectionImpl <em>Immunizations Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ImmunizationsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getImmunizationsSection()
		 * @generated
		 */
		EClass IMMUNIZATIONS_SECTION = eINSTANCE.getImmunizationsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ImmunizationImpl <em>Immunization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ImmunizationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getImmunization()
		 * @generated
		 */
		EClass IMMUNIZATION = eINSTANCE.getImmunization();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PayersSectionImpl <em>Payers Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PayersSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPayersSection()
		 * @generated
		 */
		EClass PAYERS_SECTION = eINSTANCE.getPayersSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.InsuranceProviderImpl <em>Insurance Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.InsuranceProviderImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getInsuranceProvider()
		 * @generated
		 */
		EClass INSURANCE_PROVIDER = eINSTANCE.getInsuranceProvider();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PayerEntryImpl <em>Payer Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PayerEntryImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPayerEntry()
		 * @generated
		 */
		EClass PAYER_ENTRY = eINSTANCE.getPayerEntry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationsSectionImpl <em>Medications Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationsSection()
		 * @generated
		 */
		EClass MEDICATIONS_SECTION = eINSTANCE.getMedicationsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareSectionImpl <em>Plan Of Care Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPlanOfCareSection()
		 * @generated
		 */
		EClass PLAN_OF_CARE_SECTION = eINSTANCE.getPlanOfCareSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ProcedureImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityActImpl <em>Plan Of Care Activity Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityActImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPlanOfCareActivityAct()
		 * @generated
		 */
		EClass PLAN_OF_CARE_ACTIVITY_ACT = eINSTANCE.getPlanOfCareActivityAct();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityEncounterImpl <em>Plan Of Care Activity Encounter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityEncounterImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPlanOfCareActivityEncounter()
		 * @generated
		 */
		EClass PLAN_OF_CARE_ACTIVITY_ENCOUNTER = eINSTANCE.getPlanOfCareActivityEncounter();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityObservationImpl <em>Plan Of Care Activity Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPlanOfCareActivityObservation()
		 * @generated
		 */
		EClass PLAN_OF_CARE_ACTIVITY_OBSERVATION = eINSTANCE.getPlanOfCareActivityObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityProcedureImpl <em>Plan Of Care Activity Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityProcedureImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPlanOfCareActivityProcedure()
		 * @generated
		 */
		EClass PLAN_OF_CARE_ACTIVITY_PROCEDURE = eINSTANCE.getPlanOfCareActivityProcedure();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivitySubstanceAdministrationImpl <em>Plan Of Care Activity Substance Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivitySubstanceAdministrationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPlanOfCareActivitySubstanceAdministration()
		 * @generated
		 */
		EClass PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION = eINSTANCE.getPlanOfCareActivitySubstanceAdministration();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivitySupplyImpl <em>Plan Of Care Activity Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivitySupplyImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPlanOfCareActivitySupply()
		 * @generated
		 */
		EClass PLAN_OF_CARE_ACTIVITY_SUPPLY = eINSTANCE.getPlanOfCareActivitySupply();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PregnancyHistorySectionImpl <em>Pregnancy History Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PregnancyHistorySectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPregnancyHistorySection()
		 * @generated
		 */
		EClass PREGNANCY_HISTORY_SECTION = eINSTANCE.getPregnancyHistorySection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PregnancyObservationImpl <em>Pregnancy Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PregnancyObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPregnancyObservation()
		 * @generated
		 */
		EClass PREGNANCY_OBSERVATION = eINSTANCE.getPregnancyObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SurgeriesSectionImpl <em>Surgeries Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SurgeriesSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSurgeriesSection()
		 * @generated
		 */
		EClass SURGERIES_SECTION = eINSTANCE.getSurgeriesSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ExternalReferenceImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getExternalReference()
		 * @generated
		 */
		EClass EXTERNAL_REFERENCE = eINSTANCE.getExternalReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProcedureEntryProcedureActivityProcedureImpl <em>Procedure Entry Procedure Activity Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ProcedureEntryProcedureActivityProcedureImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getProcedureEntryProcedureActivityProcedure()
		 * @generated
		 */
		EClass PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE = eINSTANCE.getProcedureEntryProcedureActivityProcedure();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsSectionImpl <em>Vital Signs Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getVitalSignsSection()
		 * @generated
		 */
		EClass VITAL_SIGNS_SECTION = eINSTANCE.getVitalSignsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsOrganizerImpl <em>Vital Signs Organizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsOrganizerImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getVitalSignsOrganizer()
		 * @generated
		 */
		EClass VITAL_SIGNS_ORGANIZER = eINSTANCE.getVitalSignsOrganizer();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignImpl <em>Vital Sign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getVitalSign()
		 * @generated
		 */
		EClass VITAL_SIGN = eINSTANCE.getVitalSign();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.DiagnosticResultsSectionImpl <em>Diagnostic Results Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.DiagnosticResultsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getDiagnosticResultsSection()
		 * @generated
		 */
		EClass DIAGNOSTIC_RESULTS_SECTION = eINSTANCE.getDiagnosticResultsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ResultImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ResultOrganizerImpl <em>Result Organizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ResultOrganizerImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getResultOrganizer()
		 * @generated
		 */
		EClass RESULT_ORGANIZER = eINSTANCE.getResultOrganizer();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.FamilyHistorySectionImpl <em>Family History Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.FamilyHistorySectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getFamilyHistorySection()
		 * @generated
		 */
		EClass FAMILY_HISTORY_SECTION = eINSTANCE.getFamilyHistorySection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.FamilyHistoryImpl <em>Family History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.FamilyHistoryImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getFamilyHistory()
		 * @generated
		 */
		EClass FAMILY_HISTORY = eINSTANCE.getFamilyHistory();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.FamilyHistoryObservationImpl <em>Family History Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.FamilyHistoryObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getFamilyHistoryObservation()
		 * @generated
		 */
		EClass FAMILY_HISTORY_OBSERVATION = eINSTANCE.getFamilyHistoryObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SocialHistorySectionImpl <em>Social History Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SocialHistorySectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSocialHistorySection()
		 * @generated
		 */
		EClass SOCIAL_HISTORY_SECTION = eINSTANCE.getSocialHistorySection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SocialHistoryImpl <em>Social History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SocialHistoryImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSocialHistory()
		 * @generated
		 */
		EClass SOCIAL_HISTORY = eINSTANCE.getSocialHistory();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SocialHistoryStatusObservationImpl <em>Social History Status Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SocialHistoryStatusObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSocialHistoryStatusObservation()
		 * @generated
		 */
		EClass SOCIAL_HISTORY_STATUS_OBSERVATION = eINSTANCE.getSocialHistoryStatusObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ResultsSectionImpl <em>Results Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ResultsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getResultsSection()
		 * @generated
		 */
		EClass RESULTS_SECTION = eINSTANCE.getResultsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicalEquipmentSectionImpl <em>Medical Equipment Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicalEquipmentSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicalEquipmentSection()
		 * @generated
		 */
		EClass MEDICAL_EQUIPMENT_SECTION = eINSTANCE.getMedicalEquipmentSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.FunctionalStatusSectionImpl <em>Functional Status Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.FunctionalStatusSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getFunctionalStatusSection()
		 * @generated
		 */
		EClass FUNCTIONAL_STATUS_SECTION = eINSTANCE.getFunctionalStatusSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PurposeSectionImpl <em>Purpose Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PurposeSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPurposeSection()
		 * @generated
		 */
		EClass PURPOSE_SECTION = eINSTANCE.getPurposeSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PurposeActivityImpl <em>Purpose Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PurposeActivityImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPurposeActivity()
		 * @generated
		 */
		EClass PURPOSE_ACTIVITY = eINSTANCE.getPurposeActivity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectiveVerificationImpl <em>Advance Directive Verification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectiveVerificationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAdvanceDirectiveVerification()
		 * @generated
		 */
		EClass ADVANCE_DIRECTIVE_VERIFICATION = eINSTANCE.getAdvanceDirectiveVerification();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectiveReferenceImpl <em>Advance Directive Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AdvanceDirectiveReferenceImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAdvanceDirectiveReference()
		 * @generated
		 */
		EClass ADVANCE_DIRECTIVE_REFERENCE = eINSTANCE.getAdvanceDirectiveReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EncounterLocationImpl <em>Encounter Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EncounterLocationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEncounterLocation()
		 * @generated
		 */
		EClass ENCOUNTER_LOCATION = eINSTANCE.getEncounterLocation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PayerEntityImpl <em>Payer Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PayerEntityImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPayerEntity()
		 * @generated
		 */
		EClass PAYER_ENTITY = eINSTANCE.getPayerEntity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.CoveredPartyImpl <em>Covered Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.CoveredPartyImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getCoveredParty()
		 * @generated
		 */
		EClass COVERED_PARTY = eINSTANCE.getCoveredParty();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PolicySubscriberImpl <em>Policy Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PolicySubscriberImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPolicySubscriber()
		 * @generated
		 */
		EClass POLICY_SUBSCRIBER = eINSTANCE.getPolicySubscriber();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SupportImpl <em>Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SupportImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSupport()
		 * @generated
		 */
		EClass SUPPORT = eINSTANCE.getSupport();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HistoryOfPastIllnessSectionImpl <em>History Of Past Illness Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HistoryOfPastIllnessSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHistoryOfPastIllnessSection()
		 * @generated
		 */
		EClass HISTORY_OF_PAST_ILLNESS_SECTION = eINSTANCE.getHistoryOfPastIllnessSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ChiefComplaintSectionImpl <em>Chief Complaint Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ChiefComplaintSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getChiefComplaintSection()
		 * @generated
		 */
		EClass CHIEF_COMPLAINT_SECTION = eINSTANCE.getChiefComplaintSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ReasonForReferralSectionImpl <em>Reason For Referral Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ReasonForReferralSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getReasonForReferralSection()
		 * @generated
		 */
		EClass REASON_FOR_REFERRAL_SECTION = eINSTANCE.getReasonForReferralSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HistoryOfPresentIllnessImpl <em>History Of Present Illness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HistoryOfPresentIllnessImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHistoryOfPresentIllness()
		 * @generated
		 */
		EClass HISTORY_OF_PRESENT_ILLNESS = eINSTANCE.getHistoryOfPresentIllness();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HospitalAdmissionDiagnosisSectionImpl <em>Hospital Admission Diagnosis Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HospitalAdmissionDiagnosisSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHospitalAdmissionDiagnosisSection()
		 * @generated
		 */
		EClass HOSPITAL_ADMISSION_DIAGNOSIS_SECTION = eINSTANCE.getHospitalAdmissionDiagnosisSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.DischargeDiagnosisSectionImpl <em>Discharge Diagnosis Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.DischargeDiagnosisSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getDischargeDiagnosisSection()
		 * @generated
		 */
		EClass DISCHARGE_DIAGNOSIS_SECTION = eINSTANCE.getDischargeDiagnosisSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AdmissionMedicationHistorySectionImpl <em>Admission Medication History Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AdmissionMedicationHistorySectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAdmissionMedicationHistorySection()
		 * @generated
		 */
		EClass ADMISSION_MEDICATION_HISTORY_SECTION = eINSTANCE.getAdmissionMedicationHistorySection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HospitalDischargeMedicationsSectionImpl <em>Hospital Discharge Medications Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HospitalDischargeMedicationsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHospitalDischargeMedicationsSection()
		 * @generated
		 */
		EClass HOSPITAL_DISCHARGE_MEDICATIONS_SECTION = eINSTANCE.getHospitalDischargeMedicationsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationsAdministeredSectionImpl <em>Medications Administered Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationsAdministeredSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationsAdministeredSection()
		 * @generated
		 */
		EClass MEDICATIONS_ADMINISTERED_SECTION = eINSTANCE.getMedicationsAdministeredSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.PhysicalExamSectionImpl <em>Physical Exam Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.PhysicalExamSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getPhysicalExamSection()
		 * @generated
		 */
		EClass PHYSICAL_EXAM_SECTION = eINSTANCE.getPhysicalExamSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.GeneralAppearanceSectionImpl <em>General Appearance Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.GeneralAppearanceSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getGeneralAppearanceSection()
		 * @generated
		 */
		EClass GENERAL_APPEARANCE_SECTION = eINSTANCE.getGeneralAppearanceSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.VisibleImplantedMedicalDevicesSectionImpl <em>Visible Implanted Medical Devices Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.VisibleImplantedMedicalDevicesSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getVisibleImplantedMedicalDevicesSection()
		 * @generated
		 */
		EClass VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION = eINSTANCE.getVisibleImplantedMedicalDevicesSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.IntegumentarySystemSectionImpl <em>Integumentary System Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.IntegumentarySystemSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getIntegumentarySystemSection()
		 * @generated
		 */
		EClass INTEGUMENTARY_SYSTEM_SECTION = eINSTANCE.getIntegumentarySystemSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HeadSectionImpl <em>Head Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HeadSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHeadSection()
		 * @generated
		 */
		EClass HEAD_SECTION = eINSTANCE.getHeadSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EyesSectionImpl <em>Eyes Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EyesSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEyesSection()
		 * @generated
		 */
		EClass EYES_SECTION = eINSTANCE.getEyesSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EarsNoseMouthThroatSectionImpl <em>Ears Nose Mouth Throat Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EarsNoseMouthThroatSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEarsNoseMouthThroatSection()
		 * @generated
		 */
		EClass EARS_NOSE_MOUTH_THROAT_SECTION = eINSTANCE.getEarsNoseMouthThroatSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EarsSectionImpl <em>Ears Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EarsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEarsSection()
		 * @generated
		 */
		EClass EARS_SECTION = eINSTANCE.getEarsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.NoseSectionImpl <em>Nose Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.NoseSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getNoseSection()
		 * @generated
		 */
		EClass NOSE_SECTION = eINSTANCE.getNoseSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MouthThroatTeethSectionImpl <em>Mouth Throat Teeth Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MouthThroatTeethSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMouthThroatTeethSection()
		 * @generated
		 */
		EClass MOUTH_THROAT_TEETH_SECTION = eINSTANCE.getMouthThroatTeethSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.NeckSectionImpl <em>Neck Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.NeckSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getNeckSection()
		 * @generated
		 */
		EClass NECK_SECTION = eINSTANCE.getNeckSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EndocrineSystemSectionImpl <em>Endocrine System Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EndocrineSystemSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEndocrineSystemSection()
		 * @generated
		 */
		EClass ENDOCRINE_SYSTEM_SECTION = eINSTANCE.getEndocrineSystemSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ThoraxLungsSectionImpl <em>Thorax Lungs Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ThoraxLungsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getThoraxLungsSection()
		 * @generated
		 */
		EClass THORAX_LUNGS_SECTION = eINSTANCE.getThoraxLungsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ChestWallSectionImpl <em>Chest Wall Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ChestWallSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getChestWallSection()
		 * @generated
		 */
		EClass CHEST_WALL_SECTION = eINSTANCE.getChestWallSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.BreastSectionImpl <em>Breast Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.BreastSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getBreastSection()
		 * @generated
		 */
		EClass BREAST_SECTION = eINSTANCE.getBreastSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HeartSectionImpl <em>Heart Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HeartSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHeartSection()
		 * @generated
		 */
		EClass HEART_SECTION = eINSTANCE.getHeartSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.RespiratorySystemSectionImpl <em>Respiratory System Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.RespiratorySystemSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getRespiratorySystemSection()
		 * @generated
		 */
		EClass RESPIRATORY_SYSTEM_SECTION = eINSTANCE.getRespiratorySystemSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AbdomenSectionImpl <em>Abdomen Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AbdomenSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAbdomenSection()
		 * @generated
		 */
		EClass ABDOMEN_SECTION = eINSTANCE.getAbdomenSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.LymphaticSectionImpl <em>Lymphatic Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.LymphaticSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getLymphaticSection()
		 * @generated
		 */
		EClass LYMPHATIC_SECTION = eINSTANCE.getLymphaticSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.VesselsSectionImpl <em>Vessels Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.VesselsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getVesselsSection()
		 * @generated
		 */
		EClass VESSELS_SECTION = eINSTANCE.getVesselsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MusculoskeletalSystemSectionImpl <em>Musculoskeletal System Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MusculoskeletalSystemSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMusculoskeletalSystemSection()
		 * @generated
		 */
		EClass MUSCULOSKELETAL_SYSTEM_SECTION = eINSTANCE.getMusculoskeletalSystemSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.NeurologicSystemSectionImpl <em>Neurologic System Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.NeurologicSystemSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getNeurologicSystemSection()
		 * @generated
		 */
		EClass NEUROLOGIC_SYSTEM_SECTION = eINSTANCE.getNeurologicSystemSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.GenitaliaSectionImpl <em>Genitalia Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.GenitaliaSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getGenitaliaSection()
		 * @generated
		 */
		EClass GENITALIA_SECTION = eINSTANCE.getGenitaliaSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.RectumSectionImpl <em>Rectum Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.RectumSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getRectumSection()
		 * @generated
		 */
		EClass RECTUM_SECTION = eINSTANCE.getRectumSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ExtremitiesSectionImpl <em>Extremities Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ExtremitiesSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getExtremitiesSection()
		 * @generated
		 */
		EClass EXTREMITIES_SECTION = eINSTANCE.getExtremitiesSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ReviewOfSystemsSectionImpl <em>Review Of Systems Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ReviewOfSystemsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getReviewOfSystemsSection()
		 * @generated
		 */
		EClass REVIEW_OF_SYSTEMS_SECTION = eINSTANCE.getReviewOfSystemsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HospitalCourseSectionImpl <em>Hospital Course Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HospitalCourseSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHospitalCourseSection()
		 * @generated
		 */
		EClass HOSPITAL_COURSE_SECTION = eINSTANCE.getHospitalCourseSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AssessmentAndPlanSectionImpl <em>Assessment And Plan Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AssessmentAndPlanSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAssessmentAndPlanSection()
		 * @generated
		 */
		EClass ASSESSMENT_AND_PLAN_SECTION = eINSTANCE.getAssessmentAndPlanSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ConditionEntryImpl <em>Condition Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConditionEntryImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getConditionEntry()
		 * @generated
		 */
		EClass CONDITION_ENTRY = eINSTANCE.getConditionEntry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.CauseOfDeathObservationImpl <em>Cause Of Death Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.CauseOfDeathObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getCauseOfDeathObservation()
		 * @generated
		 */
		EClass CAUSE_OF_DEATH_OBSERVATION = eINSTANCE.getCauseOfDeathObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.LanguageSpokenImpl <em>Language Spoken</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.LanguageSpokenImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getLanguageSpoken()
		 * @generated
		 */
		EClass LANGUAGE_SPOKEN = eINSTANCE.getLanguageSpoken();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HealthcareProviderImpl <em>Healthcare Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HealthcareProviderImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHealthcareProvider()
		 * @generated
		 */
		EClass HEALTHCARE_PROVIDER = eINSTANCE.getHealthcareProvider();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationNormalDoseImpl <em>Medication Normal Dose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationNormalDoseImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationNormalDose()
		 * @generated
		 */
		EClass MEDICATION_NORMAL_DOSE = eINSTANCE.getMedicationNormalDose();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationSplitDoseImpl <em>Medication Split Dose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationSplitDoseImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationSplitDose()
		 * @generated
		 */
		EClass MEDICATION_SPLIT_DOSE = eINSTANCE.getMedicationSplitDose();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationTaperedDoseImpl <em>Medication Tapered Dose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationTaperedDoseImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationTaperedDose()
		 * @generated
		 */
		EClass MEDICATION_TAPERED_DOSE = eINSTANCE.getMedicationTaperedDose();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationConditionalDoseImpl <em>Medication Conditional Dose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationConditionalDoseImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationConditionalDose()
		 * @generated
		 */
		EClass MEDICATION_CONDITIONAL_DOSE = eINSTANCE.getMedicationConditionalDose();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationCombinationMedicationImpl <em>Medication Combination Medication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationCombinationMedicationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationCombinationMedication()
		 * @generated
		 */
		EClass MEDICATION_COMBINATION_MEDICATION = eINSTANCE.getMedicationCombinationMedication();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SupportGuardianImpl <em>Support Guardian</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SupportGuardianImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSupportGuardian()
		 * @generated
		 */
		EClass SUPPORT_GUARDIAN = eINSTANCE.getSupportGuardian();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SupportParticipantImpl <em>Support Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SupportParticipantImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSupportParticipant()
		 * @generated
		 */
		EClass SUPPORT_PARTICIPANT = eINSTANCE.getSupportParticipant();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.UnstructuredDocumentImpl <em>Unstructured Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.UnstructuredDocumentImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getUnstructuredDocument()
		 * @generated
		 */
		EClass UNSTRUCTURED_DOCUMENT = eINSTANCE.getUnstructuredDocument();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ScanOriginalAuthorImpl <em>Scan Original Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ScanOriginalAuthorImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getScanOriginalAuthor()
		 * @generated
		 */
		EClass SCAN_ORIGINAL_AUTHOR = eINSTANCE.getScanOriginalAuthor();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ScanningDeviceImpl <em>Scanning Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ScanningDeviceImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getScanningDevice()
		 * @generated
		 */
		EClass SCANNING_DEVICE = eINSTANCE.getScanningDevice();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ScanDataEntererImpl <em>Scan Data Enterer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ScanDataEntererImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getScanDataEnterer()
		 * @generated
		 */
		EClass SCAN_DATA_ENTERER = eINSTANCE.getScanDataEnterer();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.MedicationInformationImpl <em>Medication Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.MedicationInformationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getMedicationInformation()
		 * @generated
		 */
		EClass MEDICATION_INFORMATION = eINSTANCE.getMedicationInformation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.UnstructuredOrScannedDocumentImpl <em>Unstructured Or Scanned Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.UnstructuredOrScannedDocumentImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getUnstructuredOrScannedDocument()
		 * @generated
		 */
		EClass UNSTRUCTURED_OR_SCANNED_DOCUMENT = eINSTANCE.getUnstructuredOrScannedDocument();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ReferralSummaryImpl <em>Referral Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ReferralSummaryImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getReferralSummary()
		 * @generated
		 */
		EClass REFERRAL_SUMMARY = eINSTANCE.getReferralSummary();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.DischargeSummaryImpl <em>Discharge Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.DischargeSummaryImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getDischargeSummary()
		 * @generated
		 */
		EClass DISCHARGE_SUMMARY = eINSTANCE.getDischargeSummary();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.DischargeDietImpl <em>Discharge Diet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.DischargeDietImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getDischargeDiet()
		 * @generated
		 */
		EClass DISCHARGE_DIET = eINSTANCE.getDischargeDiet();

	}

} //ConsolPackage
