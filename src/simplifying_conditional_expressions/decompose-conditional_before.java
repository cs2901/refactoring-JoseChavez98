boolean isSummer(){
        if (date.before(SUMMER_START) || date.after(SUMMER_END)){
            return true;
        }
        else{
            return false;
        }
        }

if (isSummer()) {
  charge = quantity * winterRate + winterServiceCharge;
}
else {
  charge = quantity * summerRate;
}