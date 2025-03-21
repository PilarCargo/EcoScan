package org.ecn.ecoscan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.ecn.ecoscan.databinding.ActivityProductDetailBinding

class ProductDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Gonfler la mise en page en utilisant ViewBinding
        binding = ActivityProductDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Exemple de remplissage des données (cela pourrait venir d'une API, d'une BD, etc.)
        binding.tvProductName.text = "Lait d'Amandes Intense"
        binding.tvBrand.text = "Bio Village"
        binding.tvRating.text = "5/10"
        binding.tvDescription.text = "Description du produit ici. Lorem ipsum dolor sit amet..."
        binding.tvCertifications.text = "Certifications"
        binding.tvClassification.text = "Classification"
        binding.tvClassificationRating.text = "5/10"
        binding.tvClassificationExplanation.text = "Brève explication de la raison pour laquelle le produit a cette classification..."
        binding.tvNutritionalInfoTitle.text = "Informations Nutritionnelles"
        binding.tvNutritionalInfo.text = "Ici, vous insérez des données sur les calories, les ingrédients, etc."

        // Action pour le bouton de retour
        binding.ivBack.setOnClickListener {
            // Si vous souhaitez simplement fermer l'Activity :
            finish()
        }
    }
}