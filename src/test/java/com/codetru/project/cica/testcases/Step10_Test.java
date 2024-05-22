package com.codetru.project.cica.testcases;

import org.testng.annotations.Test;

import com.anhtester.constants.FrameworkConstants;
import com.anhtester.helpers.ExcelHelpers;
import com.codetru.common.BaseTest;

public class Step10_Test extends BaseTest {
	
	 @Test
    public void TC_Make_a_Payment() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
//        getLoginPageCMS().loginSuccessWithCustomerAccount(excel.getCellData(4, "email"), excel.getCellData(4, "password"));
//        getHomePage().Open_Application_Module();
//        getStep_1Page().Product_Information();
//        getStep_2Page().Proposed_Insured_Information();
//        getStep_3Page().Policy_Owner_Information();
//        getStep_4Page().Beneficiary_Information();
//        getStep_5Page().Existing_Insurance();
//        getStep_6Page().Predetermination_Questions();
//        getStep_7Page().Remarks();
//        getStep_8Page().Disclosure_and_Signature();
//        getStep_9Page().Edit_Submit();
        getStep_10Page().Make_a_Payment();
        
        
    }
}
