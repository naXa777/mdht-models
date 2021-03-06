/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.DeathRelationshipOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Death Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DeathRelationshipImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements DeathRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeathRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.DEATH_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathRelationshipTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathRelationshipOperations.validateDeathRelationshipTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathRelationshipClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathRelationshipOperations.validateDeathRelationshipClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathRelationshipMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathRelationshipOperations.validateDeathRelationshipMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathRelationshipCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathRelationshipOperations.validateDeathRelationshipCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathRelationshipCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathRelationshipOperations.validateDeathRelationshipCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathRelationshipValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathRelationshipOperations.validateDeathRelationshipValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeathRelationship init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public DeathRelationship init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //DeathRelationshipImpl
