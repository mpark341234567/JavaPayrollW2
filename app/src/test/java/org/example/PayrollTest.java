package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PayrollTest {
    @Test
    void testCalculateGrossPay() {
        Payroll payroll = new Payroll();
        payroll.setHoursWorked(45); 
        assertEquals(797.05, payroll.calculateGrossPay(), 0.0001);
    }
    @Test
    void testCalculateSocSec() {
        Payroll payroll = new Payroll();
        payroll.setHoursWorked(40);
        assertEquals(40.272, payroll.calculateSocSec(), 0.0001);
    }
    @Test
    void testCalculateFedTax() {
        Payroll payroll = new Payroll();
        payroll.setHoursWorked(40);
        assertEquals(93.968, payroll.calculateFedTax(), 0.0001);
    }
    @Test
    void testCalculateStTax() { 
        Payroll payroll = new Payroll();
        payroll.setHoursWorked(40);
        assertEquals(33.56, payroll.calculateStTax(), 0.0001);
    }
    @Test
    void testCalculateUnion() {
        Payroll payroll = new Payroll();
        assertEquals(10.00, payroll.calculateUnion(), 0.01);
    }
    @Test
    void testCalculateIns() {
        Payroll payroll = new Payroll();
        payroll.setDependents(3);
        assertEquals(35.00, payroll.calculateIns(), 0.01);
        
        payroll.setDependents(2);
        assertEquals(15.00, payroll.calculateIns(), 0.01);
    }
    @Test
    void testCalculateNet() {
        Payroll payroll = new Payroll();
        payroll.setHoursWorked(40);
        payroll.setDependents(2);
        
        assertEquals(478.4, payroll.calculateNet(), 0.01);
    }
}
