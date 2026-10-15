
#include <stdio.h>

#define MAX 5

int stack[MAX];
int top = -1;

// PUSH operation
void push(int value)
{
    if(top == MAX - 1)
    {
        printf("Stack Overflow.....!\n");
    }
    else
    {
        top++;
        stack[top] = value;
        printf("Pushed : %d\n", value);
    }
}

// POP operation
void pop()
{
    if(top == -1)
    {
        printf("Stack Underflow......!\n");
    }
    else
    {
        printf("Popped : %d\n", stack[top]);
        top--;
    }
}

// PEEK operation
void peek()
{
    if(top == -1)
    {
        printf("No items to display\n");
    }
    else
    {
        printf("Top element : %d\n", stack[top]);
    }
}

// DISPLAY operation
void display()
{
    if(top == -1)
    {
        printf("No items to display\n");
    }
    else
    {
        printf("Stack elements:\n");

        for(int i = top; i >= 0; i--)
        {
            printf("%d\n", stack[i]);
        }
    }
}

int main()
{
    int choice;

    do
    {
        printf("\n----- STACK MENU -----\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Peek\n");
        printf("4. Display\n");
        printf("5. Exit\n");

        printf("Enter the choice: ");

        if(scanf("%d", &choice) != 1)
        {
            printf("Invalid input\n");
            break;
        }

        switch(choice)
        {
            case 1:
            {
                int value;

                printf("Enter the value to push: ");

                if(scanf("%d", &value) != 1)
                {
                    printf("Invalid input\n");
                    return 1;
                }

                push(value);
                break;
            }

            case 2:
                pop();
                break;

            case 3:
                peek();
                break;

            case 4:
                display();
                break;

            case 5:
                printf("Exiting.......\n");
                break;

            default:
                printf("Invalid choice.....!\n");
        }

    } while(choice != 5);

    return 0;
}
