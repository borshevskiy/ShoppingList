package com.borshevskiy.shoppinglist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.borshevskiy.shoppinglist.data.ShopListRepoImpl
import com.borshevskiy.shoppinglist.domain.DeleteShopItemUseCase
import com.borshevskiy.shoppinglist.domain.EditShopItemUseCase
import com.borshevskiy.shoppinglist.domain.GetShopListUseCase
import com.borshevskiy.shoppinglist.domain.ShopItem

class MainViewModel: ViewModel() {

    private val repo = ShopListRepoImpl

    private val getShopListUseCase = GetShopListUseCase(repo)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repo)
    private val editShopItemUseCase = EditShopItemUseCase(repo)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }

}