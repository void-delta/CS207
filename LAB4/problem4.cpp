#include <iostream>
using namespace std;
class Fraction {
    private:
        int numerator;
        int denominator;

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    void simplify() {
        int commonDivisor = gcd(numerator, denominator);
        numerator /= commonDivisor;
        denominator /= commonDivisor;
    }

    public:
        Fraction(int num = 0, int denom = 1) : numerator(num), denominator(denom) {
            if (denominator == 0) {
                std::cerr << "Error: Denominator cannot be zero." << std::endl;
                exit(1);
            }
            simplify();
        }
        Fraction operator+(const Fraction& other) const {
            int newNumerator = numerator * other.denominator + other.numerator * denominator;
            int newDenominator = denominator * other.denominator;
            return Fraction(newNumerator, newDenominator);
        }
        Fraction operator-(const Fraction& other) const {
            int newNumerator = numerator * other.denominator - other.numerator * denominator;
            int newDenominator = denominator * other.denominator;
            return Fraction(newNumerator, newDenominator);
        }
        Fraction operator*(const Fraction& other) const {
            int newNumerator = numerator * other.numerator;
            int newDenominator = denominator * other.denominator;
            return Fraction(newNumerator, newDenominator);
        }
        Fraction operator/(const Fraction& other) const {
            if (other.numerator == 0) {
                std::cerr << "Error: Division by zero." << std::endl;
                exit(1);
            }
            int newNumerator = numerator * other.denominator;
            int newDenominator = denominator * other.numerator;
            return Fraction(newNumerator, newDenominator);
        }
        void display() const {
            std::cout << numerator << "/" << denominator;
        }
    };

    int main() {
        cout << "Enter the numerator and the denominator 1 and 2\n" ;
        int n1, d1, n2, d2;
        cin >> n1 >> d1 >> n2 >> d2 ;
        Fraction frac1(n1, d1);
        Fraction frac2(n2, d2);

        Fraction sum = frac1 + frac2;
        Fraction diff = frac1 - frac2;
        Fraction product = frac1 * frac2;
        Fraction quotient = frac1 / frac2;

        cout << "Fraction 1: ";
        frac1.display();
        cout << endl;
        cout << "Fraction 2: ";
        frac2.display();
        cout << endl;
        cout << "Sum: ";
        sum.display();
        cout << endl;
        cout << "Difference: ";
        diff.display();
        cout << endl;
        cout << "Product: ";
        product.display();
        cout << endl;
        cout << "Quotient: ";
        quotient.display();
        cout << endl;
        return 0;
    }
