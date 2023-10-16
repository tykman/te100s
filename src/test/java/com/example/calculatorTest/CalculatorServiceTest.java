package com.example.calculatorTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

     @Test
     void greetings_success() {
//      подготовка ожидаемого результата
        String expectedResult = "Добро пожаловать в калькулятор!";

//        начало теста
        String actualResult = calculatorService.greetings();
        assertEquals(expectedResult,actualResult);
     }

     @Test
     void plus_luck() {
//       подготовка входных данных
         int num1 = 6;
         int num2 = 3;
//       подготовка ожидаемого результата
         String expectedResult = TestUtils.formatResult(num1,num2,"+","9");
         String actualResult = calculatorService.plus(num1,num2);
//         начало теста
         assertEquals(expectedResult,actualResult);
     }

     @Test
     void plus_success() {
//       подготовка входных данных
         int num1 = 16;
         int num2 = 6;
//       подготовка ожидаемого результата
         String expectedResult = TestUtils.formatResult(num1,num2,"+","22");
         String actualResult = calculatorService.plus(num1,num2);
//       начало теста
         assertEquals(expectedResult,actualResult);
    }

    @Test
    void minus_luck() {
//       подготовка входных данных
         int num1 = 4;
         int num2 = 2;
//       подготовка ожидаемого результата
         String expectedResult = TestUtils.formatResult(num1,num2,"-","2");
         String actualResult = calculatorService.minus(num1,num2);
//       начало теста
         assertEquals(expectedResult,actualResult);
    }

    @Test
    void multiply_success() {
//       подготовка входных данных
         int num1 = 4;
         int num2 = 2;
//       подготовка ожидаемого результата
         String expectedResult = TestUtils.formatResult(num1,num2,"*","8");
         String actualResult = calculatorService.multiply(num1,num2);
//       начало теста
         assertEquals(expectedResult,actualResult);
    }

    @Test
    void divide_success() {
//       подготовка входных данных
         int num1 = 4;
         int num2 = 2;
//       подготовка ожидаемого результата
         String expectedResult = TestUtils.formatResult(num1,num2,":","2.0");
         String actualResult = calculatorService.divide(num1,num2);
//       начало теста
         assertEquals(expectedResult,actualResult);
    }

    @Test
    void divide_withNum2IsZero() {
//       подготовка входных данных
         int num1 = 4;
         int num2 = 0;
//       подготовка ожидаемого результата
         String expectedErrorMessage = "На ноль делить нельзя!";
         Exception exception = assertThrows(ZeroDivideException.class,()-> calculatorService.divide(num1,num2));
//       начало теста
         assertEquals(expectedErrorMessage,exception.getMessage());
    }
}
