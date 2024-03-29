package uz.hamroev.bardambolnew.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.hamroev.bardambolnew.R
import uz.hamroev.bardambolnew.adapter.ContentAdapter
import uz.hamroev.bardambolnew.cache.Cache
import uz.hamroev.bardambolnew.databinding.FragmentContent3Binding
import uz.hamroev.bardambolnew.model.Content

class Content3Fragment : Fragment() {


    lateinit var binding: FragmentContent3Binding

    lateinit var list: ArrayList<Content>
    lateinit var contentAdapter: ContentAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentContent3Binding.inflate(layoutInflater, container, false)

        checkLanguage()
        contentAdapter = ContentAdapter(
            binding.root.context,
            list,
            object : ContentAdapter.OnMyContentClickListener {
                override fun onContentClick(content: Content, position: Int) {
                    when (position) {
                        0 -> {
                            findNavController().navigate(R.id.agressiyaFragment)
                        }
                        1 -> {
                            findNavController().navigate(R.id.bolalarniFaollashtirishMashqlariFragment)
                        }
                        2 -> {
                            findNavController().navigate(R.id.bolaUchunVideoFragment)
                        }
                        3 -> {
                            findNavController().navigate(R.id.bolagaPsixologikYordamFragment)
                        }
                        4 -> {
                            findNavController().navigate(R.id.bolaUchunVideoFragment)
                        }
                        5 -> {
                            findNavController().navigate(R.id.giperativBolagaYordamFragment)
                        }
                        6 -> {
                            findNavController().navigate(R.id.qayguXolatidagiBolaFragment)
                        }
                        7 -> {
                            findNavController().navigate(R.id.qorquvXolatidagiBirinchiYordamFragment)
                        }
                        8 -> {
                            findNavController().navigate(R.id.mushakZoriqishlarFragment)
                        }
                        9 -> {
                            findNavController().navigate(R.id.umirlardaStressFragment)
                        }
                        10 -> {
                            findNavController().navigate(R.id.yuqoriQozgalishlarFragment)
                        }
                    }
                }
            })
        binding.rvContent.adapter = contentAdapter

        return binding.root

    }


    private fun checkLanguage() {
        when (Cache.til) {
            "uz" -> {
                loadUzData()
            }
            "krill" -> {
                loadKrillData()
            }
            "ru" -> {
                loadRuData()
            }
        }
    }

    private fun loadUzData() {
        list = ArrayList()
        list.clear()
        list.add(Content("Tajovuzkorlik holatida birinchi yordam", R.drawable.ic_agressiya, R.drawable.back_image_content3))
        list.add(
            Content(
                "Bolalarni faollashtirish mashqlari",
                R.drawable.ic_bolalarni_faollashtirish_mashqlari,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Bolalarni rivojlantirish uchun videokutubxona",
                R.drawable.ic_bolalar_uchun_video,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Bolalarga birinchi psixologik yordam ko'rsatish (Video)",
                R.drawable.ic_birinchi_psixologik_yordam,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Ota-onalar uchun birinchi psixologik yordam (Video)",
                R.drawable.ic_kattalarga_psixologik_yordam,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Giperaktiv bolalarga yordam",
                R.drawable.ic_giperaktiv_bola,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Qayg'u xolatidagi bolaga psixologik yordam ",
                R.drawable.ic_qaygu_holatgadi_bola,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Qo'rquv xolatida birinchi yordam",
                R.drawable.ic_qorquv,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Mushakdagi zo'riqishni bartaraf etish",
                R.drawable.ic_mushak,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "O'smirlarda stress xolatlarini bartaraf etish",
                R.drawable.ic_stress,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Yuqori qo'zg'aluvchanlikni bartaraf etish",
                R.drawable.ic_yuqori_qozgalanuvchanlik,
                R.drawable.back_image_content3
            )
        )

    }

    private fun loadKrillData() {
        list = ArrayList()
        list.clear()
        list.add(Content("Тажовузкорлик ҳолатида биринчи ёрдам", R.drawable.ic_agressiya, R.drawable.back_image_content3))
        list.add(
            Content(
                "Болаларни фаоллаштириш машқлари",
                R.drawable.ic_bolalarni_faollashtirish_mashqlari,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Болаларни ривожлантириш учун видеокутубхона",
                R.drawable.ic_bolalar_uchun_video,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Видеотека болаларга биринчи психологик ёрдам курсатиш",
                R.drawable.ic_birinchi_psixologik_yordam,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Ота-оналар учун биринчи психологик ёрдам (Видео)",
                R.drawable.ic_kattalarga_psixologik_yordam,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Гиперактив болаларга ёрдам",
                R.drawable.ic_giperaktiv_bola,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Қайғу холатидаги болага психологик ёрдам",
                R.drawable.ic_qaygu_holatgadi_bola,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Қўрқув холатида биринчи ёрдам",
                R.drawable.ic_qorquv_halatdagi_bola,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Мушакдаги зўриқишни бартараф этиш",
                R.drawable.ic_mushak,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Ўсмирларда стресс холатларини бартараф этиш",
                R.drawable.ic_stress,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Юқори қўзғалувчанликни бартараф этиш",
                R.drawable.ic_yuqori_qozgalanuvchanlik,
                R.drawable.back_image_content3
            )
        )
    }

    private fun loadRuData() {
        list = ArrayList()
        list.clear()
        list.add(Content("Психологическая помощь при агрессивном состоянии", R.drawable.ic_agressiya, R.drawable.back_image_content3))
        list.add(
            Content(
                "Активизирующие упражнения для детей.",
                R.drawable.ic_bolalarni_faollashtirish_mashqlari,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Психологическое саморазвитие ребенка (видиотека)",
                R.drawable.ic_bolalar_uchun_video,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Приёмы первой психологической помощи детям (видиотека)",
                R.drawable.ic_birinchi_psixologik_yordam,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Первая психологическая помощь родителям (Видео)",
                R.drawable.ic_kattalarga_psixologik_yordam,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Психологическая помощь гиперактивным детям",
                R.drawable.ic_giperaktiv_bola,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Психологическая помощь ребенку переживающему горе",
                R.drawable.ic_qaygu_holatgadi_bola,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Психологическая помощь ребенку в состоянии страха",
                R.drawable.ic_qorquv_halatdagi_bola,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Приёмы снятия мышечного напряжения",
                R.drawable.ic_mushak,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Коррекция стрессовых состояний у подростков",
                R.drawable.ic_stress,
                R.drawable.back_image_content3
            )
        )
        list.add(
            Content(
                "Устранение повышенной возбудимости",
                R.drawable.ic_yuqori_qozgalanuvchanlik,
                R.drawable.back_image_content3
            )
        )
    }

}