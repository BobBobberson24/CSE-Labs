#include <iostream>

int main() {
  int array1[5] = {};
  int array2[5] = {};
  std::cout << "Please enter 5 integers for the first array: " << std::endl;
  for (int i = 0; i < 5; i++) {
    std::cout << "Integer " << i << ": ";
    std::cin >> array1[i];
  }
  std::cout << "Please enter 5 integers for the second array: " << std::endl;
  for (int i = 0; i < 5; i++) {
    std::cout << "Integer " << i << ": ";
    std::cin >> array2[i];
  }
  std::cout << "The resulting sums are: ";
  for (int i = 0; i < 5; i++) {
    std::cout << array1[i] + array2[i] << "| ";
  }
  return 0;
}
