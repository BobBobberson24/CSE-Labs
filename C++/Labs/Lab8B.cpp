#include <iostream>

int main() {
  int rows;
  int columns;

  std::cout << "Enter the number of rows: ";
  std::cin >> rows;
  std::cout << "Enter the number of columns: ";
  std::cin >> columns;
  int array[rows][columns];

  std::cout << std::endl << "I have " << rows << " rows and " << columns << " columns. I need to fill up " << rows*columns << " spaces." << std::endl;
  std::cout << std::endl << "The " << rows << "x" << columns << " 2-D array: " << std::endl;
  int row = 0;
  int column = 0;
  for (int i = 0; i < rows*columns; i++) {
    if (column == columns) {
      column = 0;
      row++;
      std::cout << std::endl;
    }
    array[row][column] = i+1;
    std::cout << array[row][column] << "| ";
    column++;
  }
}
