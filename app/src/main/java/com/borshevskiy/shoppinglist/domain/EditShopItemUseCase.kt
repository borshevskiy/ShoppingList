package com.borshevskiy.shoppinglist.domain

class EditShopItemUseCase(private val shopListRepo: ShopListRepo) {

    fun editShopItem(shopItem: ShopItem) {
        shopListRepo.editShopItem(shopItem)
    }
}