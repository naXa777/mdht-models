/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthStatusObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Health Status Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2#validateHealthStatusObservation2HasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation2 Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2#validateHealthStatusObservation2TextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation2 Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2#validateHealthStatusObservation2HasTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation2 Has Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2#validateHealthStatusObservation2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2#validateHealthStatusObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2#validateHealthStatusObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2#validateHealthStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2#validateHealthStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2#validateHealthStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HealthStatusObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateHealthStatusObservation2HasTextReference() {
		OperationsTestCase<HealthStatusObservation2> validateHealthStatusObservation2HasTextReferenceTestCase = new OperationsTestCase<HealthStatusObservation2>(
			"validateHealthStatusObservation2HasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION2_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservation2Operations.validateHealthStatusObservation2HasTextReference(
					(HealthStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservation2HasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateHealthStatusObservation2TextReferenceValue() {
		OperationsTestCase<HealthStatusObservation2> validateHealthStatusObservation2TextReferenceValueTestCase = new OperationsTestCase<HealthStatusObservation2>(
			"validateHealthStatusObservation2TextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION2_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservation2Operations.validateHealthStatusObservation2TextReferenceValue(
					(HealthStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservation2TextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateHealthStatusObservation2HasTextReferenceValue() {
		OperationsTestCase<HealthStatusObservation2> validateHealthStatusObservation2HasTextReferenceValueTestCase = new OperationsTestCase<HealthStatusObservation2>(
			"validateHealthStatusObservation2HasTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION2_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservation2Operations.validateHealthStatusObservation2HasTextReferenceValue(
					(HealthStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservation2HasTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthStatusObservation2Id() {
		OperationsTestCase<HealthStatusObservation2> validateHealthStatusObservation2IdTestCase = new OperationsTestCase<HealthStatusObservation2>(
			"validateHealthStatusObservation2Id",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(HealthStatusObservation2 target) {
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservation2Operations.validateHealthStatusObservation2Id(
					(HealthStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservation2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationCodeP() {
		OperationsTestCase<HealthStatusObservation2> validateHealthStatusObservationCodePTestCase = new OperationsTestCase<HealthStatusObservation2>(
			"validateHealthStatusObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservation2Operations.validateHealthStatusObservationCodeP(
					(HealthStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationStatusCodeP() {
		OperationsTestCase<HealthStatusObservation2> validateHealthStatusObservationStatusCodePTestCase = new OperationsTestCase<HealthStatusObservation2>(
			"validateHealthStatusObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservation2Operations.validateHealthStatusObservationStatusCodeP(
					(HealthStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationTemplateId() {
		OperationsTestCase<HealthStatusObservation2> validateHealthStatusObservationTemplateIdTestCase = new OperationsTestCase<HealthStatusObservation2>(
			"validateHealthStatusObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservation2Operations.validateHealthStatusObservationTemplateId(
					(HealthStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthStatusObservationCode() {
		OperationsTestCase<HealthStatusObservation2> validateHealthStatusObservationCodeTestCase = new OperationsTestCase<HealthStatusObservation2>(
			"validateHealthStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation2 target) {
				target.init();
				target.getCode().setCode(CDAValidationTest.BAD_CODE_VALUE);
				target.getCode().setCodeSystem(CDAValidationTest.BAD_CODESYSTEM_ID);
			}

			@Override
			protected void updateToPass(HealthStatusObservation2 target) {

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCode("11323-3");
				cd.setCodeSystem(CDAValidationTest.LOINC_ID);
				target.setCode(cd);

			}

			@Override
			protected void setDependency(HealthStatusObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservation2Operations.validateHealthStatusObservationCode(
					(HealthStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationStatusCode() {
		OperationsTestCase<HealthStatusObservation2> validateHealthStatusObservationStatusCodeTestCase = new OperationsTestCase<HealthStatusObservation2>(
			"validateHealthStatusObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(HealthStatusObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservation2Operations.validateHealthStatusObservationStatusCode(
					(HealthStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HealthStatusObservation2Operations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<HealthStatusObservation2> {
		@Override
		public HealthStatusObservation2 create() {
			return ConsolFactory.eINSTANCE.createHealthStatusObservation2();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends HealthStatusObservation2Operations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // HealthStatusObservation2Operations
