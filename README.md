# Coin Change — Pair Programming Exercise

## Background

In Bangladesh, the coins currently in circulation are **1, 2, and 5 taka**.

Your task is to write a function that, given an amount of money, returns the
coins needed to make up that amount using the **fewest possible coins**.

## Task

Implement a `CoinChange` class with a `make` method:

- **Input:** an integer `amount` (the total value to make change for)
- **Output:** how many of each coin (1, 2, or 5) are needed to make up the amount

## Example

For `amount = 8`, one optimal result is:

| Coin | Count |
|------|-------|
| 5    | 1     |
| 2    | 1     |
| 1    | 1     |

(5 + 2 + 1 = 8, using 3 coins in total)

## Rules

- Use the coin denominations **1, 2, and 5** only.
- Always return the combination that uses the **fewest coins**.
- Assume the amount is a non-negative integer.

## TDD Pair Programming Session
### Participants
- Siddiqur Rahman
- Porag Sarkar 

### Phase 1 - Setup
- Choosing the language
- Create project structure 
- Confirm the test runner

### Phase 2 - Design Thinking (Before any code)
- Agree on method signature
- Identify the test cases
- Order them

### Phase 3 - TDD Cycles (1 per test case)
- For each test case, we will repeat the following step
```
- RED
 -> Write a failling test
 -> Run it - confirm it fails for the right reason

- GREEN
  -> Write miminum code to pass
  -> Run it - confirm it passes
  -> Along with all the previous test case still pass

- REFACTOR
  -> Clean up code to ensure clean code structure
  -> Bhaviour remains the same
  -> Move to next test
``` 