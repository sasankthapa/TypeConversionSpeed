const {performance}=require('perf_hooks');

const intToString = () => {
    var s, val;
    var t0,t1;
    val=Number.MAX_VALUE;
    
    t0=performance.now();
    s=String(val);
    t1=performance.now()-t0;
    console.log('Using String() : '+t1+"ms");
    
    t0=performance.now();
    s=val.toString();
    t1=performance.now()-t0;
    console.log('Using .toString() : '+t1+"ms");
}

const stringToInt=()=>{
    var s, val;
    var t0,t1;
    s=String(Number.MAX_VALUE);
    t0=performance.now();
    val=Number(s);
    t1=performance.now()-t0;
    console.log('Using Number() : '+ t1 +"ms");
    
    t0=performance.now();
    val=parseInt(s);
    t1=performance.now()-t0;
    console.log('Useing parseInt() : ' + t1+ 'ms');
}

console.log('Int to String');
intToString();
console.log();
console.log('String to Int');
stringToInt();