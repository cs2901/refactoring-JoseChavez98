void setHeight(int value){
    height = value;
    return
        }
void setWidth(int value){
    width = value;
    return
        }

void setValue(String name, int value) {
  setHeight(value);
  setWidth(value);
  Assert.shouldNeverReachHere();
}