package com.github.johnnysc.picsandlogintestapp.core

/**
 * Создаем цепочки валидаций (pattern Chain of Responsibility)
 * Использовать для случая если количество валидаторов как минимум 2
 *
 * Для одного валидатора использовать один из конечных валидаторов
 * @see UiValidator
 *

 */
class UiValidatorChain(
    private val base: UiValidator,
    private val next: UiValidator
) : UiValidator {

    private var baseValid = false

    override fun isValid(text: String): Boolean {
        baseValid = base.isValid(text)
        return if (baseValid) next.isValid(text) else false
    }

    override fun errorMessage(): String = if (baseValid) next.errorMessage() else base.errorMessage()
}