package uz.hamroev.bardambolnew.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.hamroev.bardambolnew.R
import uz.hamroev.bardambolnew.adapter.MenuMainAdapter
import uz.hamroev.bardambolnew.cache.Cache
import uz.hamroev.bardambolnew.databinding.FragmentHomeBinding
import uz.hamroev.bardambolnew.model.MainMenu


class HomeFragment : Fragment() {


    lateinit var binding: FragmentHomeBinding
    lateinit var list: ArrayList<MainMenu>
    lateinit var menuMainAdapter: MenuMainAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        Cache.init(binding.root.context)
        checkLanguage()



        menuMainAdapter = MenuMainAdapter(
            binding.root.context,
            list,
            object : MenuMainAdapter.OnMyMainMenuClickLIstener {
                override fun onClickMenu(mainMenu: MainMenu, position: Int) {
                    when (position) {
                        0 -> {
                            findNavController().navigate(R.id.content1Fragment)
                        }
                        1 -> {
                            findNavController().navigate(R.id.content2Fragment)
                        }
                        2 -> {
                            findNavController().navigate(R.id.content3Fragment)
                        }
                        3 -> {
                            findNavController().navigate(R.id.authorFragment)
                        }
                        4 -> {
                            findNavController().navigate(R.id.authorFragment)
                        }
                        else -> {
                            findNavController().navigate(R.id.authorFragment)
                        }
                    }
                }
            })
        binding.rvMain.adapter = menuMainAdapter



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
        binding.typeWriter.animateText("Ekstremal vaziyatlarda o'zini boshqarish !")
        binding.typeWriter.setCharacterDeley(50)
        list = ArrayList()
        list.clear()
        list.add(MainMenu("Ekstremal vaziyatlarni boshqarish", R.drawable.ic_medicine))
        list.add(MainMenu("O'ziga-o'zi birinchi yordam ko'rsatish", R.drawable.ic_medicine))
        list.add(MainMenu("Bolaga g'amxo'rlik. Bolaga Yordam ko'rsatish", R.drawable.ic_run))
        list.add(MainMenu("Ilova Haqida", R.drawable.ic_run))
    }

    private fun loadKrillData() {
        binding.typeWriter.animateText("Экстремал вазиятларда узини бошкариш !")
        binding.typeWriter.setCharacterDeley(50)
        list = ArrayList()
        list.clear()
        list.add(MainMenu("Экстремал вазиятларни бошқариш", R.drawable.ic_medicine))
        list.add(MainMenu("Ўзига-ўзи биринчи ёрдам кўрсатиш", R.drawable.ic_medicine))
        list.add(MainMenu("Болага ғамхўрлик. Болага Ёрдам кўрсатиш", R.drawable.ic_run))
        list.add(MainMenu("Илова ҳақида", R.drawable.ic_run))
    }

    private fun loadRuData() {
        binding.typeWriter.animateText("Что делать во время экстремальных ситуаций !")
        binding.typeWriter.setCharacterDeley(50)
        list = ArrayList()
        list.clear()
        list.add(MainMenu("Управление экстремальными ситуациями", R.drawable.ic_medicine))
        list.add(MainMenu("Оказание первой доврачебной", R.drawable.ic_medicine))
        list.add(MainMenu("Забота о ребенке. Оказание помощи ребенку", R.drawable.ic_run))
        list.add(MainMenu("О приложении", R.drawable.ic_run))

    }


}