package com.borshevskiy.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShopListRepo {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(id: Int): ShopItem

    fun getShopList() : LiveData<List<ShopItem>>
}