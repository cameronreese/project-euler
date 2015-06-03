/* Project Euler Problem 9: Special Pythagorean Triplet
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
*/
#include <iostream>
#include <math.h>

using namespace std;

int main() {
    int sum_to_reach = 1000;
    int a, b, c, sum = 0;
    int age = 0;

    cout << "Hello there Eli!" << endl << "How old are you? ";

    cin >> age;

    cout << endl << "Wow, you are " << age << " years old?!? Amazing!" << endl << endl;

    string color;


    cout << "What is your favorite color? ";
    cin >> color;
    bool not_color = true;
    do {
        if (color == "blue" || color == "brown" || color == "black" || color == "green" || color == "gold" || color == "red" || color == "white" || color == "purple") {
            cout << endl << "So, you like the color " << color << ", so do I!" << endl;
            not_color = false;
        }
        else {
            cout << "That is not a color, choose a color! ";
            cin >> color;
        }
    } while (not_color);


    return 0;
}