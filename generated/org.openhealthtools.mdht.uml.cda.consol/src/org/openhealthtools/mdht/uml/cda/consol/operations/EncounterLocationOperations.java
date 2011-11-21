/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.EncounterLocation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.Participant2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Location</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterLocation#validateEncounterLocationHasParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterLocation#validateEncounterLocationHasParticipantRoleLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Participant Role Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterLocation#validateEncounterLocationHasParticipantRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Participant Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterLocation#validateEncounterLocationHasParticipantRoleCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Participant Role Code Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterLocation#validateEncounterLocationHasPlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterLocation#validateEncounterLocationHasPlayingEntityPlace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Playing Entity Place</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterLocation#validateEncounterLocationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterLocation#validateEncounterLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncounterLocationOperations extends Participant2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterLocationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterLocationHasParticipantRole(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterLocationHasParticipantRole(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participantRole->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterLocationHasParticipantRole(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterLocationHasParticipantRole(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participantRole->size() = 1
	 * @param encounterLocation The receiving '<em><b>Encounter Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEncounterLocationHasParticipantRole(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_LOCATION);
			try {
				VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterLocation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE,
						 ConsolPlugin.INSTANCE.getString("EncounterLocationHasParticipantRole"),
						 new Object [] { encounterLocation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterLocationHasParticipantRoleLocation(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Participant Role Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterLocationHasParticipantRoleLocation(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participantRole.classCode =  vocab::RoleClassRoot::SDLOC";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterLocationHasParticipantRoleLocation(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Participant Role Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterLocationHasParticipantRoleLocation(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participantRole.classCode =  vocab::RoleClassRoot::SDLOC
	 * @param encounterLocation The receiving '<em><b>Encounter Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEncounterLocationHasParticipantRoleLocation(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_LOCATION);
			try {
				VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterLocation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_LOCATION,
						 ConsolPlugin.INSTANCE.getString("EncounterLocationHasParticipantRoleLocation"),
						 new Object [] { encounterLocation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterLocationHasParticipantRoleCode(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Participant Role Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterLocationHasParticipantRoleCode(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participantRole.code->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterLocationHasParticipantRoleCode(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Participant Role Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterLocationHasParticipantRoleCode(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participantRole.code->size() = 1
	 * @param encounterLocation The receiving '<em><b>Encounter Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEncounterLocationHasParticipantRoleCode(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_LOCATION);
			try {
				VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterLocation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE,
						 ConsolPlugin.INSTANCE.getString("EncounterLocationHasParticipantRoleCode"),
						 new Object [] { encounterLocation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterLocationHasParticipantRoleCodeVocab(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Participant Role Code Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterLocationHasParticipantRoleCodeVocab(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participantRole.code.codeSystem = '2.16.840.1.113883.5.111'";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterLocationHasParticipantRoleCodeVocab(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Participant Role Code Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterLocationHasParticipantRoleCodeVocab(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participantRole.code.codeSystem = '2.16.840.1.113883.5.111'
	 * @param encounterLocation The receiving '<em><b>Encounter Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEncounterLocationHasParticipantRoleCodeVocab(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_LOCATION);
			try {
				VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterLocation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE_VOCAB,
						 ConsolPlugin.INSTANCE.getString("EncounterLocationHasParticipantRoleCodeVocab"),
						 new Object [] { encounterLocation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterLocationHasPlayingEntity(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterLocationHasPlayingEntity(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participantRole.playingEntity->size()>0";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterLocationHasPlayingEntity(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterLocationHasPlayingEntity(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participantRole.playingEntity->size()>0
	 * @param encounterLocation The receiving '<em><b>Encounter Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEncounterLocationHasPlayingEntity(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_LOCATION);
			try {
				VALIDATE_ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterLocation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY,
						 ConsolPlugin.INSTANCE.getString("EncounterLocationHasPlayingEntity"),
						 new Object [] { encounterLocation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterLocationHasPlayingEntityPlace(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Playing Entity Place</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterLocationHasPlayingEntityPlace(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participantRole.playingEntity.classCode = vocab::EntityClassRoot::PLC";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterLocationHasPlayingEntityPlace(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Playing Entity Place</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterLocationHasPlayingEntityPlace(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participantRole.playingEntity.classCode = vocab::EntityClassRoot::PLC
	 * @param encounterLocation The receiving '<em><b>Encounter Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEncounterLocationHasPlayingEntityPlace(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_LOCATION);
			try {
				VALIDATE_ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterLocation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY_PLACE,
						 ConsolPlugin.INSTANCE.getString("EncounterLocationHasPlayingEntityPlace"),
						 new Object [] { encounterLocation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterLocationTemplateId(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterLocationTemplateId(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.45')";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterLocationTemplateId(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterLocationTemplateId(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTER_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.45')
	 * @param encounterLocation The receiving '<em><b>Encounter Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEncounterLocationTemplateId(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTER_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_LOCATION);
			try {
				VALIDATE_ENCOUNTER_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterLocation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("EncounterLocationTemplateId"),
						 new Object [] { encounterLocation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterLocationTypeCode(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterLocationTypeCode(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeCode=vocab::ParticipationType::LOC";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterLocationTypeCode(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterLocationTypeCode(EncounterLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTER_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeCode=vocab::ParticipationType::LOC
	 * @param encounterLocation The receiving '<em><b>Encounter Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEncounterLocationTypeCode(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTER_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_LOCATION);
			try {
				VALIDATE_ENCOUNTER_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterLocation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("EncounterLocationTypeCode"),
						 new Object [] { encounterLocation }));
			}
			return false;
		}
		return true;
	}

} // EncounterLocationOperations