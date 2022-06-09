class Solution {
public:
void merge(vector<int>& ai, int ni, vector<int>& aj, int nj) 
{
    int i = ni - 1;
    int j = nj - 1;
    int k = ni + nj - 1;

    while(i >= 0 || j >= 0)
    {
        if(i>= 0 && j >= 0)// Ca i va j deu hop le
        {
            // Tim phan tu lon hon nhet vao mang ai
            if(ai[i] >= aj[j])
            {
                ai[k--] = ai[i--];
            }
            else
            {
                ai[k--] = aj[j--];
            }
        }
        else if( i >= 0)// Chi co i hop le
        {
            ai[k--] = ai[i--];
        }
        else // Chi co j hop le
        {
            ai[k--] = aj[j--];
        }
    }
}

};