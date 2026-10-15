
#include <stdio.h>
#include <ctype.h>

#define MAX 100

char stack[MAX];
int top = -1;

void push(char ch)
{
    stack[++top] = ch;
}

char pop()
{
    return stack[top--];
}

char peek()
{
    return stack[top];
}

int precedence(char ch)
{
    if (ch == '^')
        return 3;

    if (ch == '*' || ch == '/' || ch == '%')
        return 2;

    if (ch == '+' || ch == '-')
        return 1;

    return 0;
}

int isOperator(char ch)
{
    return ch == '+' || ch == '-' ||
           ch == '*' || ch == '/' ||
           ch == '%' || ch == '^';
}

int main()
{
    char infix[MAX], postfix[MAX];
    int i, j = 0;
    char ch;

    printf("Enter infix expression: ");
    fgets(infix, MAX, stdin);

    for (i = 0; infix[i] != '\0'; i++)
    {
        ch = infix[i];

        if (isspace((unsigned char)ch))
            continue;

        if (isalnum((unsigned char)ch))
        {
            postfix[j++] = ch;
        }
        else if (ch == '(')
        {
            push(ch);
        }
        else if (ch == ')')
        {
            while (top != -1 && peek() != '(')
            {
                postfix[j++] = pop();
            }

            if (top != -1)
                pop();
        }
        else if (isOperator(ch))
        {
            while (top != -1 &&
                   peek() != '(' &&
                   (precedence(peek()) > precedence(ch) ||
                   (precedence(peek()) == precedence(ch) &&
                    ch != '^')))
            {
                postfix[j++] = pop();
            }

            push(ch);
        }
    }

    while (top != -1)
    {
        postfix[j++] = pop();
    }

    postfix[j] = '\0';

    printf("Postfix: %s\n", postfix);

    return 0;
}
