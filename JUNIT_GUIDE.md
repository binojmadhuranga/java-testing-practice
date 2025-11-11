# JUnit 5 Testing - Complete Guide

## Overview
This project contains comprehensive examples of JUnit 5 testing features to help you explore unit testing in Java.

## Files Created

### 1. **Calculator.java** (src/main/java/com/example/acpt/)
A simple calculator class with various methods to test:
- `add()` - Addition
- `subtract()` - Subtraction
- `multiply()` - Multiplication
- `divide()` - Division (with exception handling)
- `isEven()` - Boolean check
- `factorial()` - Recursive calculation

### 2. **CalculatorTest.java** (src/test/java/com/example/acpt/)
Comprehensive test suite demonstrating JUnit 5 features

## JUnit 5 Features Demonstrated

### 1. **Test Lifecycle Annotations**
- `@BeforeAll` - Runs once before all tests
- `@BeforeEach` - Runs before each test method
- `@AfterEach` - Runs after each test method
- `@AfterAll` - Runs once after all tests

### 2. **Basic Assertions**
```java
assertEquals(expected, actual)        // Check equality
assertTrue(condition)                 // Check if true
assertFalse(condition)                // Check if false
assertNull(object)                    // Check if null
assertNotNull(object)                 // Check if not null
```

### 3. **Exception Testing**
```java
assertThrows(ExceptionClass.class, () -> {
    // Code that should throw exception
});
```

### 4. **Grouped Assertions**
```java
assertAll("description",
    () -> assertEquals(expected1, actual1),
    () -> assertEquals(expected2, actual2)
);
```

### 5. **Nested Tests** (`@Nested`)
Organize related tests into inner classes for better structure

### 6. **Display Names** (`@DisplayName`)
Provide readable test descriptions

### 7. **Disabled Tests** (`@Disabled`)
Skip specific tests temporarily

### 8. **Timeout Tests** (`@Timeout`)
Ensure tests complete within specified time

### 9. **Repeated Tests** (`@RepeatedTest`)
Run the same test multiple times

### 10. **Assumptions**
```java
Assumptions.assumeTrue(condition);
// Test only runs if condition is true
```

## Running the Tests

### Using Maven (Command Line)
```bash
# Run all tests
mvn test

# Run tests with detailed output
mvn test -X

# Run a specific test class
mvn test -Dtest=CalculatorTest

# Run a specific test method
mvn test -Dtest=CalculatorTest#testAddition
```

### Using IntelliJ IDEA
1. Right-click on the test class or method
2. Select "Run 'CalculatorTest'"
3. View results in the Run window

## Expected Test Results

The test suite includes:
- ✅ **19 passing tests** (demonstrating various scenarios)
- ⏭️ **1 disabled test** (to show @Disabled annotation)
- 🔁 **3 repeated test executions**

## Test Categories Covered

### ✅ Addition Tests
- Positive numbers
- Negative numbers
- Mixed positive/negative

### ✅ Subtraction Tests
- Normal subtraction
- Negative results

### ✅ Multiplication Tests
- Normal multiplication
- Multiplication by zero
- Negative multiplication

### ✅ Division Tests
- Normal division
- Division by zero (exception)
- Decimal results

### ✅ Boolean Tests
- Even number detection
- Edge cases (0, negative numbers)

### ✅ Factorial Tests (Nested)
- Factorial of 0 and 1
- Factorial of positive numbers
- Negative number exception

## Best Practices Demonstrated

1. **Test Independence** - Each test can run independently
2. **Clear Test Names** - Using @DisplayName for readability
3. **Test Organization** - Using @Nested for related tests
4. **Setup/Teardown** - Proper use of lifecycle methods
5. **Exception Testing** - Verifying both success and failure cases
6. **Edge Case Testing** - Testing boundary conditions
7. **Meaningful Assertions** - Using assertion messages

## Next Steps to Explore

1. **Parameterized Tests** - Test with multiple inputs
2. **Test Suites** - Combine multiple test classes
3. **Mocking** - Using Mockito for dependencies
4. **Code Coverage** - Measure test coverage
5. **Integration Tests** - Test multiple components together

## Additional Dependencies (Optional)

Add these to pom.xml for advanced features:

```xml
<!-- For parameterized tests -->
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-params</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>

<!-- For mocking -->
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>5.5.0</version>
    <scope>test</scope>
</dependency>
```

## Resources
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [JUnit 5 API Documentation](https://junit.org/junit5/docs/current/api/)
- [Best Practices for Unit Testing](https://phauer.com/2019/modern-best-practices-testing-java/)

