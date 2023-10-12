#include <iostream>
#include <chrono>
#include <thread>



void printer(std::string target) {
    std::string display = "";
    char currentChar;
    int remFromTarget = target.length();

    for (int i = 0; i < remFromTarget; ) {
        for (int j = 32; j < 127; j++) {
            currentChar = static_cast<char>(j);
            if (currentChar == target[i]) {
                i++;
                display += currentChar;
                std::this_thread::sleep_for(std::chrono::milliseconds(20));
                std::cout << display << std::endl;
                break;
            } else {
                std::this_thread::sleep_for(std::chrono::milliseconds(20));
                std::cout << display + currentChar << std::endl;
            }
        }
    }

    std::cout << "Final result: " << display << std::endl;
}



int main() {
    printer("Hello World");
    return 0;
}