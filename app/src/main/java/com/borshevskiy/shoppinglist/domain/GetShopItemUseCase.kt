package com.borshevskiy.shoppinglist.domain

class GetShopItemUseCase(private val shopListRepo: ShopListRepo) {

    fun getShopItem(id: Int): ShopItem {
        return shopListRepo.getShopItem(id)
    }
}