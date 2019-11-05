package net.perfectdreams.loritta.commands.actions

import com.mrpowergamerbr.loritta.utils.locale.BaseLocale
import net.dv8tion.jda.api.entities.User
import net.perfectdreams.loritta.utils.Emotes
import java.awt.Color

class HeadPatCommand : ActionCommand(arrayOf("headpat", "headpet", "cafuné", "cafune", "pat")) {
    override fun getEmbedColor(): Color {
        return Color(156, 39, 176)
    }

    override fun getDescription(locale: BaseLocale): String {
        return locale["commands.actions.headpat.description"]
    }

    override fun getResponse(locale: BaseLocale, first: User, second: User): String {
        return locale["commands.actions.headpat.response", first.asMention, second.asMention]
    }

    override fun getFolderName(): String {
        return "headpat"
    }

    override fun getEmoji(): String {
        return Emotes.LORI_PAT.toString()
    }
}