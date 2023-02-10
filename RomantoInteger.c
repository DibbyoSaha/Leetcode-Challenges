int num(char ch){
switch(ch){
    case 'I':
        return 1;
    case 'V':
        return 5;
    case 'X':
        return 10;
    case 'L':
        return 50;
    case 'C':
        return 100;
    case 'D':
        return 500;
    case 'M':
        return 1000;
    default:
        return 0;
    }    
}


int romanToInt(char * s){
    int i=0; 
    int intNum=num(s[0]);
    for(i=1; s[i]!='\0'; i++){
        if(num(s[i-1])<num(s[i])){
            intNum = intNum - num(s[i-1]) + (num(s[i]) - num(s[i-1]));
        }
        else{
            intNum+=num(s[i]);
        }
    }
    return intNum;
}
