colors = {"manual color": "Yellow",
"approved_color": "Green",
"Refused_color" : "Red"}

print (colors.get('approved_color'))
print (colors['Refused_color'])

colors['approved_color']="Purple"

print(colors)