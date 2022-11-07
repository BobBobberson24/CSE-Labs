#include <iostream>

int max(double x, double y) {
  int max = std::max(x, y);
  return max;
}
int min(double x, double y) {
  int min = std::min(x, y);
  return min;
}
float average(double x, double y) {
  float average = (x + y) / 2;
  return average;
}
int main() {
  double num1;
  double num2;

  std::cout << "Enter number 1: ";
  std::cin >> num1;
  std::cout << "Enter number 2: ";
  std::cin >> num2;
  std::cout << "Max is " << max(num1, num2) << std::endl;
  std::cout << "Min is " << min(num1, num2) << std::endl;
  std::cout << "Average is " << average(num1, num2) << std::endl;

  return 0;
}
