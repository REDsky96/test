document.write("問1");
document.write("<br>");

for(var star1=1; star1<=5; star1++){
    document.write("★");
}

document.write("<br>");
document.write("<br>");
document.write("問2");
document.write("<br>");

for(var star2=1; star2<=2; star2++){ for(var star2_1=1; star2_1<=3; star2_1++){
    document.write("★");
}
document.write("<br>");
}

document.write("<br>");
document.write("<br>");
document.write("問3");
document.write("<br>");

for(var star3=1; star3<=2; star3++){ for(var star3_1=1; star3_1<=5; star3_1++){
    document.write("☆");
}
document.write("<br>");
}

document.write("<br>");
document.write("<br>");
document.write("問4");
document.write("<br>");

for(var star4=1; star4<=4; star4++){
    for(var star4_1=1; star4_1<=5; star4_1++){
        document.write("★");
    }
document.write("<br>");
}

document.write("<br>");
document.write("<br>");
document.write("問5");
document.write("<br>");

for(var star5=1; star5<=4; star5++){
    for(var star5_1=1; star5_1<=3; star5_1++){
        document.write("★");
    }
document.write("<br>");
}

document.write("<br>");
document.write("<br>");
document.write("問6");
document.write("<br>");

for (var star6=1; star6<=3; star6++){
    for (var star6_1=1; star6_1<=3; star6_1++){
        if(star6_1 % 2==0){
            document.write("☆");
        }else{document.write("★");}
    }
document.write("<br>");
}

document.write("<br>");
document.write("<br>");
document.write("問7");
document.write("<br>");

for (var star7=1; star7<=4; star7++){
    for (var star7_1=1; star7_1<=5; star7_1++){
        if (star7_1 % 2 == 0){
            document.write("☆");
        }else {
            document.write("★");
        }
    }
document.write("<br>");
}

document.write("<br>");
document.write("<br>");
document.write("問8");
document.write("<br>");

for(var star8=1; star8<=5; star8++){
    for (var i=1; i<=star8; i++){
        document.write("★");
    }
  document.write("<br>");
}

