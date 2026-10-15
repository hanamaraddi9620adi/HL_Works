
#include <stdio.h>
#include <string.h>
#include <ctype.h>

#define MAX 100

char stack[MAX];
int top = -1;

void push(char c)
{
    stack[++top] = c;
}

char pop()
{
    return stack[top--];
}

char peek()
{
    return stack[top];
}

int precedence(char c)
{
    if (c == '^') return 3;
    if (c == '*' || c == '/' || c == '%') return 2;
    if (c == '+' || c == '-') return 1;
    return 0;
}

int isOperator(char c)
{
    return c == '+' || c == '-' ||
           c == '*' || c == '/' ||
           c == '%' || c == '^';
}

int main()
{
    char infix[MAX], temp[MAX], prefix[MAX];
    int i, j = 0, k, n;
    char ch;

    printf("Enter infix expression: ");
    fgets(infix, MAX, stdin);
    n = (int)strlen(infix);

    for (i = n - 1; i >= 0; i--)
    {
        ch = infix[i];

        if (isspace((unsigned char)ch))
            continue;

        if (isalnum((unsigned char)ch))
        {
            temp[j++] = ch;
        }
        else if (ch == ')')
        {
            push(ch);
        }
        else if (ch == '(')
        {
            while (top != -1 && peek() != ')')
                temp[j++] = pop();

            if (top != -1)
                pop();
        }
        else if (isOperator(ch))
        {
            while (top != -1 &&
                   peek() != ')' &&
                   (precedence(peek()) > precedence(ch) ||
                   (precedence(peek()) == precedence(ch) &&
                    ch == '^')))
            {
                temp[j++] = pop();
            }

            push(ch);
        }
    }

    while (top != -1)
        temp[j++] = pop();

    for (k = 0; k < j; k++)
        prefix[k] = temp[j - 1 - k];

    prefix[j] = '\0';

    printf("Prefix: %s\n", prefix);

    return 0;
}
