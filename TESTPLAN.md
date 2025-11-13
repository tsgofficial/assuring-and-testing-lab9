Fault seeding (зориудын алдаа оруулж илрүүлэлт)

1. Use without definition

// L5-ыг арилгаж mid-ыг тооцолгүй ашиглах
int midVal = arr[mid]; // mid D байхгүй → NPE/garbled

→ T2/T3/T4 унах ёстой.

2. Wrong variable

// L10 буруу:
left = right + 1; // зөв нь left = mid + 1

→ T3 алдаатай индекс/-1 буруу гарах болно.

3. Missing update

// L12-г устгах (right шинэчлэгдэхгүй)
// right = mid - 1; байхгүй

→ T4 infinite loop эсвэл буруу үр дүн — Branch/DU тасарна.

4. Definition overshadowing

// L10 блокт дахин mid тодорхойлох
{ int mid = mid + 1; left = mid; } // гаднах mid-ыг халхална

→ логик эвдэрнэ, DU(L5→L10) эвдэгдэнэ.

5. Dead definition

int x = 0; // хэзээ ч ашиглахгүй

→ Coverage-т харагдахгүй ч data-flow-оор dead-def илэрнэ.
