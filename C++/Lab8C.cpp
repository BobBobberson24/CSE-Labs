#include <iostream>

int main() {
  int rows;
  int columns;

  std::cout << "Enter the number of rows: ";
  std::cin >> rows;
  std::cout << "Enter the number of columns: ";
  std::cin >> columns;
  int array1[rows][columns];

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
    array1[row][column] = i+1;
    std::cout << array1[row][column] << "| ";
    column++;
  }

  int array2[rows*columns];

  row = 0;
  column = 0;
  std::cout << std::endl << std::endl << "The " << rows << "x" << columns << " 2-D array flattened into a 1-D array: " << std::endl;

  for (int i = 0; i < rows*columns; i++) {

    if (column == columns) {
      column = 0;
      row++;
    }

    array2[i] = array1[row][column];
    std::cout << array2[i] << "| ";
    column++;
  }

}
