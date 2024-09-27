#include <iostream>
using namespace std;

class Box
{
private:
    int length;

public:
    Box(int l)
    {
        length = l;
    }

    friend void printLenght(Box *b); // freind function declaration
};

void printLenght(Box *b)
{
    cout << b->length << endl;
}

int main()
{
    // std::cout<<"Hello World
    Box *b = new Box(10);
    printLenght(b);

    return 0;
}