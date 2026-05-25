## Project Folder Structure

```text
app/
└── src/
    └── main/
        └── java/com/example/healthyfood/
            │
            ├── MainActivity.kt
            ├── HealthyFoodApp.kt
            │
            ├── core/
            │   ├── constants/
            │   │   └── AppConstants.kt
            │   │
            │   ├── network/
            │   │   ├── RetrofitInstance.kt
            │   │   └── ApiService.kt
            │   │
            │   ├── utils/
            │   │   └── Resource.kt
            │   │
            │   └── navigation/
            │       ├── Screen.kt
            │       └── AppNavigation.kt
            │
            ├── data/
            │   ├── model/
            │   │   ├── User.kt
            │   │   ├── Food.kt
            │   │   ├── CartItem.kt
            │   │   ├── Order.kt
            │   │   └── Category.kt
            │   │
            │   ├── remote/
            │   │   └── FoodApi.kt
            │   │
            │   └── repository/
            │       ├── AuthRepository.kt
            │       ├── FoodRepository.kt
            │       ├── CartRepository.kt
            │       └── OrderRepository.kt
            │
            ├── ui/
            │   ├── screens/
            │   │   ├── splash/
            │   │   │   └── SplashScreen.kt
            │   │   │
            │   │   ├── auth/
            │   │   │   ├── LoginScreen.kt
            │   │   │   └── OtpScreen.kt
            │   │   │
            │   │   ├── home/
            │   │   │   ├── HomeScreen.kt
            │   │   │   └── HomeViewModel.kt
            │   │   │
            │   │   ├── food_detail/
            │   │   │   └── FoodDetailScreen.kt
            │   │   │
            │   │   ├── cart/
            │   │   │   ├── CartScreen.kt
            │   │   │   └── CartViewModel.kt
            │   │   │
            │   │   ├── checkout/
            │   │   │   └── CheckoutScreen.kt
            │   │   │
            │   │   ├── payment/
            │   │   │   ├── PaymentScreen.kt
            │   │   │   └── QrPaymentScreen.kt
            │   │   │
            │   │   ├── order/
            │   │   │   ├── OrderSuccessScreen.kt
            │   │   │   ├── OrderTrackingScreen.kt
            │   │   │   └── OrderHistoryScreen.kt
            │   │   │
            │   │   └── profile/
            │   │       └── ProfileScreen.kt
            │   │
            │   ├── components/
            │   │   ├── FoodCard.kt
            │   │   ├── CategoryItem.kt
            │   │   ├── SearchBar.kt
            │   │   ├── CustomButton.kt
            │   │   ├── BottomNavBar.kt
            │   │   ├── LoadingDialog.kt
            │   │   └── ErrorMessage.kt
            │   │
            │   └── theme/
            │       ├── Color.kt
            │       ├── Theme.kt
            │       └── Type.kt
            │
            └── di/
                └── AppModule.kt
```
