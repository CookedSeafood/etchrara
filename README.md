# Etchrara

Etchrara is a rarity expansion mod adds non-registered rarity tiers.

![String](https://github.com/CookedSeafood/nbtsheet/raw/0cfc19cc5644a82c921d39f9c40729aca3dea33d/string.png) **rarity**: Any.

- ![0xffffff](https://github.com/CookedSeafood/rarity-color/raw/4c29da8618f1d1f9df78ec70f99da78a62efe5d2/common.png) Common
- ![0xffff55](https://github.com/CookedSeafood/rarity-color/raw/4c29da8618f1d1f9df78ec70f99da78a62efe5d2/uncommon.png) Uncommon
- ![0x55ffff](https://github.com/CookedSeafood/rarity-color/raw/4c29da8618f1d1f9df78ec70f99da78a62efe5d2/rare.png) Rare
- ![0xff55ff](https://github.com/CookedSeafood/rarity-color/raw/4c29da8618f1d1f9df78ec70f99da78a62efe5d2/epic.png) Epic

![Compound](https://github.com/CookedSeafood/nbtsheet/raw/0cfc19cc5644a82c921d39f9c40729aca3dea33d/compound.png) **custom_data**: Parent tag.  
&ensp;\\- ![String](https://github.com/CookedSeafood/nbtsheet/raw/0cfc19cc5644a82c921d39f9c40729aca3dea33d/string.png) **rarity**: Any.

- ![0xffffff](https://github.com/CookedSeafood/rarity-color/raw/4c29da8618f1d1f9df78ec70f99da78a62efe5d2/common.png) Common
- ![0xffff55](https://github.com/CookedSeafood/rarity-color/raw/4c29da8618f1d1f9df78ec70f99da78a62efe5d2/uncommon.png) Uncommon
- ![0x55ffff](https://github.com/CookedSeafood/rarity-color/raw/4c29da8618f1d1f9df78ec70f99da78a62efe5d2/rare.png) Rare
- ![0xff55ff](https://github.com/CookedSeafood/rarity-color/raw/4c29da8618f1d1f9df78ec70f99da78a62efe5d2/epic.png) Epic
- ![0xffaa00](https://github.com/CookedSeafood/rarity-color/raw/4c29da8618f1d1f9df78ec70f99da78a62efe5d2/legendary.png) Legendary
- ![0xcc55ff](https://github.com/CookedSeafood/rarity-color/raw/4c29da8618f1d1f9df78ec70f99da78a62efe5d2/mythic.png) Mythic
- ![0x55ffcc](https://github.com/CookedSeafood/rarity-color/raw/4c29da8618f1d1f9df78ec70f99da78a62efe5d2/divine.png) Divine
- ![0x555555](https://github.com/CookedSeafood/rarity-color/raw/4c29da8618f1d1f9df78ec70f99da78a62efe5d2/eternal.png) Eternal
- ![0xff5555](https://github.com/CookedSeafood/rarity-color/raw/4c29da8618f1d1f9df78ec70f99da78a62efe5d2/special.png) Special
- ![0xaa0000](https://github.com/CookedSeafood/rarity-color/raw/4c29da8618f1d1f9df78ec70f99da78a62efe5d2/admin.png) Admin

Optionally, rarity name can be displayed in tooltip in capitalized, bolded letters.

## Configuration

```json
{
  "rarityCommonColor": 16777215,
  "rarityUncommonColor": 16777045,
  "rarityRareColor": 5636095,
  "rarityEpicColor": 16733695,
  "rarityLegendaryColor": 16755200,
  "rarityMythicColor": 13391359,
  "rarityDivineColor": 5636044,
  "rarityEternalColor": 5592405,
  "raritySpecialColor": 16733525,
  "rarityAdminColor": 11141120,
  "displayRarityInTooltip": true
}
```
