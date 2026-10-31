package u3;

public class HugeInteger {
    private int[] digits = new int[40];

    public HugeInteger() {
        for (int i = 0; i < 40; i++) {
            digits[i] = 0;
        }
    }

    public HugeInteger(String val) {
        parse(val);
    }

    // Parses a string of digits into the 40-element array (right-aligned)
    public void parse(String val) {
        for (int i = 0; i < 40; i++) {
            digits[i] = 0;
        }

        if (val == null || val.isEmpty()) {
            return;
        }

        int len = val.length();
        if (len > 40) {
            throw new IllegalArgumentException("String exceeds 40 digits limit.");
        }

        int startIdx = 40 - len;
        for (int i = 0; i < len; i++) {
            int digit = val.charAt(i) - '0';
            if (digit < 0 || digit > 9) {
                throw new IllegalArgumentException("Invalid character in HugeInteger string: " + val.charAt(i));
            }
            digits[startIdx + i] = digit;
        }
    }

    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        int i = 0;
        while (i < 39 && digits[i] == 0) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (; i < 40; i++) {
            sb.append(digits[i]);
        }
        return sb.toString();
    }

    public HugeInteger add(HugeInteger op) {
        HugeInteger temp = new HugeInteger();
        int carry = 0;
        for (int i = 39; i >= 0; i--) {
            int sum = this.digits[i] + op.digits[i] + carry;
            temp.digits[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry > 0) {
            System.out.println("Warning: Integer overflow occurred during addition.");
        }
        return temp;
    }

    public HugeInteger subtract(HugeInteger op) {
        if (this.isLessThan(op)) {
            System.out.println("Warning: Subtraction resulted in a negative value. Returning 0.");
            return new HugeInteger("0");
        }
        HugeInteger temp = new HugeInteger();
        int borrow = 0;
        for (int i = 39; i >= 0; i--) {
            int diff = this.digits[i] - op.digits[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            temp.digits[i] = diff;
        }
        return temp;
    }

    // Predicate Methods for Comparison
    public boolean isEqualTo(HugeInteger op) {
        for (int i = 0; i < 40; i++) {
            if (this.digits[i] != op.digits[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isNotEqualTo(HugeInteger op) {
        return !isEqualTo(op);
    }

    public boolean isGreaterThan(HugeInteger op) {
        for (int i = 0; i < 40; i++) {
            if (this.digits[i] > op.digits[i]) {
                return true;
            } else if (this.digits[i] < op.digits[i]) {
                return false;
            }
        }
        return false; // equal
    }

    public boolean isLessThan(HugeInteger op) {
        for (int i = 0; i < 40; i++) {
            if (this.digits[i] < op.digits[i]) {
                return true;
            } else if (this.digits[i] > op.digits[i]) {
                return false;
            }
        }
        return false; // equal
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger op) {
        return isGreaterThan(op) || isEqualTo(op);
    }

    public boolean isLessThanOrEqualTo(HugeInteger op) {
        return isLessThan(op) || isEqualTo(op);
    }

    // Predicate method to check if the integer is zero
    public boolean isZero() {
        for (int i = 0; i < 40; i++) {
            if (digits[i] != 0) {
                return false;
            }
        }
        return true;
    }
}